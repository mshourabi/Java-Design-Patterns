package net.majid.behavioral.mediator;

class User {

    private final String name;
    private final ChatMediator mediator;

    public User(String name,ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void send(String message) {
        mediator.sendMessage(message, this);
    }

    public void receive(String message) {
        System.out.println(name + " received: " + message);
    }
}
