package Stage2Examples;

import Stage2SupportClasses.Initiator;
import Stage2SupportClasses.Receiver;

public class MessagePassing {
    //@ subtype initiator(Initiator x)() = x.sentMessage==false || (x.sentMessage==true && x.message!=null);
    //@ subtype receiver(Receiver x)() = x.receivedMessage==null || receiver.receivedMessage!="";

    public static void main(String[] args) {
        /*@ initiator @*/ Initiator initiator = new Initiator();
        //@ assert Perm(initiator.sentMessage,read) ** Perm(initiator.message,read);
        initiator.setMessage("hello humans");
        //@ assert Perm(initiator.sentMessage,read) ** Perm(initiator.message,read);
        /*@ receiver @*/ Receiver receiver = new Receiver();
        //@ assert Perm(receiver.receivedMessage,read);
        String initMessage = initiator.initialMessage();
        //@ assert Perm(initiator.sentMessage,read) ** Perm(initiator.message,read);
        String response = receiver.initialResponse(
                initMessage
        );
        //@ assert Perm(receiver.receivedMessage,read);
        initiator.receiveResponse(response);
        //@ assert Perm(initiator.sentMessage,read) ** Perm(initiator.message,read);
    }
}
