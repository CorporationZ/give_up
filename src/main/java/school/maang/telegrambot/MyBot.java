package school.maang.telegrambot;

import lombok.Data;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.*;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import school.maang.Main;

@Slf4j
public class MyBot extends TelegramLongPollingBot {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    private static final Buttons buttons = new Buttons();

    private String chatId = "";

    @Override
    public String getBotToken() {
        return "7628712941:AAGq4cyKnm2T-kULLsX_5BmZbIR9I7fJR2I";
    }


    @Override
    public String getBotUsername() {

        return "@Math_uzb_misolbot";
    }

    @SneakyThrows
    @Override

    public void onUpdateReceived(Update update) {

        if (update.hasMessage()) {
            Message habar = update.getMessage();
            if (habar.hasText()) {
                String text = habar.getText();

                if (text.equalsIgnoreCase("/start")) {
                    chatId = habar.getChatId().toString();
                    sendTelegram(buttons.chooseLanguage(chatId));


                } else if (text.equalsIgnoreCase("\uD83C\uDF2FOvqatlar")) {
                    sendTelegram(buttons.ovqatlar(chatId));
                }
                else if (text.equalsIgnoreCase("⬅\uFE0FBack")) {
                    sendTelegram(buttons.menyu(chatId));
                }


            } else if (habar.hasContact()) {
                Contact contact = habar.getContact();

             /*   SendMessage sendMessage = new SendMessage();
                sendMessage.setText(contact.getFirstName() + "\n" + contact.getPhoneNumber());
                sendMessage.setChatId("1061235879");
                sendTelegram(sendMessage);*/

                sendTelegram(buttons.registrLocation(chatId));

            } else if (habar.hasLocation()) {
                Location location = habar.getLocation();
                sendTelegram(buttons.menyu(chatId));

            }


        } else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            if (data.equalsIgnoreCase("uzb")) {
                sendTelegram(buttons.registrPhone(chatId));
            }

        }

    }

    private void sendTelegram(SendMessage sendMessage) {
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            log.info("Error : {}", e.getMessage());
        }
        ;

    }
}


