package abstraction.messagingapplication;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("kbabayevv", "online");
        User user2 = new User("orxanrehimov", "online");

        user1.sendMessage("Happy birthday!", user2.getUsername());
        user1.receiveMessage("Thank you!", user2.getUsername());

        user2.sendMessage("How are u? everything is ok?",user1.getUsername());
        user2.receiveMessage("Everything is ok,Thank you for your attention!",user1.getUsername());

    }
}
