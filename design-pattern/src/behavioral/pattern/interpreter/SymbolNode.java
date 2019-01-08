package behavioral.pattern.interpreter;

// �ս�����ʽ��ʵ�����ķ��е��ս����صĽ��Ͳ�����ʵ�ֳ�����ʽ����Ҫ��ķ������ķ���ÿһ���ս������һ��������ս���ʽ��֮���Ӧ��
public abstract class SymbolNode implements Node{
	protected Node left;
	protected Node right;
	
    public SymbolNode(Node left,Node right)
    {
        this.left=left;
        this.right=right;
    }

}
