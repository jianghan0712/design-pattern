package behavioral.pattern.nullobject;

/*
�ն���ģʽ��Null Object Pattern����
һ���ն���ȡ�� NULL ����ʵ���ļ�飬Null �����Ǽ���ֵ�����Ƿ�Ӧһ�������κζ����Ĺ�ϵ�������� Null ����Ҳ���������ݲ����õ�ʱ���ṩĬ�ϵ���Ϊ��
�ڿն���ģʽ�У����Ǵ���һ��ָ������Ҫִ�еĲ����ĳ��������չ�����ʵ���࣬������һ��δ�Ը������κ�ʵ�ֵĿն����࣬�ÿն����ཫ�޷��ʹ������Ҫ����ֵ�ĵط���

���Դ���if(null){���������Ϣ}�����Ĳ��Ѻ����
�ŵ㣺1�������Լ�ǿϵͳ���ȹ��ԣ�������Ч�ط�ֹ��ָ�뱨�������ϵͳ��Ӱ�죬ʹϵͳ�����ȶ���
	2�����ܹ�ʵ�ֶԿն�������Ķ��ƻ��Ŀ��ƣ��ܹ����մ���ն��������Ȩ��
	3������������Client����֤����ϵͳ���ȶ����С�
	4����ͨ��isNull��==null���滻���Եø������ţ������׶���
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
