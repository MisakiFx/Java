package dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import bean.Athletes;
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
	/**
	 *  插入连接表比赛信息（哪个学院的运动员/团体参加了哪一场比赛）
	 * @param message 个人/团体信息：个人则时学号，团体则是团体名称
	 * @param type 类型，0个人，1团体
	 * @param matchProject 比赛名称
	 */
	public void insertConnect(int athletesId, int collegeId, int matchProjectId) {
		//连接数据库操作对象
				DBAccess dbAccess = new DBAccess();
				SqlSession sqlSession = null;
				Connect connect = new Connect();
				connect.setAthletesId(athletesId);
				connect.setCollege_id(collegeId);
				connect.setMatchProjectId(matchProjectId);
				try {
					sqlSession = dbAccess.getSqlSession();
					sqlSession.insert("Connect.insertConnect", connect);
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
