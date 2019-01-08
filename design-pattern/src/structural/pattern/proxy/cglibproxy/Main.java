package structural.pattern.proxy.cglibproxy;

/*
Cglib����,Ҳ�����������,�������ڴ��й���һ���������Ӷ�ʵ�ֶ�Ŀ������ܵ���չ.

JDK�Ķ�̬������һ������,����ʹ�ö�̬����Ķ������ʵ��һ�������ӿ�,��������û��ʵ�ֽӿڵ���,�Ϳ���ʹ��Cglibʵ��.
Cglib��һ��ǿ��ĸ����ܵĴ������ɰ�,����������������չjava����ʵ��java�ӿ�.���㷺�ı����AOP�Ŀ��ʹ��,����Spring AOP��synaop,Ϊ�����ṩ��
����interception(����)��Cglib���ĵײ���ͨ��ʹ��һ��С������ֽ��봦����ASM��ת���ֽ��벢�����µ���.������ֱ��ʹ��ASM,��Ϊ��Ҫ��������JVM��
���ṹ����class�ļ��ĸ�ʽ��ָ�������Ϥ.

Cglib�������ʵ�ַ���:
1.��Ҫ����cglib��jar�ļ�,����Spring�ĺ��İ����Ѿ�������Cglib����,����ֱ������spring-core-3.2.5.jar����.
2.���빦�ܰ���,�Ϳ������ڴ��ж�̬��������
3.������಻��Ϊfinal,���򱨴�
4.Ŀ�����ķ������Ϊfinal/static,��ô�Ͳ��ᱻ����,������ִ��Ŀ���������ҵ�񷽷�.

��Spring��AOP�����:
�������������Ŀ�������ʵ�ֽӿ�,��JDK����
���Ŀ�����û��ʵ�ֽӿ�,��Cglib����
 */

public class Main {
	public static void main(String[] args) {
		//Ŀ�����
        UserDao target = new UserDao();

        //�������
        UserDao proxy = (UserDao)new ProxyFactory(target).getProxyInstance();

        //ִ�д������ķ���
        proxy.save();
        proxy.update();
        proxy.delete();
        proxy.get();
	}
}
