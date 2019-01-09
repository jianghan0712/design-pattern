package behavioral.pattern.memento;

/*
����¼ģʽ��Memento Pattern������һ�������ĳ��״̬���Ա����ʵ���ʱ��ָ����󡣱���¼ģʽ������Ϊ��ģʽ��

��ͼ���ڲ��ƻ���װ�Ե�ǰ���£�����һ��������ڲ�״̬�����ڸö���֮�Ᵽ�����״̬��
��Ҫ�������ν����¼ģʽ�����ڲ��ƻ���װ��ǰ���£�����һ��������ڲ�״̬�����ڸö���֮�Ᵽ�����״̬�������������Ժ󽫶���ָ���ԭ�ȱ����״̬��
��ʱʹ�ã��ܶ�ʱ������������Ҫ��¼һ��������ڲ�״̬����������Ŀ�ľ���Ϊ�������û�ȡ����ȷ�����ߴ���Ĳ������ܹ��ָ�����ԭ�ȵ�״̬��ʹ������"���ҩ"�ɳԡ�
��ν����ͨ��һ������¼��ר�Ŵ洢����״̬��
�ؼ����룺�ͻ����뱸��¼����ϣ��뱸��¼��������ϡ�
Ӧ��ʵ���� 1�����ҩ�� 2������Ϸʱ�Ĵ浵�� 3��Windows ��� ctri + z�� 4��IE �еĺ��ˡ� 4�����ݿ�����������
�ŵ㣺 1�����û��ṩ��һ�ֿ��Իָ�״̬�Ļ��ƣ�����ʹ�û��ܹ��ȽϷ���ػص�ĳ����ʷ��״̬�� 2��ʵ������Ϣ�ķ�װ��ʹ���û�����Ҫ����״̬�ı���ϸ�ڡ�
ȱ�㣺������Դ�������ĳ�Ա�������࣬�Ʊػ�ռ�ñȽϴ����Դ������ÿһ�α��涼������һ�����ڴ档
ʹ�ó����� 1����Ҫ����/�ָ����ݵ����״̬������
       2���ṩһ���ɻع��Ĳ�����
       3�� �����һ���ӿ�������������õ���Щ״̬�����ᱩ¶�����ʵ��ϸ�ڲ��ƻ�����ķ�װ�ԣ�һ������ϣ�����ֱ�ӷ������ڲ�״̬��ͨ�������˿��Լ�ӷ������ڲ�״̬��
ע����� 1��Ϊ�˷��ϵ�����ԭ�򣬻�Ҫ����һ����������¼���ࡣ 2��Ϊ�˽�Լ�ڴ棬��ʹ��ԭ��ģʽ+����¼ģʽ��

Originator: ԭ���������𴴽�һ������¼�����Լ�¼��ǰ������ڲ�״̬��ͨ��Ҳ����ʹ���������ñ���¼�ָ��ڲ�״̬��ͬʱԭ���������Ը�����Ҫ����Memento�洢Originator����Щ�ڲ�״̬��
Memento: ����¼�����ڴ洢Originator���ڲ�״̬�����ҿ��Է�ֹOriginator����Ķ������Memento��
                          �ڱ���¼Memento���������ӿڣ�����Caretakerֻ�ܿ�������¼�е�խ�ӿڣ���ֻ�ܽ�����¼���ݸ���������Originator���Կ������ӿڣ����������ʷ��ص���ǰ״̬���������ݡ�
Caretaker: �����ˡ����𱣴�ñ���¼�����ܶԱ���¼�����ݽ��в����ͷ��ʣ�ֻ�ܹ�������¼���ݸ���������

�ܽ᣺1�� ����¼ģʽ����ʵ���ڲ��ƻ���װ��ǰ���£�����һ������ڲ�״̬�������ڸö���֮�Ᵽ��ö����״̬����֤�ö����ܹ��ָ�����ʷ��ĳ��״̬��
    2�� ����¼ģʽʵ�����ڲ�״̬�ķ�װ�����˴�������ԭ����֮���������󶼲��ܹ���������
    3�� ����¼ģʽ��ռ�ý϶���ڴ棬������Դ��
 */
public class Main {
	public static void main(String[] args) {
		Originator originator = new Originator();
	    CareTaker careTaker = new CareTaker();
	    
	    //ģ�⹤���๤����
	    originator.setState("state #1");
	    originator.setState("state #2");
	    
	    //����״̬2
	    careTaker.add(originator.saveStateToMemento());
	    
	    originator.setState("state #3");
	    originator.setState("state #4");
	    
	    //����״̬4
	    careTaker.add(originator.saveStateToMemento());
	    
	    //״̬5
	    originator.setState("state #5");	    
	    System.out.println("Current State: " + originator.getState());   
	    
	    //���ص�һ������ڵ�2
	    originator.getStateFromMemento(careTaker.get(0));
	    System.out.println("First saved State: " + originator.getState());
	    
	    //���صڶ�������ڵ�4
	    originator.getStateFromMemento(careTaker.get(1));
	    System.out.println("Second saved State: " + originator.getState());
	    
	}
}