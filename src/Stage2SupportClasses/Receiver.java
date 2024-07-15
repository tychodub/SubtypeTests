package Stage2SupportClasses;

public class Receiver {
    private String receivedMessage = null;

    //@ ensures Perm(this.receivedMessage,1);
    //@ ensures this.receivedMessage == null;
    public Receiver() {}

    //@ requires message!=null ** message!="" ** Perm(this.receivedMessage,1);
    //@ ensures Perm(this.receivedMessage,1);
    //@ ensures message!= null && this.receivedMessage!="";
    public String initialResponse(String message) {
        receivedMessage = message;
        return "ACK";
    }
}