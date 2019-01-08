package creational.pattern.builder;

/*
 * ʵ�� Item �ӿڵĳ����࣬�����ṩ��Ĭ�ϵĹ���
 * ��������Ϊ��ʳ����Veg Burger�ͼ��⺺��Chicken Burger����װ�ڰ�װ����
 */
public abstract class Burger implements Item{
	@Override
	public Packing packing() {//�ú���װ
	   return new Wrapper();
	}
	 
	@Override
	public abstract float price();
}
