package net.majid.structural.facade;

public class MessageFacade {

    private final MessageValidator validator;
    private final TelegramClient telegramClient;
    private final MessageLogger logger;

    public MessageFacade(
            MessageValidator validator,
            TelegramClient telegramClient,
            MessageLogger logger) {

        this.validator = validator;
        this.telegramClient = telegramClient;
        this.logger = logger;
    }

    public void sendTelegram(String receiver, String content) {

        validator.validate(receiver, content);

        logger.log(receiver, content);

        telegramClient.send(receiver, content);
    }
}
