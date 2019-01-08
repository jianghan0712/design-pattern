package creational.pattern.builder;

/*
 * ʵ�� Item �ӿڵĳ����࣬�����ṩ��Ĭ�ϵĹ���
 * ��������Ϊcoke��pepsi������ƿ��װ
 */
public abstract class ColdDrink implements Item {
	 
    @Override
    public Packing packing() {//��ƿ��װ
       return new Bottle();
    }
 
    @Override
    public abstract float price();
}
