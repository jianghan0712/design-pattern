package structural.pattern.filterOrCriteria;

import java.util.List;

// ���������׼ �Ľӿڶ���
public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
