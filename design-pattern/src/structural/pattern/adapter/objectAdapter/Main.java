package structural.pattern.adapter.objectAdapter;

import structural.pattern.adapter.classAdapter.Ps2;
import structural.pattern.adapter.classAdapter.Usber;

/*
����������
ԭ��ͨ�������ʵ�����������ܡ�

����������������ͬ��ʵ�����в�ͬ����ͨ��adapter�ﴴ����˽�ж���usb��ʵ������

Դ��Adaptee������Ҫ������Ķ�������ͣ��൱�ڲ�ͷ��
��������Adapter��������Ŀ���Դ���м�����൱�ڲ�ͷת������
Ŀ�꣨Target�����ڴ��õ���Ŀ�꣬�൱�ڲ�����

������������ͬ�㣺
1.��������ʹ�õ��Ǽ̳еķ�ʽ��ֱ�Ӽ̳���Adaptee�������޷���Adaptee������������䡣
2.����������ʹ�õ�����ϵķ�ʽ������Adaptee���������඼���Ա����䡣���⣬������������������һЩ����Ϊ�ǳ����㣬���������ӵ���Ϊͬʱ���������е�Դ��
3.�������/�ۺ����ڼ̳е�ԭ��ʹ�ö����������Ǹ��õ�ѡ�񡣵���������Ӧ�þ��������ĳЩ�������ʹ�������������ʺϣ����ʺϵĲ�����õġ�


 */
public class Main {
	public static void main(String[] args) {
		Ps2 test = new Adapter(new Usber());
		test.isPs2();
	}
}
