package structural.pattern.adapter.classAdapter;

/*  Usber：是接口Usb的实现类，是具体的USB接口格式   */
public class Usber implements Usb{

	@Override
	public void isUsb() {
		// TODO Auto-generated method stub
		System.out.println("this is a usb");
	}

}
