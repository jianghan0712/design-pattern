package structural.pattern.proxy.staticproxy;

public class UserDao implements IUserDao{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("----save data!----");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("----update data!----");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("----delete data!----");
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("----get data!----");
	}

}
