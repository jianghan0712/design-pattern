package structural.pattern.proxy.cglibproxy;

/*
 * cglib代理不需要代理对象实现一个interface
 */
public class UserDao {
		public void save() {
			// TODO Auto-generated method stub
			System.out.println("----save data!----");
		}

		public void update() {
			// TODO Auto-generated method stub
			System.out.println("----update data!----");
		}

		public void delete() {
			// TODO Auto-generated method stub
			System.out.println("----delete data!----");
		}

		public void get() {
			// TODO Auto-generated method stub
			System.out.println("----get data!----");
		}
	
}
