package abstraction.messagingapplication;

public class User implements MessageSender {
    private String username;
    private String status;

    public User(String username, String status) {
        this.username = username;
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println(username + " is sending a message to " + recipient + ": " + message);
    }

    @Override
    public void receiveMessage(String message, String sender) {
        System.out.println(username + " received a message from " + sender + ": " + message);
    }
}
