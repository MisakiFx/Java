package service;

import java.util.ArrayList;
import java.util.List;

import bean.Athletes;
import bean.College;
import dao.AthletesDao;
import dao.CollegeDao;
import dao.MatchProjectDao;
import viewobject.AthletesViw;
import viewobject.AthletesViwForMatchProject;
import viewobject.TeamViw;

/**
 * 运动员相关操作外部接口
 * @author Misaki
 *
 */
public class AthletesServiceImpl implements AthletesService{
	/**
	 * 根据学院查看运动员信息
	 * @return 运动员视图表
	 */
	public List<AthletesViw> getAthletesByCollege(int college) {
		AthletesDao athletesDao = new AthletesDao();
		List<Athletes> athletes = athletesDao.queryAthletesList();
		List<AthletesViw> athletesViw = new ArrayList<AthletesViw>();
		for(Athletes athlete : athletes) {
			if(athlete.getCollegeId() == college && athlete.getIsTeam() == 0) {
				AthletesViw athleteViw = new AthletesViw();
				athleteViw.setId(athlete.getId());
				athleteViw.setStuNum(athlete.getStuNum());
				athleteViw.setName(athlete.getName());
				athleteViw.setClassName(athlete.getName());
				athleteViw.setSex(athlete.getSex());
				athletesViw.add(athleteViw);
			}
		}
		return athletesViw;
	}
	/**
	 * 根据比赛项目查找运动员
	 * @param matchName 比赛项目
	 * @return 运动员视图表
	 */
	public List<AthletesViwForMatchProject> queryAthletesListByMatchProject(String matchName) {
		AthletesDao athletesDao = new AthletesDao();
		CollegeDao collegeDao = new CollegeDao();
		//拿到对应比赛的所有运动员信息表
		List<Athletes> athletes = athletesDao.queryAthletesListByMatchProject(matchName);
		List<College> colleges = collegeDao.queryCollegeList();
		List<AthletesViwForMatchProject> athletesViwForMatchProject = new ArrayList<AthletesViwForMatchProject>();
		//信息录入运动员视图表
		for(Athletes athlete : athletes) {
			AthletesViwForMatchProject athleteViwForMatchProject = new AthletesViwForMatchProject();
			athleteViwForMatchProject.setId(athlete.getId());
			athleteViwForMatchProject.setStuNum(athlete.getStuNum());
			athleteViwForMatchProject.setName(athlete.getName());
			athleteViwForMatchProject.setSex(athlete.getSex());
			athleteViwForMatchProject.setClassName(athlete.getClassName());
			athleteViwForMatchProject.setCollege(colleges.get(athlete.getCollegeId() - 1).getName());
			athletesViwForMatchProject.add(athleteViwForMatchProject);
		}
		return athletesViwForMatchProject;
	}
	/**
	 * 根据学院查看团体信息
	 * @return
	 */
	public List<TeamViw> getTeamByCollege(int college) {
		AthletesDao athletesDao = new AthletesDao();
		List<Athletes> athletes = athletesDao.queryAthletesList();
		List<TeamViw> teamViw = new ArrayList<TeamViw>();
		for(Athletes team : athletes) {
			if(team.getCollegeId() == college && team.getIsTeam() == 1) {
				TeamViw teamViwt = new TeamViw();
				teamViwt.setId(team.getId());
				teamViwt.setName(team.getName());
				teamViwt.setSex(team.getSex());
				teamViw.add(teamViwt);
			}
		}
		return teamViw;
	}
	/**
	 * 添加运动员
	 * @param stuNum 学号
	 * @param name 姓名
	 * @param sex 性别
	 * @param collegeId 学院编号
	 */
	public void insertAthletes(String stuNum, String name, String sex, int collegeId, String className) {
		if(name == null || "".equals(name.trim())) {
			return;
		}
		if(sex == null || "".equals(sex.trim())) {
			return;
		}
		if(stuNum == null || "".equals(stuNum.trim())) {
			return;
		}
		AthletesDao athletesDao = new AthletesDao();
		athletesDao.insertAthletes(stuNum, name, sex, collegeId, className, 0);
	}
	/**
	 * 添加团体
	 * @param name 团体名称
	 * @param sex 团体性别
	 * @param collegeId 学院编号
	 */
	public void insertTeam(String name, String sex, int collegeId) {
		if(name == null || "".equals(name.trim())) {
			return;
		}
		if(sex == null || "".equals(sex.trim())) {
			return;
		}
		AthletesDao athletesDao = new AthletesDao();
		athletesDao.insertAthletes("0", name, sex, collegeId, "NULL", 0);
	}
	/**
	 * 根据学号删除运动员
	 * @param stuNum 学号
	 */
	public void deleteAthletesByStuNum(String stuNum) {
		if(stuNum == null || "".equals(stuNum.trim())) {
			return;
		}
		AthletesDao athletesDao = new AthletesDao();
		athletesDao.deleteAthletesByStuNum(stuNum);
	}
	/**
	 * 根据姓名删除运动员
	 * @param stuNum 学号
	 */
	public void deleteAthletesByName(String name) {
		if(name == null || "".equals(name.trim())) {
			return;
		}
		AthletesDao athletesDao = new AthletesDao();
		athletesDao.deleteAthletesByName(name);
	}
}
