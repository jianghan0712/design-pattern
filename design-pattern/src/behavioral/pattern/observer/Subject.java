package behavioral.pattern.observer;

import java.util.ArrayList;
import java.util.List;

//Subject ������а󶨹۲��ߵ� Client ����ʹ� Client ������۲��ߵķ���
public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();//�󶨸�subject�Ĺ۲����б�
	private int state;//���۲�ı���
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();//֪ͨ���б��۲���
	}
	
	private void notifyAllObservers() {
		// TODO Auto-generated method stub
		for(Observer e: observers) {
			e.update();
		}
	}
	
	//�ѹ۲���ע�ᵽsubject��
    public void attach(Observer observer){
	    observers.add(observer);      
	}	
}
