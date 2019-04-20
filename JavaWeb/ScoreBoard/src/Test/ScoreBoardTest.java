package Test;

import java.util.List;

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
import viewobject.TeamViw;
import viewobject.UserViw;

public class ScoreBoardTest {
	public static void main(String[] args) throws BusinessException {
		
//		MatchProjectServiceImpl matchProjectServiceImpl = new MatchProjectServiceImpl();
//		List<MatchProjectViw> matchProjectViw = matchProjectServiceImpl.queryMatchProjectList();
//		for(MatchProjectViw e : matchProjectViw) {
//			System.out.println(e.getName() + "\t" + e.getTime());
//		}
		CollegeServiceImpl collegeServiceImpl = new CollegeServiceImpl();
		CollegePoint[] collegePoint = collegeServiceImpl.getAllCollegePoint2();
		for(int i = 0; i < collegePoint.length; i++) {
			System.out.println(collegePoint[i].getCollegeName() + "\t" + collegePoint[i].getGold() + "\t" + collegePoint[i].getTotal());
		}
	}
}