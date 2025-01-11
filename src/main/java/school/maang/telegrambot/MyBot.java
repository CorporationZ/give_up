package school.maang.telegrambot;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.*;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Slf4j
public class MyBot extends TelegramLongPollingBot {

    private static final String BOT_USER = "@papugay_uz_bot";
    private static final String BOT_TOKEN = "8050362285:AAGp2Z1mxSY7Fp6eBNrBP_qMFfMRjpaNqSY";
    private static final Buttons buttons = new Buttons();

    private String chatId = "";

    @Override
    public String getBotUsername() {
        return BOT_USER;
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage()) {
            Message message = update.getMessage();

            if (message.hasText()) {
                String text = message.getText();

                if (text.equalsIgnoreCase("/start")) {
                    chatId = message.getChatId().toString();
                    sendTelegram(buttons.chooseLanguage(chatId));
                } else if (text.equalsIgnoreCase("\uD83C\uDF81 Promokodni ro'yxatdan o'tkazish")) {

                }

            } else if (message.hasContact()) {
                /*Contact contact = message.getContact();

                SendMessage sendMessage = new SendMessage();
                sendMessage.setText(contact.getFirstName() + "\n" + contact.getPhoneNumber());
                sendMessage.setChatId("1732668204");
                sendTelegram(sendMessage);*/
                sendTelegram(buttons.registerLocation(chatId));
            } else if (message.hasLocation()) {
                Location location = message.getLocation();
                sendTelegram(buttons.menu(chatId));
            }

        } else if (update.hasCallbackQuery()) {

            CallbackQuery callbackQuery = update.getCallbackQuery();

            String data = callbackQuery.getData();

            if (data.equalsIgnoreCase("uzb")) {
                sendTelegram(buttons.registerPhone(chatId));
            }
        }
    }

    private void sendTelegram(SendMessage sendMessage) {
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            log.error("Error : {}", e.getMessage());
        }
    }

}
