package service;
/**
 * 比赛项目相关操作接口
 * @author Misaki
 *
 */
public interface MatchProjectService {
	/**
	 * 插入比赛项目
	 * @param name 项目名称
	 * @param type 项目类型
	 * @param time 时间
	 */
	public void insertMatchProject(String name, int type, String time);
	/**
	 * 根据比赛名称删除比赛项目
	 * @param name 比赛名称
	 */
	public void deleteMatchProjectByName(String name);
}
