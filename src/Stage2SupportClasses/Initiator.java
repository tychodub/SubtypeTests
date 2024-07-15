package Stage2SupportClasses;

import java.util.Objects;

public class Initiator {
    private boolean sentMessage = false;
    private String message = null;

    //@ ensures Perm(this.message,1) ** Perm(this.sentMessage,1);
    //@ ensures this.message==null && this.sentMessage==false;
    public Initiator() {

    }

    //@ requires Perm(this.message,1);
    //@ ensures  Perm(this.message,1);
    //@ ensures this.message == protocol;
    public void setMessage(String protocol) {
        message = protocol;
    }

    //@ requires Perm(this.sentMessage,1) ** Perm(this.message,1\2);
    //@ ensures Perm(this.sentMessage,1) ** Perm(this.message,1\2);
    //@ ensures sentMessage == true && \result==\old(this.message);
    public String initialMessage() {
        sentMessage = true;
        return message;
    }

    //@ requires Perm(this.sentMessage,1);
    //@ ensures Perm(this.sentMessage,1);
    public String receiveResponse(String message) {
        if (Objects.equals(message, "ACK")) {
            sentMessage = false;
            return "terminate";
        } else {
            return "";
        }
    }
}