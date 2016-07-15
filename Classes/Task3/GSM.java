
public class GSM {
	
	String model = "no model";
	boolean hasSimCard = false;
	String simMobileNumber = "no number";
	double outgoingCallsDuration = 0.0;
	Call lastIncomingCall;
	Call lastOutgoingCall;
	
	//creating GSM with no sim card
	GSM(String model){
		if(model == null || model.equals("")){
			System.out.println("No such model! ");
		}else{
			this.model = model;
		}
	}
	
	//creating GSM with sim card
	GSM(String model, boolean hasSimCard, String simMobileNumber, Call lastIncomingCall, Call lastOutgoingCall){
		this(model);
		this.hasSimCard = hasSimCard;
		if(hasSimCard){
			if(!isValid(simMobileNumber)){
				System.out.println("Invalid sim number! ");
			}else{
				this.simMobileNumber = simMobileNumber;
			}
		}
		if(outgoingCallsDuration < 0){
			System.out.println("Invalid duration of outgoing calls! ");
		}else{
			this.outgoingCallsDuration += lastOutgoingCall.duration;
		}
		this.lastIncomingCall = lastIncomingCall;
		this.lastOutgoingCall = lastOutgoingCall;
	}
	
	boolean isValid(String number){
		return !((number == null) || (number.equals("")) || (("" + number).length() != 10) || !((("" + number).substring(0, 2)).equals("08")));
	}
	
	void insertSimCard(String simMobileNumber){
		if(!isValid(simMobileNumber)){
			System.out.println("Invalid sim number! ");
		}else{
			this.simMobileNumber = simMobileNumber;
			this.hasSimCard = true;
		}
	}

	void removeSimCard(){
		this.simMobileNumber = "no number";
		this.hasSimCard = false;
	}
	
	//nqma kak da priverq dali i dvata telefona imat sim carti ako podavam samo String receiver, syotvetno podavam GSM
	void call(GSM dialer, double duration){
		if(duration < 0){
			System.out.println("Invalid duration! ");
		}else{
			if(!(this.hasSimCard && dialer.hasSimCard)){
				System.out.println("One of the telephones has no sim card! ");
			}else{
				if(this.simMobileNumber.equals(dialer.simMobileNumber)){
					System.out.println("You can't call yourself! ");
				}else{
					this.outgoingCallsDuration += duration;
					this.lastOutgoingCall = new Call(dialer.simMobileNumber, this.simMobileNumber, duration);
					dialer.lastIncomingCall = new Call(this.simMobileNumber, dialer.simMobileNumber, duration);
				}
			}
		}
	}
	
	double getSumForCall(){
		return (this.outgoingCallsDuration * 0.15);
	}
	
	void printForLastOutgoingCall(){
		if(this.lastOutgoingCall != null){
			this.lastOutgoingCall.printCall();
		}
	}
	
	void printForLastIncomingCall(){
		if(this.lastIncomingCall != null){
			this.lastIncomingCall.printCall();
		}
	}
	
	void printGSM(){
		System.out.println("Model: " + this.model);
		System.out.println("Numeber: " + this.simMobileNumber);
		System.out.println("Outgoing calls duration: " + this.outgoingCallsDuration);
	}
}
