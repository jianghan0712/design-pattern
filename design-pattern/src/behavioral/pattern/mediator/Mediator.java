package behavioral.pattern.mediator;

import java.util.ArrayList;
import java.util.List;

//中介类
public abstract class Mediator {
	protected List<House> houseList = new ArrayList<House>();
	House request = null;

	//达成交易，中介向房东和客户分别发送消息
	public abstract void constact(String message1, String message2, String message3);
	
	//房东把房子注册到中介
	public void registeHouse(House house) {
		houseList.add(house);
	}
	
	//租客询问中介是否有合适的房子
	public void registeRequest(House house) {
		this.request = house;
	}
	
	//中介找房子
	public House delRequest() {
		House ret = null;
		if(request!=null) {
			for(House e: houseList) {
				if( request.room == e.room )
					ret = e;
			}
		}		
		return ret;
	}
}
