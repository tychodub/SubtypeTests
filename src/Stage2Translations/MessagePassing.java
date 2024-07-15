package Stage2Translations;


import Stage2SupportClasses.Initiator;
import Stage2SupportClasses.Receiver;

public class MessagePassing {

    public static void main(String[] args) {
        Initiator initiator = new Initiator();
        //@ assert Perm(initiator.sentMessage,read) ** Perm(initiator.message,read);
        //@ assert initiator.sentMessage==false || (initiator.sentMessage==true && initiator.message!=null);
        initiator.setMessage("hello humans");
        //@ assert Perm(initiator.sentMessage,read) ** Perm(initiator.message,read);
        //@ assert initiator.sentMessage==false || (initiator.sentMessage==true && initiator.message!=null);
        Receiver receiver = new Receiver();
        //@ assert Perm(receiver.receivedMessage,read);
        //@ assert receiver.receivedMessage==null || receiver.receivedMessage!="";
        String initMessage = initiator.initialMessage();
        //@ assert Perm(initiator.sentMessage,read) ** Perm(initiator.message,read);
        //@ assert initiator.sentMessage==false || (initiator.sentMessage==true && initiator.message!=null);
        String response = receiver.initialResponse(initMessage);
        //@ assert Perm(receiver.receivedMessage,read);
        //@ assert receiver.receivedMessage==null || receiver.receivedMessage!="";
        initiator.receiveResponse(response);
        //@ assert Perm(initiator.sentMessage,read) ** Perm(initiator.message,read);
        //@ assert initiator.sentMessage==false || (initiator.sentMessage==true && initiator.message!=null);
    }
}
