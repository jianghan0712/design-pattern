package creational.pattern.singleton;

/*
����ʽ���̲߳���ȫ

 �Ƿ� Lazy ��ʼ������
�Ƿ���̰߳�ȫ����
ʵ���Ѷȣ���

���ַ�ʽ���������ʵ�ַ�ʽ������ʵ������������ǲ�֧�ֶ��̡߳���Ϊû�м��� synchronized�������ϸ��������������㵥��ģʽ��
���ַ�ʽ lazy loading �����ԣ���Ҫ���̰߳�ȫ���ڶ��̲߳�������������
*/

public class Singleton_1{
	private static Singleton_1 instance;
	private Singleton_1() {
		
	}
	
	public static Singleton_1 getInstance() {
		if(instance == null) {
			instance = new Singleton_1();
		}
		return instance;
	}
}