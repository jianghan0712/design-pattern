package behavioral.pattern.visitor;

/*
������ģʽ��Visitor Pattern��������ʹ����һ���������࣬���ı���Ԫ�����ִ���㷨��
ͨ�����ַ�ʽ��Ԫ�ص�ִ���㷨�������ŷ����߸ı���ı䡣�������͵����ģʽ������Ϊ��ģʽ������ģʽ��Ԫ�ض����ѽ��ܷ����߶������������߶���Ϳ��Դ���Ԫ�ض����ϵĲ�����

��ͼ����Ҫ�����ݽṹ�����ݲ������롣
��Ҫ������ȶ������ݽṹ���ױ�Ĳ���������⡣
��ʱʹ�ã���Ҫ��һ������ṹ�еĶ�����кܶ಻ͬ�Ĳ��Ҳ���صĲ���������Ҫ��������Щ����"��Ⱦ"��Щ������࣬ʹ�÷�����ģʽ����Щ��װ�����С�
��ν�����ڱ����ʵ��������һ�������ṩ�Ӵ������ߵĽӿڡ�
�ؼ����룺�����ݻ�����������һ���������ܷ����ߣ����������ô�������ߡ�
Ӧ��ʵ�����������Ѽ����ͣ����Ƿ����ߣ����ѽ������ķ��ʣ���ͨ�����ѵ�������Ȼ������ѵ���������һ���жϣ�����Ƿ�����ģʽ��
�ŵ㣺 1�����ϵ�һְ��ԭ�� 2���������չ�ԡ� 3������ԡ�
ȱ�㣺 1������Ԫ�ضԷ����߹���ϸ�ڣ�Υ���˵�����ԭ�� 2������Ԫ�ر���Ƚ����ѡ� 3��Υ������������ԭ�������˾����࣬û����������
ʹ�ó����� 1������ṹ�ж����Ӧ������ٸı䣬��������Ҫ�ڴ˶���ṹ�϶����µĲ����� 
	   2����Ҫ��һ������ṹ�еĶ�����кܶ಻ͬ�Ĳ��Ҳ���صĲ���������Ҫ��������Щ����"��Ⱦ"��Щ������࣬Ҳ��ϣ���������²���ʱ�޸���Щ�ࡣ
ע����������߿��ԶԹ��ܽ���ͳһ��������������UI�����������������

�ܽ᣺1��������ģʽ��װ�˶���ṹԪ��֮�ϵĲ�����ʹ������Ԫ�صĲ�����÷ǳ��򵥡��������Ƚ���������ô����ṹ���ٱ仯���ࡣ
    2��������ģʽ�ж���ṹ�洢�˲�ͬ���͵�Ԫ�ض����Թ���ͬ�����߷��ʡ�
 */
public class Main {
	public static void main(String[] args) {
        Medicine a = new MedicineA("A", 11.0);//ҩƷA
        Medicine b = new MedicineB("B", 14.3);//ҩƷB
        
        Presciption presciption = new Presciption();
        presciption.addMedicine(a);
        presciption.addMedicine(b);
        
        Visitor charger = new Charger();//����Ա
        charger.setName("����");
        
        Visitor workerOfPharmacy = new WorkerOfPharmacy();//
        workerOfPharmacy.setName("����");
        
        presciption.accept(charger);//���۷��Ķ���
        System.out.println("-------------------------------------");
        presciption.accept(workerOfPharmacy);//ҩ�귽�Ķ���
    }
}