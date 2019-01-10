package behavioral.pattern.nullobject;

/*
空对象模式（Null Object Pattern）。
一个空对象取代 NULL 对象实例的检查，Null 对象不是检查空值，而是反应一个不做任何动作的关系。这样的 Null 对象也可以在数据不可用的时候提供默认的行为。
在空对象模式中，我们创建一个指定各种要执行的操作的抽象类和扩展该类的实体类，还创建一个未对该类做任何实现的空对象类，该空对象类将无缝地使用在需要检查空值的地方。

可以代替if(null){输出错误信息}这样的不友好情况
优点：1、它可以加强系统的稳固性，能有有效地防止空指针报错对整个系统的影响，使系统更加稳定。
	2、它能够实现对空对象情况的定制化的控制，能够掌握处理空对象的主动权。
	3、它并不依靠Client来保证整个系统的稳定运行。
	4、它通过isNull对==null的替换，显得更加优雅，更加易懂。
 */
public class Main {
	public static void main(String[] args) {
		AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
	    AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
	    AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
	    AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");
	 
//	    "Rob", "Joe", "Julie"
	    System.out.println(customer1.getName());
	    System.out.println(customer2.getName());
	    System.out.println(customer3.getName());
	    System.out.println(customer4.getName());
	}
}
