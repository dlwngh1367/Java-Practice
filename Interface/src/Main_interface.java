
public class Main_interface {

	public static void main(String[] args) {
		ITelephone JuhosPhone;
		
		JuhosPhone = new DeskPhone(123456);
		JuhosPhone.powerOn();
		JuhosPhone.callPhone(123456);
		JuhosPhone.answer();

	}

}
