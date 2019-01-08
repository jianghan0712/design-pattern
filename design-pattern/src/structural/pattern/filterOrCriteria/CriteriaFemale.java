package structural.pattern.filterOrCriteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria{

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> personList = new ArrayList<Person>();
		for(Person person: persons) {
			if(person.getGender().equalsIgnoreCase("Female")){
				personList.add(person);
		    }
		}
		return personList;
	}

}
