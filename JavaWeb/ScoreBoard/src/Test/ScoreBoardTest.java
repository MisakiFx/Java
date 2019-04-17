package Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import bean.Athletes;
import bean.College;
import bean.Connect;
import bean.MatchProject;
import bean.MedalNum;
import dao.AthletesDao;
import dao.CollegeDao;
import dao.ConnectDao;
import dao.MatchProjectDao;
import db.DBAccess;
import error.BusinessException;
import service.AthletesServiceImpl;
import service.CollegeServiceImpl;
import service.ConnectServiceImpl;
import service.MatchProjectServiceImpl;
import service.UserServiceImpl;
import viewobject.AthletesViw;
import viewobject.AthletesViwForMatchProject;
import viewobject.CollegePoint;
import viewobject.MatchProjectViw;
import viewobject.MatchRank;
import viewobject.TeamViw;
import viewobject.UserViw;

public class ScoreBoardTest {
	public static void main(String[] args) throws BusinessException {
		
//		UserServiceImpl userServiceImpl = new UserServiceImpl();
//		List<UserViw> userViwList = userServiceImpl.queryUserList();
//		for(UserViw us : userViwList) {
//			System.out.println(us.getUserName() + "\t" + us.getPassword());
		int i=0;
//		}
	}
}