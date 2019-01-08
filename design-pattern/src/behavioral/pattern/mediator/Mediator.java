package behavioral.pattern.mediator;

import java.util.ArrayList;
import java.util.List;

//�н���
public abstract class Mediator {
	protected List<House> houseList = new ArrayList<House>();
	House request = null;

	//��ɽ��ף��н��򷿶��Ϳͻ��ֱ�����Ϣ
	public abstract void constact(String message1, String message2, String message3);
	
	//�����ѷ���ע�ᵽ�н�
	public void registeHouse(House house) {
		houseList.add(house);
	}
	
	//���ѯ���н��Ƿ��к��ʵķ���
	public void registeRequest(House house) {
		this.request = house;
	}
	
	//�н��ҷ���
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
