package service;

import java.util.ArrayList;
import java.util.List;

import bean.Athletes;
import bean.Connect;
import bean.MatchProject;
import dao.AthletesDao;
import dao.ConnectDao;
import dao.MatchProjectDao;
import error.BusinessException;
import error.EmBusinessError;
import viewobject.MatchRank;

/**
 * 连接表对应接口实现
 * @author Misaki
 *
 */
public class ConnectServiceImpl implements ConnectService{
	/**
	 * 插入连接表信息（运动员id, 学院id, 比赛项目id）
	 * @param type 比赛类型（个人/团体）
	 * @param message 运动员信息，个人则是学号，团体则是名称
	 * @param matchProject 比赛项目名称
	 */
	public void insertConnect(int type, String message, String matchProjectName) {
		if(message == null || "".equals(message.trim())) {
			return;
		}
		if(matchProjectName == null || "".equals(matchProjectName.trim())) {
			return;
		}
		//查到对应的运动员/团体信息
		AthletesDao athletesDao = new AthletesDao();
		Athletes athlete = new Athletes();
		if(type == 0) {
			athlete = athletesDao.queryAthleteByStuNum(message);
		} else if(type == 1) {
			athlete = athletesDao.queryTeamByName(message);
		} else {
			return;
		}
		//找到对应比赛项目信息
		MatchProjectDao matchProjectDao = new MatchProjectDao();
		MatchProject matchProject = matchProjectDao.queryMatchProjectByName(matchProjectName);
		ConnectDao connectDao = new ConnectDao();
		connectDao.insertConnect(athlete.getId(), athlete.getCollegeId(), matchProject.getId());
	}
	/**
	 * 修改连接表信息
	 * @param type 类型，个人/团体
	 * @param message 信息，个人则是学号，团体则是名称
	 * @param matchProjectName 比赛项目名称 
	 * @param rank 排名
	 * @param grade 成绩
	 * @param oldMessage 旧的运动员信息，个人则是学号，团体则是名称
	 * @param oldMatchProjectName 旧的比赛项目名称
	 */
	public void updateConnect(int type, String message, String matchProjectName, int rank, String grade, String oldMessage, String oldMatchProjectName) {
		if(message == null || "".equals(message.trim())) {
			return;
		}
		if(matchProjectName == null || "".equals(matchProjectName.trim())) {
			return;
		}
		if(grade == null || "".equals(grade.trim())) {
			return;
		}
		if(oldMessage == null || "".equals(oldMessage.trim())) {
			return;
		}
		if(oldMatchProjectName == null || "".equals(oldMatchProjectName.trim())) {
			return;
		}
		//找到新旧的运动员信息
		AthletesDao athletesDao = new AthletesDao();
		Athletes athlete = new Athletes();//新的运动员信息
		Athletes oldAthlete = new Athletes();
		if(type == 0) {
			athlete = athletesDao.queryAthleteByStuNum(message);
			oldAthlete = athletesDao.queryAthleteByStuNum(oldMessage);
		} else if(type == 1) {
			athlete = athletesDao.queryTeamByName(message);
			oldAthlete = athletesDao.queryTeamByName(oldMessage);
		} else {
			return;
		}
		MatchProjectDao matchProjectDao = new MatchProjectDao();
		MatchProject matchProject = matchProjectDao.queryMatchProjectByName(matchProjectName);
		MatchProject oldMatchProject = matchProjectDao.queryMatchProjectByName(oldMatchProjectName);
		ConnectDao connectDao = new ConnectDao();
		connectDao.updateConnect(athlete.getId(), athlete.getCollegeId(), matchProject.getId(), rank, grade, oldAthlete.getId(), oldMatchProject.getId());
	}
	/**
	 * 插入比赛成绩(名次和成绩)
	 * @param type 比赛类型
	 * @param message 信息，个人则是学号，团体则是名称
	 * @param matchProjectName 比赛
	 * @param rank 名次 
	 * @param grade 成绩
	 */
	public void insertGrade(int type, String message, String matchProjectName, int rank, String grade) {
		if(message == null || "".equals(message.trim())) {
			return;
		}
		if(matchProjectName == null || "".equals(matchProjectName.trim())) {
			return;
		}
		if(grade == null || "".equals(grade.trim())) {
			return;
		}
		//找到运动员信息
		AthletesDao athletesDao = new AthletesDao();
		Athletes athlete = new Athletes();//运动员信息
		if(type == 0) {
			athlete = athletesDao.queryAthleteByStuNum(message);
		} else if(type == 1) {
			athlete = athletesDao.queryTeamByName(message);
		} else {
			return;
		}
		MatchProjectDao matchProjectDao = new MatchProjectDao();
		MatchProject matchProject = matchProjectDao.queryMatchProjectByName(matchProjectName);
		ConnectDao connectDao = new ConnectDao();
		connectDao.updateConnect(athlete.getId(), athlete.getCollegeId(), matchProject.getId(), rank, grade, athlete.getId(), matchProject.getId());
	}
	/**
	 * 查询比赛排名
	 * @param matchProjectId 比赛项目编号
	 * @return 连接表集合
	 * @throws BusinessException 
	 */
	public List<MatchRank> queryRank(String matchProjectName) throws BusinessException {
		if(matchProjectName == null || "".equals(matchProjectName.trim())) {
			return null;
		}
		ConnectDao connectDao = new ConnectDao();
		MatchProjectDao matchProjectDao = new MatchProjectDao();
		AthletesDao athletesDao = new AthletesDao();
		//查询对应比赛信息拿到比赛编号
		MatchProject matchProject = matchProjectDao.queryMatchProjectByName(matchProjectName);
		//查询对应比赛编号的所有运动员比赛成绩
		List<Connect> connect = new ArrayList<Connect>();
		//拿到所有运动员信息
		List<Athletes> athletesList = new ArrayList<Athletes>();
		athletesList = athletesDao.queryAthletesList();
		connect = connectDao.queryRank(matchProject.getId());
		if(matchProject == null || connect.isEmpty() || athletesList.isEmpty()) {
			throw new BusinessException(EmBusinessError.UNKNOWN_ERROR,"未找到相关信息");
		}
		List<MatchRank> matchRankList = new ArrayList<MatchRank>();
		for(Connect connecttemp : connect) {
			MatchRank matchRank = new MatchRank();
			//根据运动员编号查出运动员信息
			for(Athletes athlete : athletesList) {
				if(athlete.getId() == connecttemp.getAthletesId()) {
					//找到了赋值
					matchRank.setName(athlete.getName());
					matchRank.setClassName(athlete.getClassName());
				}
			}
			matchRank.setRank(connecttemp.getRank());
			matchRank.setGrade(connecttemp.getGrade());
			matchRankList.add(matchRank);
			}
		if(matchRankList.isEmpty()) {
			return null;
		}
		return matchRankList;
	}
}
