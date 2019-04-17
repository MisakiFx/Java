package service;

import error.BusinessException;
import viewobject.CollegePoint;

/**
 * @author Misaki
* 查询学院相关接口
 */
public interface CollegeService {
	/**
	 * 查询所有学院得分情况及奖牌数量
	 * @return 返回所有学院得分情况数组
	 * @throws BusinessException 
	 */
	public CollegePoint[] getAllCollegePoint() throws BusinessException;
	/**
	 * 
	 * @param college 学院名称
	 * @return 某个学院的得分及奖牌数
	 * @throws BusinessException 
	 */
	public CollegePoint getCollegePoint(String college) throws BusinessException;
	/**
	 * 查询所有学院得分情况及奖牌数量
	 * @return 返回所有学院得分情况数组
	 * @throws BusinessException 
	 */
	public CollegePoint[] getAllCollegePoint2() throws BusinessException;
	/**
	 * 
	 * @param college 学院名称
	 * @return 某个学院的得分及奖牌数
	 * @throws BusinessException 
	 */
	public CollegePoint getCollegePoint2(String college) throws BusinessException;
}
