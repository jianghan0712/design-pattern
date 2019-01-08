package creational.pattern.singleton;

/*
����ʽ���̰߳�ȫ

�Ƿ� Lazy ��ʼ������
�Ƿ���̰߳�ȫ����
ʵ���Ѷȣ���

���������ַ�ʽ�߱��ܺõ� lazy loading���ܹ��ڶ��߳��кܺõĹ��������ǣ�Ч�ʺܵͣ�99% ����²���Ҫͬ����
�ŵ㣺��һ�ε��òų�ʼ���������ڴ��˷ѡ�
ȱ�㣺������� synchronized ���ܱ�֤��������������Ӱ��Ч�ʡ�
getInstance() �����ܶ�Ӧ�ó����Ǻܹؼ����÷���ʹ�ò�̫Ƶ������
 */
public class Singleton_2 {
    private static Singleton_2 instance;  
    private Singleton_2 (){}  
    
    //���һ��Ψһ����������synchronized
    public static synchronized Singleton_2 getInstance() {  
    if (instance == null) {  
        instance = new Singleton_2();  
    }  
    return instance;  
    }  
}
