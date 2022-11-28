import java.util.HashMap;

public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("Juho","Juho");
		logininfo.put("Suyeon","Suyeon");
		logininfo.put("Mathunan","Mathunan");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}