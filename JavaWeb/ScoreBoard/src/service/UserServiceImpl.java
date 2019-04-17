package service;

import java.util.ArrayList;
import java.util.List;

import bean.User;
import dao.UserDao;
import error.BusinessException;
import error.EmBusinessError;
import viewobject.UserViw;

/**
 * 用户表相关操作接口实现
 * @author Misaki
 *
 */
public class UserServiceImpl implements UserService {
	/**
	 * 查询管理员用户表
	 * @return 返回管理员用户表
	 * @throws BusinessException 用户不存在
	 */
	public List<UserViw> queryUserList() throws BusinessException {
		UserDao userDao = new UserDao();
		List<User> userList = userDao.queryUserList();
		if(userList.isEmpty() == true)
			throw new BusinessException(EmBusinessError.USER_NOT_EXIST);
		List<UserViw> userViwList = new ArrayList<UserViw>();
		for(User us : userList) {
			UserViw userViw = new UserViw();
			userViw.setUserName(us.getUserName());
			userViw.setPassword(us.getPassword());
			userViwList.add(userViw);
		}
		if(userViwList.isEmpty()) {
			return null;
		}
		return userViwList;
	}
}
