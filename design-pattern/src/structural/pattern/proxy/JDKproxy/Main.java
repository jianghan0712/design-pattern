package structural.pattern.proxy.JDKproxy;

import structural.pattern.proxy.staticproxy.IUserDao;
import structural.pattern.proxy.staticproxy.UserDao;

/*
JDK��̬����

�ص�
1.�������,����Ҫʵ�ֽӿ�
2.������������,������JDK��API,��̬�����ڴ��й����������(��Ҫ����ָ�������������/Ŀ�����ʵ�ֵĽӿڵ�����)
3.��̬����Ҳ����:JDK����,�ӿڴ���

��̬������������̿ɷ�Ϊ�����ĸ����裺
1��ͨ��ʵ��InvocationHandler�ӿڴ����Լ��ĵ��ô����� IvocationHandler handler = new InvocationHandlerImpl(...);
2��ͨ��ΪProxy��ָ��ClassLoader�����һ��interface������̬������Class clazz = Proxy.getProxyClass(classLoader,new Class[]{...});
3��ͨ��������ƻ�ȡ��̬������Ĺ��캯��������������ǵ��ô������ӿ�����Constructor constructor = clazz.getConstructor(new Class[]{InvocationHandler.class});
4��ͨ�����캯������������ʵ������ʱ�轫���ô�����������Ϊ����������Interface Proxy = (Interface)constructor.newInstance(new Object[] (handler));
���У�JDK��װ��2~4�

�ӿ���IUserDao.java�Լ��ӿ�ʵ����,Ŀ�����UserDao��һ����,û�����޸�.�����������,����һ����������(ProxyFactory.java),��������д������ط�,
Ȼ���ڲ�����(��Ҫʹ�õ�����Ĵ���)���Ƚ���Ŀ�����ʹ���������ϵ,Ȼ����ô���������ͬ������

���������Ҫʵ�ֽӿ�,����Ŀ�����һ��Ҫʵ�ֽӿ�,��������JDK��̬����,Ӧʹ��cglib

 */

public class Main {
	public static void main(String[] args) {
		// Ŀ�����
		IUserDao target = new UserDao();
		 // ��ԭʼ������ class cn.itcast.b_dynamic.UserDao��
		System.out.println(target.getClass());
        // ��Ŀ����󣬴����������
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        // class $Proxy0   �ڴ��ж�̬���ɵĴ������
        System.out.println(proxy.getClass());

        // ִ�з���   ���������
        proxy.save();
        proxy.update();
        proxy.delete();
        proxy.get();
	}
}
