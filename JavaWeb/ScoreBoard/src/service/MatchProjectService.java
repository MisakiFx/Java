package service;

import dao.MatchProjectDao;
/**
 * 比赛项目相关操作接口
 * @author Misaki
 *
 */
public class MatchProjectService {
	/**
	 * 插入比赛项目
	 * @param name 项目名称
	 * @param type 项目类型
	 * @param time 时间
	 */
		public void insertMatchProject(String name, int type, String time) {
			if(name == null || "".equals(name.trim())) {
				return;
			}
			if(time == null || "".equals(time.trim())) {
				return;
			}
			MatchProjectDao matchProjectDao = new MatchProjectDao();
			matchProjectDao.insertMatchProject(name, type, time);
		}
	/**
	 * 根据比赛名称删除比赛项目
	 * @param name 比赛名称
	 */
		public void deleteMatchProjectByName(String name) {
			if(name == null || "".equals(name.trim())) {
				return;
			}
			MatchProjectDao matchProjectDao = new MatchProjectDao();
			matchProjectDao.deleteMatchProjectByName(name);
		}
}
