package structural.pattern.filterOrCriteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
过滤器模式（Filter Pattern）或标准模式（Criteria Pattern）是一种设计模式，这种模式允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方
式把它们连接起来。这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准。

我们将创建一个 Person 对象、Criteria 接口和实现了该接口的实体类，来过滤 Person 对象的列表。CriteriaPatternDemo，我们的演示类使用 Criteria 对象，
基于各种标准和它们的结合来过滤 Person 对象的列表。



 */
public class Main {
	public static void main(String[] args) {
	    List<Person> persons = new ArrayList<Person>();
	    
	      persons.add(new Person("Robert","Male", "Single"));
	      persons.add(new Person("John","Male", "Married"));
	      persons.add(new Person("Laura","Female", "Married"));
	      persons.add(new Person("Diana","Female", "Single"));
	      persons.add(new Person("Mike","Male", "Single"));
	      persons.add(new Person("Bobby","Male", "Single"));
	 
	      //筛选出male
	      Criteria male = new CriteriaMale();
	      //筛选出female
	      Criteria female = new CriteriaFemale();
	      //筛选出Single
	      Criteria single = new CriteriaSingle();
	      //筛选出Single的male
	      Criteria singleMale = new CriteriaAnd(single, male);
	      //筛选出Single或者女性
	      Criteria singleOrFemale = new CriteriaOr(single, female);
	 
	      //使用不同的标准（Criteria）和它们的结合来过滤 Person 对象的列表。
	      System.out.println("Males: ");
	      printPersons(male.meetCriteria(persons));
	 
	      System.out.println("\nFemales: ");
	      printPersons(female.meetCriteria(persons));
	 
	      System.out.println("\nSingle And Males: ");
	      printPersons(singleMale.meetCriteria(persons));
	 
	      System.out.println("\nSingle Or Females: ");
	      printPersons(singleOrFemale.meetCriteria(persons));
	      
	      //过滤模式的实现在java8里面有典型的应用方法就是分组操作，可以根据指定的指标进行分组筛选。
	      // k：是分组的指标，上面代码中的 gender
	      // v：是一个list的集合对象，就是 personList
	      Map<String, List<Person>> groupMap = persons.stream().collect(Collectors.groupingBy(Person::getGender));
	      groupMap.forEach((k, v) -> {
	          System.out.println(k);
	          v.forEach(System.out::println);

	      });
	}
	
	public static void printPersons(List<Person> persons){
	      for (Person person : persons) {
	         System.out.println("Person : [ Name : " + person.getName() 
	            +", Gender : " + person.getGender() 
	            +", Marital Status : " + person.getMaritalStatus()
	            +" ]");
	      }
	   }      
}
