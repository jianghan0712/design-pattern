package creational.pattern.singleton;


/*
����ʽ

�Ƿ� Lazy ��ʼ������
�Ƿ���̰߳�ȫ����
ʵ���Ѷȣ���

���������ַ�ʽ�Ƚϳ��ã������ײ�����������
�ŵ㣺û�м�����ִ��Ч�ʻ���ߡ�
ȱ�㣺�����ʱ�ͳ�ʼ�����˷��ڴ档
������ classloader ���Ʊ����˶��̵߳�ͬ�����⣬������instance ����װ��ʱ��ʵ��������Ȼ������װ�ص�ԭ���кܶ��֣�
�ڵ���ģʽ�д�������ǵ��� getInstance ������ ����Ҳ����ȷ���������ķ�ʽ�����������ľ�̬������������װ�أ���ʱ���ʼ�� instance
 ��Ȼû�дﵽ lazy loading ��Ч����

 */
public class Singleton_3 {
	private static Singleton_3 instance = new Singleton_3();
	private Singleton_3() {}
	public static Singleton_3 getInstance() {
		return instance;
	}
}
