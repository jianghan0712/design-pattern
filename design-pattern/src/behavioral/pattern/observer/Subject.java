package behavioral.pattern.observer;

import java.util.ArrayList;
import java.util.List;

//Subject 对象带有绑定观察者到 Client 对象和从 Client 对象解绑观察者的方法
public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();//绑定该subject的观察者列表
	private int state;//被观察的变量
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();//通知所有被观察者
	}
	
	private void notifyAllObservers() {
		// TODO Auto-generated method stub
		for(Observer e: observers) {
			e.update();
		}
	}
	
	//把观察者注册到subject上
    public void attach(Observer observer){
	    observers.add(observer);      
	}	
}
