package structural.pattern.filterOrCriteria;

import java.util.List;

public class CriteriaAnd implements Criteria{
	private Criteria criteria;
	private Criteria otherCriteria;

	public CriteriaAnd(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);     
	    return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}
