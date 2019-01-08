package structural.pattern.proxy.staticproxy;

public class UserDaoProxy implements IUserDao{
	private IUserDao target;
	
	public UserDaoProxy(IUserDao target) {
		this.target = target;
	}
	
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("save by proxy begin");
		target.save();
		System.out.println("save by proxy end");
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("update by proxy begin");
		target.update();
		System.out.println("update by proxy end");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("delete by proxy begin");
		target.delete();
		System.out.println("delete by proxy end");
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("get by proxy begin");
		target.get();
		System.out.println("get by proxy end");
	}

}
