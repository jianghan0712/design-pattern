package structural.pattern.filterOrCriteria;

import java.util.List;

// 过滤器或标准 的接口定义
public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
