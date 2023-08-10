package abstraction.messagingapplication;

public interface MessageSender {
    void sendMessage(String message, String recipient);
    void receiveMessage(String message, String sender);
}
