package service;

import java.util.List;

import bean.College;
import bean.Connect;
import bean.MedalNum;
import dao.CollegeDao;
import dao.ConnectDao;
import dao.MatchProjectDao;
import error.BusinessException;
import error.EmBusinessError;

/**
 * 学院相关操作外部接口
 * @author Misaki
 *
 */

import viewobject.CollegePoint;
public class CollegeServiceImpl implements CollegeService{
	private final int COLLEGECOUNT = 14;
	/**
	 * 查询所有学院得分情况及奖牌数量
	 * @return 返回所有学院得分情况数组
	 * @throws BusinessException 
	 */
	public CollegePoint[] getAllCollegePoint() throws BusinessException {
		//创建十三个学院的分数类数组
		CollegePoint[] collegePoint = new CollegePoint[COLLEGECOUNT];
		//查出成绩表
		ConnectDao connectDao = new ConnectDao();
		List<Connect> connectList = connectDao.queryConnectList();
		if (connectList == null) {
			throw new BusinessException(EmBusinessError.UNKNOWN_ERROR,"未找到相关信息");
		}
		//查出学院表
		CollegeDao collegeDao = new CollegeDao();
		List<College> collegeList = collegeDao.queryCollegeList();
		if (connectList == null) {
			throw new BusinessException(EmBusinessError.UNKNOWN_ERROR,"未找到相关信息");
		}
		//建立分数信息数组
		int numOfGold[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int numOfSilver[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int numOfCopper[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		//遍历统计各学院
		for(Connect connect : connectList) {
			if(connect != null && connect.getRank() == 1)
			{
				numOfGold[connect.getCollegeId() - 1] += 1;
			}
			else if(connect != null && connect.getRank() == 2)
			{
				numOfSilver[connect.getCollegeId() - 1] += 1;
			}
			else if(connect != null && connect.getRank() == 3)
			{
				numOfCopper[connect.getCollegeId() - 1] += 1;
			}
		}
		//向分数类数组的每一个对象赋值
		for(int i = 0; i < COLLEGECOUNT; i++) {
			collegePoint[i] = new CollegePoint();
			collegePoint[i].setCollegeId(collegeList.get(i).getId());
			collegePoint[i].setCollegeName(collegeList.get(i).getName());
			collegePoint[i].setGold(numOfGold[i]);
			collegePoint[i].setSilver(numOfSilver[i]);
			collegePoint[i].setCopper(numOfCopper[i]);
			collegePoint[i].setTotal();
		}
		if(collegePoint.length == 0) {
			return null;
		}
		return collegePoint;
	}
	/**
	 * 
	 * @param college 学院名称
	 * @return 某个学院的得分及奖牌数
	 * @throws BusinessException 
	 */
	public CollegePoint getCollegePoint(String college) throws BusinessException {
		CollegeServiceImpl collegeService = new CollegeServiceImpl();
		CollegePoint[] collegePoint = collegeService.getAllCollegePoint();
		if(collegePoint.length == 0) {
			throw new BusinessException(EmBusinessError.UNKNOWN_ERROR,"未找到相关信息");
		}
		int i = 0;
		for(; i < COLLEGECOUNT; i++) {
			if(collegePoint[i].getCollegeName().equals(college) == true) {
				break;
			}
		}
		return collegePoint[i];
	}
	/**
	 * 查询所有学院得分情况及奖牌数量
	 * @return 返回所有学院得分情况数组
	 * @throws BusinessException 
	 */
	public CollegePoint[] getAllCollegePoint2() throws BusinessException {
		//创建十四个学院的分数类数组
		CollegePoint[] collegePoint = new CollegePoint[COLLEGECOUNT];
		ConnectDao connectDao = new ConnectDao();
		//拿到各学院金银铜牌总数表
		List<MedalNum> goldNumList = connectDao.queryGoldNumList();
		List<MedalNum> silverNumList = connectDao.querySilverNumList();
		List<MedalNum> copperNumList = connectDao.queryCopperNumList();
		//查出学院表
		CollegeDao collegeDao = new CollegeDao();
		List<College> collegeList = collegeDao.queryCollegeList();
		if (collegeList == null) {
			throw new BusinessException(EmBusinessError.UNKNOWN_ERROR,"未找到相关信息");
		}
		//建立分数信息数组
		int numOfGold[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int numOfSilver[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int numOfCopper[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		//将金银铜表表导入分数信息数组
		if(goldNumList != null) {
			for(MedalNum num : goldNumList) {
				numOfGold[num.getCollegeId() - 1] = num.getNum();
			}
		}
		if(silverNumList != null) {
			for(MedalNum num : silverNumList) {
				numOfSilver[num.getCollegeId() - 1] = num.getNum();
			}
		}
		if(copperNumList != null) {
			for(MedalNum num : copperNumList) {
				numOfCopper[num.getCollegeId() - 1] = num.getNum();
			}
		}
		//向分数类数组的每一个对象赋值
		for(int i = 0; i < COLLEGECOUNT; i++) {
			collegePoint[i] = new CollegePoint();
			collegePoint[i].setCollegeId(collegeList.get(i).getId());
			collegePoint[i].setCollegeName(collegeList.get(i).getName());
			collegePoint[i].setGold(numOfGold[i]);
			collegePoint[i].setSilver(numOfSilver[i]);
			collegePoint[i].setCopper(numOfCopper[i]);
			collegePoint[i].setTotal();
		}
		if(collegePoint.length == 0) {
			return null;
		}
		return collegePoint;
	}
	/**
	 * 
	 * @param college 学院名称
	 * @return 某个学院的得分及奖牌数
	 * @throws BusinessException 
	 */
	public CollegePoint getCollegePoint2(String college) throws BusinessException {
		CollegeServiceImpl collegeService = new CollegeServiceImpl();
		CollegePoint[] collegePoint = collegeService.getAllCollegePoint();
		if(collegePoint.length == 0) {
			throw new BusinessException(EmBusinessError.UNKNOWN_ERROR,"未找到相关信息");
		}
		int i = 0;
		for(; i < COLLEGECOUNT; i++) {
			if(collegePoint[i].getCollegeName().equals(college) == true) {
				break;
			}
		}
		return collegePoint[i];
	}
}
