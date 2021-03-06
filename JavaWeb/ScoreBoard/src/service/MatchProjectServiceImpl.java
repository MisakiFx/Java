package service;

import java.util.ArrayList;
import java.util.List;

import bean.MatchProject;
import dao.MatchProjectDao;
import error.BusinessException;
import error.EmBusinessError;
import viewobject.MatchProjectViw;
/**
 * 比赛项目相关操作接口
 * @author Misaki
 *
 */
public class MatchProjectServiceImpl implements MatchProjectService {
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
		/**
		 * 根据比赛名称修改比赛
		 * @param name 新比赛名称
		 * @param type 比赛类型
		 * @param time 比赛类型
		 * @param oldName 旧的比赛名称
		 */
		public void updateMatchProjectByName(String name, int type, String time, String oldName) {
			if(name == null || "".equals(name.trim())) {
				return;
			}
			if(time == null || "".equals(time.trim())) {
				return;
			}
			if(oldName == null || "".equals(oldName.trim())) {
				return;
			}
			MatchProjectDao matchProjectDao = new MatchProjectDao();
			matchProjectDao.updateMatchProjectByName(name, type, time, oldName);
		}
		/**
		 * 查询所有比赛项目
		 * @return 比赛项目集合(名称，类型，时间)
		 * @throws BusinessException 
		 */
		public List<MatchProjectViw> queryMatchProjectList() throws BusinessException {
			MatchProjectDao matchProjectDao = new MatchProjectDao();
			List<MatchProject> matchProject = matchProjectDao.queryMatchProjectList();
			if(matchProject.isEmpty()) {
				throw new BusinessException(EmBusinessError.UNKNOWN_ERROR,"未找到相关信息");
			}
			List<MatchProjectViw> matchProjectViwList = new ArrayList<MatchProjectViw>();
			for(int i = 0; i < matchProject.size(); i++) {
				MatchProjectViw matchProjectViw = new MatchProjectViw();
				matchProjectViw.setName(matchProject.get(i).getName());
				if(matchProject.get(i).getType() == 0) {
					matchProjectViw.setType("个人赛");
				} else {
					matchProjectViw.setType("团体赛");
				}
				matchProjectViw.setTime(matchProject.get(i).getTime());
				matchProjectViwList.add(matchProjectViw);
			}
			if(matchProjectViwList.isEmpty()) {
				return null;
			}
			return matchProjectViwList;
		}
		/**
		 * 查询所有个人比赛项目
		 * @return 比赛项目集合(名称，类型，时间)
		 * @throws BusinessException 
		 */
		public List<MatchProjectViw> queryIndividualMatchProjectList() throws BusinessException {
			MatchProjectDao matchProjectDao = new MatchProjectDao();
			List<MatchProject> matchProject = matchProjectDao.queryMatchProjectList();
			if(matchProject == null) {
				throw new BusinessException(EmBusinessError.UNKNOWN_ERROR,"未找到相关信息");
			}
			List<MatchProjectViw> matchProjectViwList = new ArrayList<MatchProjectViw>();
			for(int i = 0; i < matchProject.size(); i++) {
				if(matchProject.get(i).getType() == 0) {
					MatchProjectViw matchProjectViw = new MatchProjectViw();
					matchProjectViw.setName(matchProject.get(i).getName());
					matchProjectViw.setType("个人赛");
					matchProjectViw.setTime(matchProject.get(i).getTime());
					matchProjectViwList.add(matchProjectViw);
				}
			}
			if(matchProjectViwList.isEmpty()) {
				return null;
			}
			return matchProjectViwList;
		}
		/**
		 * 查询所有团体比赛项目
		 * @return 比赛项目集合(名称，类型，时间)
		 * @throws BusinessException 
		 */
		public List<MatchProjectViw> queryTeamlMatchProjectList() throws BusinessException {
			MatchProjectDao matchProjectDao = new MatchProjectDao();
			List<MatchProject> matchProject = matchProjectDao.queryMatchProjectList();
			if(matchProject == null) {
				throw new BusinessException(EmBusinessError.UNKNOWN_ERROR,"未找到相关信息");
			}
			List<MatchProjectViw> matchProjectViwList = new ArrayList<MatchProjectViw>();
			for(int i = 0; i < matchProject.size(); i++) {
				if(matchProject.get(i).getType() == 1) {
					MatchProjectViw matchProjectViw = new MatchProjectViw();
					matchProjectViw.setName(matchProject.get(i).getName());
					matchProjectViw.setType("团体赛");
					matchProjectViw.setTime(matchProject.get(i).getTime());
					matchProjectViwList.add(matchProjectViw);
				}
			}
			if(matchProjectViwList.isEmpty()) {
				return null;
			}
			return matchProjectViwList;
		}
}
