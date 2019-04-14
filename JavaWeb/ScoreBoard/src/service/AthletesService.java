package service;

import java.util.List;

import viewobject.AthletesViw;
import viewobject.AthletesViwForMatchProject;
import viewobject.TeamViw;
/**
 * 运动员相关操作外部接口
 * @author Misaki
 *
 */
public interface AthletesService {
	/**
	 * 根据学院查看运动员信息
	 * @return 运动员视图表
	 */
	public List<AthletesViw> getAthletesByCollege(int college);
	/**
	 * 根据比赛项目查找运动员
	 * @param matchName 比赛项目
	 * @return 运动员视图表
	 */
	public List<AthletesViwForMatchProject> queryAthletesListByMatchProject(String matchName);
	/**
	 * 根据学院查看团体信息
	 * @return
	 */
	public List<TeamViw> getTeamByCollege(int college);
	/**
	 * 添加运动员
	 * @param stuNum 学号
	 * @param name 姓名
	 * @param sex 性别
	 * @param collegeId 学院编号
	 */
	public void insertAthletes(String stuNum, String name, String sex, int collegeId, String className);
	/**
	 * 添加团体
	 * @param name 团体名称
	 * @param sex 团体性别
	 * @param collegeId 学院编号
	 */
	public void insertTeam(String name, String sex, int collegeId);
	/**
	 * 根据学号删除运动员
	 * @param stuNum 学号
	 */
	public void deleteAthletesByStuNum(String stuNum);
	/**
	 * 根据姓名删除运动员
	 * @param stuNum 学号
	 */
	public void deleteAthletesByName(String name);
}
