package tasks.Gsm;

public class GSM {

	String model;
	boolean hasSim;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;

	void insertSimCard(String simMobileNumber) {
		char[] simArr = simMobileNumber.toCharArray();

		if (simArr.length == 10 && simArr[0] == '0' && simArr[1] == '8') {
			this.hasSim = true;
			this.simMobileNumber = simMobileNumber;			
		} else {
			System.out.println("No sim!");
		}
	}

	void removeSimCard() {
		if (this.hasSim == true) {
			this.hasSim = false;
		}
		this.simMobileNumber = null;
	}

	void call(Call call, GSM receiver) {
		call.caller = this;
		call.receiver = receiver;
		if (call.duration > 0 && !(this.simMobileNumber.equals(receiver.simMobileNumber)) && this.hasSim == true
				&& receiver.hasSim == true) {
			this.lastOutgoingCall = call;
			receiver.lastIncomingCall = call;
			this.outgoingCallsDuration += call.duration;
		} else {
			System.out.println("Error!");
		}
	}

	int getSumForCall(Call call) {
		int sum = this.outgoingCallsDuration * call.priceForAMinute;
		return sum;
	}

	void printInfoForLastIncomingCall() {
		System.out.println("Caller: " + this.lastIncomingCall.caller.simMobileNumber);
		System.out.println("Receiver: " + this.lastIncomingCall.receiver.simMobileNumber);
		System.out.println("Duration: " + this.lastIncomingCall.duration);
	}

	void printInfoForLastOutgoingCall() {
		System.out.println("Caller: " + this.lastOutgoingCall.caller.simMobileNumber);
		System.out.println("Receiver: " + this.lastOutgoingCall.receiver.simMobileNumber);
		System.out.println("Duration: " + this.lastOutgoingCall.duration);
	}
}
