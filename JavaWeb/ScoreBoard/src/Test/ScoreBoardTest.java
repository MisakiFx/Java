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
		
//		UserServiceImpl userServiceImpl = new UserServiceImpl();
//		List<UserViw> userViwList = userServiceImpl.queryUserList();
//		for(UserViw us : userViwList) {
//			System.out.println(us.getUserName() + "\t" + us.getPassword());
		//int i=0;
//		}
		CollegeServiceImpl collegeServiceImpl = new CollegeServiceImpl();
		CollegePoint[] collegePoint= new CollegePoint[13];
		collegePoint = collegeServiceImpl.getAllCollegePoint();
		for(int i = 0 ; i < collegePoint.length; i++) {
			System.out.println(collegePoint[i].getCollegeId() + "\t" + collegePoint[i].getCollegeName() + "\t" + collegePoint[i].getGold() + "\t" + collegePoint[i].getSilver() + "\t" + collegePoint[i].getCopper() + "\t" + collegePoint[i].getTotal());
		}
//		AthletesServiceImpl athletesServiceImpl = new AthletesServiceImpl();
//		athletesServiceImpl.insertTeam("机电", "3", 5);
		//athletesServiceImpl.deleteAthletesByName("机电");
		//athletesServiceImpl.updateAthletesByStuNum("0105", "张三", "1", 7, "", "0105");
		//ConnectServiceImpl connectServiceImpl = new ConnectServiceImpl();
		//connectServiceImpl.insertConnect(0, "0102", "男子三级跳远 决赛");
		//connectServiceImpl.insertGrade(0, "0102", "男子三级跳远 决赛", 2, "123");
//		List<AthletesViw> athletesViw = athletesServiceImpl.getAthletesByCollege(7);
//		athletesServiceImpl.updateTeamsByName("电智", "3", 7, "机电");
//		List<TeamViw> teamViw = athletesServiceImpl.getTeamByCollege(5);
//		for(TeamViw e : teamViw) {
//			System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSex() );
//		}
//		for(AthletesViw e : athletesViw) {
//			System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSex() + "\t" + e.getStuNum());
//		}
		//List<TeamViw> teamViw = athletesServiceImpl.getTeamByCollege(7);
//		athletesServiceImpl.insertAthletes("0105","张三", "1", 1, "");
//		List<AthletesViwForMatchProject> athletesViwForMatchProject = athletesServiceImpl.queryAthletesListByMatchProject("男子三级跳远 决赛");
//		for(TeamViw e : teamViw) {
//			System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSex() );
//		}
//		ConnectServiceImpl connectServiceImpl = new ConnectServiceImpl();
//		connectServiceImpl.insertConnect(0, "0101", "男子三级跳远 决赛");
//		MatchProjectServiceImpl matchProjectServiceImpl = new MatchProjectServiceImpl();
//		List<MatchProjectViw> MatchProjectViw = matchProjectServiceImpl.queryMatchProjectList();
//		for(MatchProjectViw e : MatchProjectViw) {
//			System.out.println(e.getName() + "\t" + e.getType() + "\t" + e.getTime());
//		}
//		UserServiceImpl userServiceImpl = new UserServiceImpl();
//		List<UserViw> userViw = userServiceImpl.queryUserList();
//		for(UserViw e : userViw) {
//			System.out.println(e.getUserName() + "\t" + e.getPassword());
//		}
	}
}