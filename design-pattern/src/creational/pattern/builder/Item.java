package creational.pattern.builder;

/*
 * ��ʾʳ����Ŀ�ӿ�
 * name��price������ʳ�ﹲ�еģ�pack����ʳ�ﲻͬ�в�ͬ�İ�װ
 */

public interface Item {
	public String name();//ʳ������
	public Packing packing();//���
	public float price();//
}
