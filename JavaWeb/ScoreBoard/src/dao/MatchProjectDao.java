package dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import bean.College;
import bean.MatchProject;
import db.DBAccess;

/**
 * 比赛项目表数据库操作
 * @author Misaki
 *
 */
public class MatchProjectDao {
	/**
	 * 插入比赛项目
	 * @param name 比赛项目名称
	 * @param type 比赛项目类型
	 * @param time 比赛时间
	 */
	public void insertMatchProject(String name, int type, String time) {
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		try {
			sqlSession = dbAccess.getSqlSession();
			MatchProject matchProject = new MatchProject();
			matchProject.setName(name);
			matchProject.setType(type);
			matchProject.setTime(time);
			sqlSession.insert("MatchProject.insertMatchProject", matchProject);
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
	 * 根据比赛名称删除比赛项目
	 * @param name
	 */
	public void deleteMatchProjectByName(String name) {
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		try {
			sqlSession = dbAccess.getSqlSession();
			MatchProject matchProject = new MatchProject();
			matchProject.setName(name);
			sqlSession.delete("MatchProject.deleteMatchProjectByName", matchProject);
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
