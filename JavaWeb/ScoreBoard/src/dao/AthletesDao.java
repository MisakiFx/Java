package dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import bean.Athletes;
import bean.College;
import bean.MatchProject;
import db.DBAccess;

/**
 * 运动员表数据库操作
 * @author Misaki
 *
 */
public class AthletesDao {
	/**
	 *  查找所有运动员
	 * @return 返回整张运动员表（团体个人）
	 */
	public List<Athletes> queryAthletesList() {
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		List<Athletes> athletesList = new ArrayList<Athletes>();
		try {
			//sql通过自己的封装拿到数据库连接
			sqlSession = dbAccess.getSqlSession();
			athletesList = sqlSession.selectList("Athletes.queryAthletesList");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return athletesList;
	}
	/**
	 * 根据比赛项目查找运动员
	 * @param name 比赛项目
	 * @return 运动员表
	 */
	public List<Athletes> queryAthletesListByMatchProject(String name) {
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		List<Athletes> athletesList = new ArrayList<Athletes>();
		try {
			//sql通过自己的封装拿到数据库连接
			MatchProject matchProject = new MatchProject();
			matchProject.setName(name);
			sqlSession = dbAccess.getSqlSession();
			athletesList = sqlSession.selectList("Athletes.queryAthletesListByMatchProject", matchProject);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return athletesList;
	}
	/**
	 * 添加运动员信息
	 * @param name 运动员 姓名
	 * @param sex 运动员性别
	 * @param collegeId 学院编号
	 * @param isTeam 团体/个人
	 */
	public void insertAthletes(String stuNum, String name, String sex, int collegeId, String className,int isTeam) {
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		try {
			sqlSession = dbAccess.getSqlSession();
			Athletes athletes = new Athletes();
			athletes.setStuNum(stuNum);
			athletes.setName(name);
			athletes.setSex(sex);
			athletes.setCollegeId(collegeId);
			athletes.setClassName(className);
			athletes.setIsTeam(isTeam);
			sqlSession.insert("Athletes.insertAthletes", athletes);
			sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
	}
	/**
	 * 根据学号删除运动员
	 */
	public void deleteAthletesByStuNum(String stuNum) {
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		try {
			sqlSession = dbAccess.getSqlSession();
			Athletes athletes = new Athletes();
			athletes.setStuNum(stuNum);
			sqlSession.delete("Athletes.deleteAthletesByStuNum", athletes);
			sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
	}
	/**
	 * 根据姓名删除运动员（团体）
	 */
		public void deleteAthletesByName(String name) {
			DBAccess dbAccess = new DBAccess();
			SqlSession sqlSession = null;
			try {
				sqlSession = dbAccess.getSqlSession();
				Athletes athletes = new Athletes();
				athletes.setName(name);
				sqlSession.delete("Athletes.deleteAthletesByName", athletes);
				sqlSession.commit();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if(sqlSession != null) {
					sqlSession.close();
				}
			}
		}
}
