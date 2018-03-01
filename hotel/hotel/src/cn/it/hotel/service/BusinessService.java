package cn.it.hotel.service;

import java.util.List;

import cn.it.hotel.model.Business;

public interface BusinessService extends BaseService<Business> {

	    //查询业务信息，级联客房、类别、客户、用户
		public List<Business> queryJoinRoomAndRoomcategoryAndClientAndUser(String bname,int page,int size);
		//根据关键字查询总记录数
		public Long getCount(String bremark);
		//根据ids删除多条记录
		public void deleteByBids(String bids);
		
		//查询营业收入（开房、入住（预定后））
		public List<Object> queryIncome(int number);
		
		//查询客房的销售量（开房、入住（预定后））
		public List<Object> querySale(int number);
		
		//查询客房的预订量（预订）
		public List<Object> queryOrderin(int number);
		
		//查询客房的退订量（退订）
		public List<Object> queryOrderout(int number);
}
