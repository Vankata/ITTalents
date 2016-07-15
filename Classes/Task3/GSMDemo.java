
public class GSMDemo {

	
	public static void main(String[] args) {
	
		Call firstCall = new Call("0878788032", "0878123421", 0.56);
		Call secondCall = new Call("0878123421", "0878788032", 1.53);
		firstCall.printCall();
		secondCall.printCall();
		
		GSM myGSM = new GSM("Sony", true, "0878788032", secondCall, firstCall);
		GSM otherGSM = new GSM("Huawei", true, "0878123421", firstCall, secondCall);
		myGSM.printGSM();
		System.out.println();
		myGSM.printForLastIncomingCall();
		System.out.println();
		myGSM.printForLastOutgoingCall();
		System.out.println();
		myGSM.removeSimCard();
		myGSM.printGSM();
		myGSM.insertSimCard("0878788032");
		myGSM.printGSM();
		myGSM.call(otherGSM, 2.03);
		myGSM.printGSM();
		System.out.println(myGSM.getSumForCall());
	}

}
