package dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import bean.Connect;
import bean.MedalNum;
import db.DBAccess;

/**
 * 连接表数据库操作
 * @author Misaki
 *
 */
public class ConnectDao {
	/**
	 *  查询connect表所有信息
	 */
	public List<Connect> queryConnectList() {
		//连接数据库操作对象
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		List<Connect> connectList = new ArrayList<Connect>();
		try {
			sqlSession = dbAccess.getSqlSession();
			connectList = sqlSession.selectList("Connect.queryConnectList");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return connectList;
	}
	/**
	 *  查询各学院金牌数量情况
	 */
	public List<MedalNum> queryGoldNumList() {
		//连接数据库操作对象
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		List<MedalNum> connectList = new ArrayList<MedalNum>();
		try {
			sqlSession = dbAccess.getSqlSession();
			connectList = sqlSession.selectList("Connect.queryGoldNumList");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return connectList;
	}
	/**
	 *  查询各学院银牌数量情况
	 */
	public List<MedalNum> querySilverNumList() {
		//连接数据库操作对象
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		List<MedalNum> connectList = new ArrayList<MedalNum>();
		try {
			sqlSession = dbAccess.getSqlSession();
			connectList = sqlSession.selectList("Connect.querySilverNumList");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return connectList;
	}
	/**
	 *  查询各学院铜牌数量情况
	 */
	public List<MedalNum> queryCopperNumList() {
		//连接数据库操作对象
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		List<MedalNum> connectList = new ArrayList<MedalNum>();
		try {
			sqlSession = dbAccess.getSqlSession();
			connectList = sqlSession.selectList("Connect.queryCopperNumList");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return connectList;
	}
}
