package week1.day1;

public class Mobile {
	
	private void sendMsg() {
		System.out.println("to send message");
	}
	private void makeCall() {
		System.out.println("to make call");
	}
	public void saveContact( ) {
		System.out.println("to save contact");
	}
	public static void main(String args[]) {
		Mobile functions = new Mobile();
		functions.sendMsg();
		functions.makeCall();
		functions.saveContact();		
	}
}
