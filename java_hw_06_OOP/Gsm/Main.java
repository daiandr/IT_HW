package tasks.Gsm;

public class Main {
	public static void main(String[] args) {
		
		Call newCall = new Call();
		newCall.priceForAMinute = 15;
		newCall.duration = 30;
		
		GSM myGsm = new GSM();
		myGsm.model = "nokia";		
		GSM yourGsm = new GSM();
		yourGsm.model = "samsung";
		
		
		myGsm.insertSimCard("0883516714");
		yourGsm.insertSimCard("0888415978");
		
		myGsm.call(newCall, yourGsm);
		
		myGsm.printInfoForLastOutgoingCall();
		yourGsm.printInfoForLastIncomingCall();
		
		System.out.println(myGsm.getSumForCall(newCall));
		
	}
}
