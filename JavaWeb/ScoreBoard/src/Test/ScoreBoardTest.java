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
import service.AthletesServiceImpl;
import service.CollegeServiceImpl;
import service.ConnectServiceImpl;
import service.MatchProjectServiceImpl;
import viewobject.AthletesViw;
import viewobject.AthletesViwForMatchProject;
import viewobject.CollegePoint;
import viewobject.MatchProjectViw;
import viewobject.MatchRank;
import viewobject.TeamViw;

public class ScoreBoardTest {
	public static void main(String[] args) {
		
//		ConnectDao connectDao = new ConnectDao();
//		List<MedalNum> medalNum = connectDao.queryCopperNumList();
//		for(MedalNum num : medalNum) {
//			System.out.println(num.getCollegeId() + "\t" + num.getNum());
//		}
//		CollegeService collegeService = new CollegeService();
//		CollegePoint collegePoint = collegeService.getCollegePoint2("电子信息与人工智能学院");
//		
//		System.out.println(collegePoint.getCollegeId() + "\t" + collegePoint.getCollegeName() + "\t" + collegePoint.getGold() + "\t" + collegePoint.getSilver() + "\t" + collegePoint.getCopper() + "\t" + collegePoint.getTotal());
//		CollegeDao collegeDao = new CollegeDao();
//		List<College> collegeList = collegeDao.queryCollegeList();
//		for(int i = 0; i < 13; i++) {
//			System.out.println(collegeList.get(i).getId() + "\t"+ collegeList.get(i).getName());
//		}
//		AthletesDao athletesDao = new AthletesDao();
//		List<Athletes> athletes = athletesDao.queryAthletesList();
//		for(Athletes a : athletes) {
//			System.out.println(a.getId() + "\t" + a.getName());
//		}
//		AthletesService athleteService = new AthletesService();
//		List<AthletesViw> athletesViwList = athleteService.getAthletesByCollege(1);
//		for(AthletesViw athlete : athletesViwList) {
//			System.out.println(athlete.getId() + "\t" + athlete.getName() + "\t" + athlete.getSex());
//		}
//		MatchProjectDao matchProjectDao = new MatchProjectDao();
//		matchProjectDao.insertMatchProject("女子800米", 0, "2019-4-12 18:22:00");
//		CollegeService collegeService = new CollegeService();
//		collegeService.insertMatchProject("女子800米", 0, "2019-4-12 18:22:00");
//		CollegeService collegeService = new CollegeService();
//		collegeService.deleteMatchProjectByName("女子800米");
//		AthletesService athletesService = new AthletesService();
//		athletesService.deleteAthletesByName("计算机186");
//		AthletesService athletesService = new AthletesService();
//		List<TeamViw> teamViw = new ArrayList<TeamViw>();
//		teamViw = athletesService.getTeamByCollege(1);
//		for(TeamViw e : teamViw) {
//			System.out.println(e.getName() + "\t" + e.getSex() + "\t" );
//		}
//		AthletesServiceImpl athletesService = new AthletesServiceImpl();
//		List<AthletesViwForMatchProject> athletesViwForMatchProject = athletesService.queryAthletesListByMatchProject("男子400米");
//		for(AthletesViwForMatchProject e : athletesViwForMatchProject) {
//			System.out.println(e);
//		}
//		AthletesServiceImpl athletesService = new AthletesServiceImpl();
//		athletesService.updateAthletesByStuNum("201706060322", "刘志杰", "男", 1, "计算机173", "201706060334");
//		athletesService.updateTeamsByName("计算机172", "男", 1, "计算机173");
//		MatchProjectServiceImpl matchProjectServiceImpl = new MatchProjectServiceImpl();
//		matchProjectServiceImpl.updateMatchProjectByName("男子4000米", 0, "2019-4-15 1:24:00", "男子400米");
//		MatchProjectServiceImpl matchProjectServiceImpl = new MatchProjectServiceImpl();
//		List<MatchProjectViw> matchProjectViw = matchProjectServiceImpl.queryTeamlMatchProjectList();
//		for(MatchProjectViw e : matchProjectViw) {
//			System.out.println(e.getName() + "\t" + e.getType() + "\t" + e.getTime() + "\t");
//		}
//		AthletesDao athletesDao = new AthletesDao();
//		Athletes athlete = athletesDao.queryTeamByName("计算机172");
//		System.out.println(athlete.getName() + "\t" + athlete.getId() + "\t" + athlete.getCollegeId());
//		MatchProjectDao matchProjectDao = new MatchProjectDao();
//		MatchProject matchproject = matchProjectDao.queryMatchProjectByName("男子4000米");
//		System.out.println(matchproject.getName() + "\t" + matchproject.getId());
//		ConnectServiceImpl connectServiceImpl = new ConnectServiceImpl();
//		connectServiceImpl.insertConnect(0, "201706060322", "团体400米接力");
		ConnectServiceImpl connectServiceImpl = new ConnectServiceImpl();
		AthletesServiceImpl athletesServiceImpl = new AthletesServiceImpl();
		athletesServiceImpl.updateAthletesByStuNum("201706060325", "庞金龙", "男", 1, "电气182", "201706060325");
		List<MatchRank> matchRank = connectServiceImpl.queryRank("男子4000米");
		for(MatchRank e : matchRank) {
			System.out.println(e.getName() + "\t" + e.getClassName() + "\t" + e.getRank() + "\t" + e.getGrade());
		}
	}
}

