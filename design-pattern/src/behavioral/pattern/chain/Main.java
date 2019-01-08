package behavioral.pattern.chain;

/*
������ģʽ��Chain of Responsibility Pattern��Ϊ���󴴽���һ�������߶��������
����ģʽ������������ͣ�������ķ����ߺͽ����߽��н���������͵����ģʽ������Ϊ��ģʽ��
������ģʽ�У�ͨ��ÿ�������߶���������һ�������ߵ����á����һ�������ܴ����������ô�������ͬ�����󴫸���һ�������ߣ��������ơ�

��ͼ��������������������������һ���ö�������п��ܽ������󣬽���Щ�������ӳ�һ����������������������������ֱ���ж�������Ϊֹ��
��Ҫ�����ְ�����ϵĴ����߸��������󣬿ͻ�ֻ��Ҫ�������͵�ְ�����ϼ��ɣ������������Ĵ���ϸ�ں�����Ĵ��ݣ�����ְ����������ķ����ߺ�����Ĵ����߽����ˡ�
��ʱʹ�ã��ڴ�����Ϣ��ʱ���Թ��˺ܶ����
��ν�������ص��඼ʵ��ͳһ�ӿڡ�
�ؼ����룺Handler ����ۺ����Լ����� HandlerRequest ���ж��Ƿ���ʣ����û�ﵽ���������´��ݣ���˭����֮ǰ set ��ȥ��
Ӧ��ʵ���� 1����¥���е�"���Ĵ���"�� 2��JS �е��¼�ð�ݡ� 3��JAVA WEB �� Apache Tomcat �� Encoding �Ĵ���Struts2 ����������jsp servlet �� Filter��
�ŵ㣺   1��������϶ȡ���������ķ����ߺͽ����߽�� 
     2�����˶���ʹ�ö�����Ҫ֪�����Ľṹ�� 
     3����ǿ������ָ��ְ�������ԡ�ͨ���ı����ڵĳ�Ա���ߵ������ǵĴ�������̬����������ɾ�����Ρ� 
     4�������µ���������ܷ��㡣
ȱ�㣺   1�����ܱ�֤����һ�������ա� 
     2��ϵͳ���ܽ��ܵ�һ��Ӱ�죬�����ڽ��д������ʱ��̫���㣬���ܻ����ѭ�����á� 
     3�����ܲ����׹۲�����ʱ���������а��ڳ���
ʹ�ó����� 1���ж��������Դ���ͬһ�����󣬾����ĸ������������������ʱ���Զ�ȷ���� 
       2���ڲ���ȷָ�������ߵ�����£����������е�һ���ύһ������ 
       3���ɶ�ָ̬��һ�����������
ע������� JAVA WEB �������ܶ�Ӧ�á�
�ܽ᣺1��ְ����ģʽ������ķ����ߺͽ����߽����ˡ��ͻ��˲���Ҫ֪���������ߵ���ȷ��Ϣ����������Ҫ֪�����Ľṹ����ֻ��Ҫ��������з��ͼ��ɡ�
    2��ְ����ģʽ�ܹ��ǳ�����Ķ�̬������ְ�����ɾ��ְ��
    3���ͻ��˷��͵�������ܻ�ò�������
    4�������߲���Ҫ֪�����Ľṹ��ֻ��Ҫ�������ĺ�������˭�Ϳ����ˡ������ͼ���ϵͳ�еĶ���

 Handler: �������ߡ�������һ����������ķ��������еĴ����߶�����ʵ�ָó����ࡣ 
 ConcreteHandler: ���崦���ߡ������������������ͬʱҲ���Է������ĺ���ߡ�������ܹ���������������������󴫵ݵ����ĺ���ߡ� 
 Client: �ͻ��ࡣ
 
 */
public class Main {
	private static AbstractLogger getChainOfLogger() {
		AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);//1
		AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);//2
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);//3
		
		errorLogger.setNextLogger(debugLogger);
		debugLogger.setNextLogger(infoLogger);
		
		return errorLogger;		
	}
	
	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLogger();	
		
	    loggerChain.logMessage(AbstractLogger.INFO, 
	         "This is an info level information.");	 
	    loggerChain.logMessage(AbstractLogger.DEBUG, 
	         "This is an debug level information."); 
	    loggerChain.logMessage(AbstractLogger.ERROR, 
	         "This is an error level information.");
	}
}
