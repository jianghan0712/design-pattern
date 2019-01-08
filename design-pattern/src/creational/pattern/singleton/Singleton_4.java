package creational.pattern.singleton;

/*
˫����/˫��У������DCL���� double-checked locking��

JDK �汾��JDK1.5 ��
�Ƿ� Lazy ��ʼ������
�Ƿ���̰߳�ȫ����
ʵ���Ѷȣ��ϸ���

���������ַ�ʽ����˫�����ƣ���ȫ���ڶ��߳�������ܱ��ָ����ܡ�
getInstance() �����ܶ�Ӧ�ó���ܹؼ���
 */

public class Singleton_4 {
	private volatile static Singleton_4 instance;
	private Singleton_4() {}
	
	public static Singleton_4 getInstance() {
		if(instance == null) {
			synchronized (Singleton_4.class) {
				if(instance == null) {
					instance = new Singleton_4();
				}
			}
		}
		
		return instance;
	}
}
