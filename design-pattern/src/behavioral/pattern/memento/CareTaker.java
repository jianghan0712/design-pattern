package behavioral.pattern.memento;

import java.util.ArrayList;
import java.util.List;

//����¼������
public class CareTaker {
	private List<Memento> memList = new ArrayList<Memento>();
	
	public void add(Memento state) {
		memList.add(state);
	}
	
	public Memento get(int index) {
		return memList.get(index);
	}
}
