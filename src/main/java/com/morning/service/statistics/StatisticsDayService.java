package com.morning.service.statistics;

import java.util.Date;
import java.util.List;

import com.morning.entity.statistics.StatisticsDay;

/**
 * 
* 项目名称：morning Maven Webapp   
* 类名称：StatisticsDayService   
* 类描述：网站统计业务逻辑层接口
* 创建人：陈星星   
* 创建时间：2016年10月2日 上午3:55:03   
* 修改人：陈星星   
* 修改时间：2016年10月2日 上午3:55:03   
* 修改备注：   
* @version    
 */
public interface StatisticsDayService {
	
	/**
	 *定时添加StatisticsDay 
	 */
	public void addStatisticsDayAuto();
	
    /**
     * 删除指定日期StatisticsDay
     * @param date
     */
    public void delStatisticsDay(Date date);
	
	/**
	 * 获取日期的登录人数
	 * @param date
	 * @return int
	 */
	public int getLoginNumber(Date date);
	
	/**
	 * 查询某天的订单数，根据订单状态
	 * @param date
	 * @param orderState
	 * @return int
	 */
	public int getOrderNumber(Date date, Integer orderState);
	
	/**
	 * 查询某天的订单金额，根据订单状态
	 * @param date
	 * @param orderState
	 * @return  double金额
	 */
	public double getPayNumber(Date date, Integer orderState);
	
	/**
	 * 动态查询最近网站的统计信息
	 * @param days
	 * @return
	 */
	public List<StatisticsDay> getStatisticThirty(Integer days);
}
