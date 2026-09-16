package net.majid.structural.facade;

public class Test {
    public static void main(String[] args) {
        MessageFacade facade =
                new MessageFacade(
                        new MessageValidator(),
                        new TelegramClient(),
                        new MessageLogger()
                );

        facade.sendTelegram("0912...", "Hello");
    }
}
