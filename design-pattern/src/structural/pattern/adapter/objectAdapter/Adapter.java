package structural.pattern.adapter.objectAdapter;

import structural.pattern.adapter.classAdapter.Ps2;
import structural.pattern.adapter.classAdapter.Usb;

public class Adapter implements Ps2{
	private Usb usb;
	
	public Adapter(Usb usb) {
		this.usb = usb;
	}
	
	@Override
	public void isPs2() {
		// TODO Auto-generated method stub
		usb.isUsb();
	}

}
