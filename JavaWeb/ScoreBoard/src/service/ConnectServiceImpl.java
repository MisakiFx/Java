package service;

import bean.Athletes;
import bean.Connect;
import bean.MatchProject;
import dao.AthletesDao;
import dao.ConnectDao;
import dao.MatchProjectDao;

/**
 * 连接表对应接口实现
 * @author Misaki
 *
 */
public class ConnectServiceImpl implements ConnectService{
	/**
	 * 插入连接表信息（运动员id, 学院id, 比赛项目id）
	 * @param type
	 * @param message
	 * @param matchProject
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
}
