package Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import bean.Athletes;
import bean.College;
import bean.Connect;
import bean.MedalNum;
import dao.AthletesDao;
import dao.CollegeDao;
import dao.ConnectDao;
import dao.MatchProjectDao;
import db.DBAccess;
import service.AthletesService;
import service.CollegeService;
import viewobject.AthletesViw;
import viewobject.AthletesViwForMatchProject;
import viewobject.CollegePoint;
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
		AthletesService athletesService = new AthletesService();
		List<AthletesViwForMatchProject> athletesViwForMatchProject = athletesService.queryAthletesListByMatchProject("男子400米");
		for(AthletesViwForMatchProject e : athletesViwForMatchProject) {
			System.out.println(e.getId() + "\t" + e.getStuNum() + "\t" + e.getName() + "\t" + e.getSex() + "\t" + e.getCollege() + "\t" + e.getClassName());
		}
	}
}

