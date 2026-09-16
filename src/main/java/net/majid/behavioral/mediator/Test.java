package net.majid.behavioral.mediator;

public class Test {
    public static void main(String[] args) {


        ChatMediator chatRoom = new ChatRoom();

        User ali = new User("Ali", chatRoom);
        User reza = new User("Reza", chatRoom);
        User majid = new User("Majid", chatRoom);

        chatRoom.addUser(ali);
        chatRoom.addUser(reza);
        chatRoom.addUser(majid);

        ali.send("Hello!");
    }
}
