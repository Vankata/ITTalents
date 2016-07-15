
public class Call {

	double priceForAminute = 0.15;
	String caller = "no number";
	String receiver = "no number";
	double duration = 0.0;
	
	Call(String caller, String receiver, double duration){
		if(!isValid(caller)){
			System.out.println("Invalid caller's number!  ");
		}else{
			this.caller = caller;
		}
		if(!isValid(receiver)){
			System.out.println("Invalid receiver's number! ");
		}else{
			this.receiver = receiver;
		}
		if(duration < 0){
			System.out.println("Invalid duration! ");
		}else{
			this.duration = duration;
		}
	}
	
	void printCall(){
		System.out.println("Price for a minute: " + this.priceForAminute);
		System.out.println("Caller's number: " + this.caller);
		System.out.println("Receiver's number: " + this.receiver);
		System.out.println("Call duration: " + this.duration);
	}
	
	boolean isValid(String number){
		return !((number == null) || (number.equals("")) || (("" + number).length() != 10) || !((("" + number).substring(0, 2)).equals("08")));
	}
}
