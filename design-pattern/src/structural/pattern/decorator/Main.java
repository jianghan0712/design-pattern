package structural.pattern.decorator;

/*
װ����ģʽ��Decorator Pattern��
������һ�����еĶ��������µĹ��ܣ�ͬʱ�ֲ��ı���ṹ���������͵����ģʽ���ڽṹ��ģʽ��������Ϊ���е����һ����װ��
����ģʽ������һ��װ���࣬������װԭ�е��࣬���ڱ����෽��ǩ�������Ե�ǰ���£��ṩ�˶���Ĺ��ܡ�

��ͼ����̬�ظ�һ����������һЩ�����ְ�𡣾����ӹ�����˵��װ����ģʽ������������Ϊ��
��Ҫ�����һ��ģ�����Ϊ����չһ���ྭ��ʹ�ü̳з�ʽʵ�֣����ڼ̳�Ϊ�����뾲̬����������������չ���ܵ����࣬���������͡�
��ʱʹ�ã��ڲ������Ӻܶ�������������չ�ࡣ
��ν���������幦��ְ�𻮷֣�ͬʱ�̳�װ����ģʽ��
�ؼ����룺 1��Component ��䵱�����ɫ����Ӧ�þ���ʵ�֡� 2�����������úͼ̳� Component �࣬������չ����д���෽����
Ӧ��ʵ���� 1��������� 72 �䣬�������"����"�����ĸ�������һֻ���ӣ�����������������Ĺ��ܡ� 
       2������һ������û�л��򶼿��Թ���ǽ�ϣ�����ͨ�������л���ģ�����ʵ�����ǻ��򱻹���ǽ�ϡ��ڹ���ǽ��֮ǰ�������Ա����ϲ�����װ���������ʱ���������ͻ����γ���һ�����塣
�ŵ㣺1��װ����ģʽ�����ṩ�ȼ̳и���������
    2������ͨ��һ�ֶ�̬�ķ�ʽ����չһ������Ĺ��ܣ�������ʱѡ��ͬ��װ�������Ӷ�ʵ�ֲ�ͬ����Ϊ��
    3��ͨ��ʹ�ò�ͬ�ľ���װ�����Լ���Щװ�����������ϣ����Դ�����ܶ಻ͬ��Ϊ����ϡ�����ʹ�ö������װ������װ��ͬһ���󣬵õ����ܸ�Ϊǿ��Ķ���
    4�����幹���������װ������Զ����仯���û����Ը�����Ҫ�����µľ��幹����;���װ���࣬��ʹ��ʱ�ٶ��������ϣ�ԭ�д�������ı䣬���ϡ�����ԭ�򡱡�
    5��װ����ͱ�װ������Զ�����չ�������໥��ϣ�װ��ģʽ�Ǽ̳е�һ�����ģʽ��װ��ģʽ���Զ�̬��չһ��ʵ����Ĺ��ܡ�

ȱ�㣺1��������ܶ��С����������ϵͳ�ĸ�����
    2�����ֱȼ̳и��������������ԣ�Ҳͬʱ��ζ��װ��ģʽ�ȼ̳и������ڳ������Ŵ�Ҳ�����ѣ����ڶ��װ�εĶ��󣬵���ʱѰ�Ҵ��������Ҫ���Ų飬��Ϊ������
ʹ�ó����� 1���ڲ�Ӱ���������������£��Զ�̬��͸���ķ�ʽ��������������ְ��
       2����Ҫ��̬�ظ�һ���������ӹ��ܣ���Щ����Ҳ���Զ�̬�ر�������  �����ܲ��ü̳еķ�ʽ��ϵͳ����������߲��ü̳в�����ϵͳ��չ��ά��ʱ��
ע������ɴ���̳С�

Component: ���󹹼����Ƕ���һ������ӿڣ����Ը���Щ����̬������ְ�� /ShapeDecorator/
ConcreteComponent:���幹�����Ƕ�����һ������Ķ���Ҳ���Ը������������һЩְ��
Decorator: ����װ���ࡣ��װ�γ����࣬�̳���Component,����������չComponent��Ĺ��ܣ�������Component��˵��������֪��Decorator���ڵġ�
ConcreteDecorator:����װ���࣬�𵽸�Component����ְ��Ĺ��ܡ� /RedShapeDecorator/

�ܽ᣺1�� ��Ϻ�ί�п���������ʱ��̬�������µ���Ϊ�����̳��Ǿ�̬�ģ���ϵͳ����ʱ���Ѿ������˶������Ϊ��
    2��װ����ģʽ��ζ��һȺװ�����࣬��Щ��������װ�������
	3��װ���߿����ڱ�װ���ߵ���Ϊǰ����ߺ�������Լ�����Ϊ���������Խ���װ���ߵ���Ϊ����ȡ�������Ӷ��ﵽ�ض���Ŀ�ġ�
	4�������ö��װ���߰�װһ�������
	5��װ����һ���������Ŀͻ���͸���ģ����ǿͻ���������������ľ������͡�
	6��װ���߻ᵼ������г��������С����������ȵ�ʹ�ã�����ϵͳ��ø��Ӹ��ӡ�
	7��װ���ߺͱ�װ���߶�������ͬ�ĳ����͡�

 */
public class Main {
	public static void main(String[] args) {
		//ԭʼ���࣬drawֻ�ܴ�ӡ��ԭʼshape�е�����
		Shape circle = new Circle();
		System.out.println("Circle with normal border");
	    circle.draw();
	    
	    //����װ�������κ���࣬ͬ����draw���Ե��ò�ͬ �ķ���
	    Shape redCircle = new RedShapeDecorator(new Circle());
	    System.out.println("\nCircle of red border");
	    redCircle.draw();
	    
	    Shape redRectangle = new RedShapeDecorator(new Rectangle());
	    System.out.println("\nRectangle of red border");
	    redRectangle.draw();
	}
}