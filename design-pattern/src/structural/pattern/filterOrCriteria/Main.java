package structural.pattern.filterOrCriteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
������ģʽ��Filter Pattern�����׼ģʽ��Criteria Pattern����һ�����ģʽ������ģʽ��������Աʹ�ò�ͬ�ı�׼������һ�����ͨ���߼������Խ���ķ�
ʽ�����������������������͵����ģʽ���ڽṹ��ģʽ������϶����׼����õ�һ��׼��

���ǽ�����һ�� Person ����Criteria �ӿں�ʵ���˸ýӿڵ�ʵ���࣬������ Person ������б�CriteriaPatternDemo�����ǵ���ʾ��ʹ�� Criteria ����
���ڸ��ֱ�׼�����ǵĽ�������� Person ������б�



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
	 
	      //ɸѡ��male
	      Criteria male = new CriteriaMale();
	      //ɸѡ��female
	      Criteria female = new CriteriaFemale();
	      //ɸѡ��Single
	      Criteria single = new CriteriaSingle();
	      //ɸѡ��Single��male
	      Criteria singleMale = new CriteriaAnd(single, male);
	      //ɸѡ��Single����Ů��
	      Criteria singleOrFemale = new CriteriaOr(single, female);
	 
	      //ʹ�ò�ͬ�ı�׼��Criteria�������ǵĽ�������� Person ������б�
	      System.out.println("Males: ");
	      printPersons(male.meetCriteria(persons));
	 
	      System.out.println("\nFemales: ");
	      printPersons(female.meetCriteria(persons));
	 
	      System.out.println("\nSingle And Males: ");
	      printPersons(singleMale.meetCriteria(persons));
	 
	      System.out.println("\nSingle Or Females: ");
	      printPersons(singleOrFemale.meetCriteria(persons));
	      
	      //����ģʽ��ʵ����java8�����е��͵�Ӧ�÷������Ƿ�����������Ը���ָ����ָ����з���ɸѡ��
	      // k���Ƿ����ָ�꣬��������е� gender
	      // v����һ��list�ļ��϶��󣬾��� personList
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
