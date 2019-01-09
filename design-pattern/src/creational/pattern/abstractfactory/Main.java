package creational.pattern.abstractfactory;

/*
���󹤳�ģʽ��Abstract Factory Pattern����Χ��һ�������������������������ó��������ֳ�Ϊ���������Ĺ������������͵����ģʽ���ڴ�����ģʽ�����ṩ��һ�ִ����������ѷ�ʽ��
�ڳ��󹤳�ģʽ�У��ӿ��Ǹ��𴴽�һ����ض���Ĺ���������Ҫ��ʽָ�����ǵ��ࡣÿ�����ɵĹ������ܰ��չ���ģʽ�ṩ����

��ͼ���ṩһ������һϵ����ػ��໥��������Ľӿڣ�������ָ�����Ǿ�����ࡣ
��Ҫ�������Ҫ����ӿ�ѡ������⡣
��ʱʹ�ã�ϵͳ�Ĳ�Ʒ�ж���һ���Ĳ�Ʒ�壬��ϵͳֻ��������ĳһ��Ĳ�Ʒ��
��ν������һ����Ʒ�����棬��������Ʒ��
�ؼ����룺��һ��������ۺ϶��ͬ���Ʒ��
Ӧ��ʵ���������ˣ�Ϊ�˲μ�һЩ�ۻᣬ�϶������׻�����·��ɣ�����˵������װ�����ף�һϵ�о����Ʒ����ʱ��װ�����ף�һϵ�о����Ʒ������������һ����ͥ��˵��
                    ����������Ůװ��������װ��ʱ��Ůװ��ʱ����װ����ЩҲ���ǳ��׵ģ���һϵ�о����Ʒ������һ���������ʵ���ǲ����ڵģ�Ҫ��Ȼ��û�����빲�������ˣ�����
                    ����˵�����󹤳�ģʽ���������ļ��У�ĳһ���¹񣨾��幤����ֻ�ܴ��ĳһ���������·������ף�һϵ�о����Ʒ����ÿ�������ֳ��׵��·�ʱҲ��ȻҪ������¹�
                    ��ȡ���ˡ��� OO ��˼��ȥ��⣬���е��¹񣨾��幤���������¹���ģ����󹤳���ĳһ������ÿһ�����׵��·��ְ�����������£�ĳһ�����Ʒ�������ӣ�ĳһ
                    �����Ʒ������Щ�����������ʵҲ�������£������Ʒ��������Ŀ���Ҳ���ǿ��ӣ���һ�������Ʒ����
�ŵ㣺��һ����Ʒ���еĶ��������Ƴ�һ����ʱ�����ܱ�֤�ͻ���ʼ��ֻʹ��ͬһ����Ʒ���еĶ���
ȱ�㣺��Ʒ����չ�ǳ����ѣ�Ҫ����һ��ϵ�е�ĳһ��Ʒ����Ҫ�ڳ���� Creator ��Ӵ��룬��Ҫ�ھ��������Ӵ��롣
ʹ�ó����� 1��QQ ��Ƥ����һ����һ�𻻡� 2�����ɲ�ͬ����ϵͳ�ĳ���
ע�������Ʒ������չ����Ʒ�ȼ�����չ��

���ǽ����� Shape �� Color �ӿں�ʵ����Щ�ӿڵ�ʵ���ࡣ��һ���Ǵ������󹤳��� AbstractFactory�����Ŷ��幤���� ShapeFactory �� ColorFactory�������������඼����չ�� AbstractFactory��
Ȼ�󴴽�һ������������/�������� FactoryProducer��AbstractFactoryPatternDemo�����ǵ���ʾ��ʹ�� FactoryProducer ����ȡ AbstractFactory ���������� AbstractFactory 
������״��Ϣ Shape��CIRCLE / RECTANGLE / SQUARE�����Ա��ȡ�������������͡�ͬʱ������ AbstractFactory ������ɫ��Ϣ Color��RED / GREEN / BLUE�����Ա��ȡ�������������͡�
*/
public class Main {
	public static void main(String[] args) {
		  //��ȡ��״����
	      AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
	 
	      //��ȡ��״Ϊ Circle �Ķ���
	      Shape shape1 = (Square)shapeFactory.getShape(Square.class);
	 
	      //���� Circle �� draw ����
	      shape1.draw();
	 
	      //��ȡ��״Ϊ Rectangle �Ķ���
	      Shape shape2 = (Rectangle)shapeFactory.getShape(Rectangle.class);
	 
	      //���� Rectangle �� draw ����
	      shape2.draw();
	 
	      //��ȡ��ɫ����
	      AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
	 
	      //��ȡ��ɫΪ Red �Ķ���
	      Color color1 = (Red)colorFactory.getColor(Red.class);
	 
	      //���� Red �� fill ����
	      color1.fill();
	 
	      //��ȡ��ɫΪ Green �Ķ���
	      Color color2 = (Yellow)colorFactory.getColor(Yellow.class);
	 
	      //���� Green �� fill ����
	      color2.fill();
	   
	}
}
