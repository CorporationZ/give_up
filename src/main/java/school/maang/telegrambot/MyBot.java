package school.maang.telegrambot;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendAudio;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.*;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.util.Optional;

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
            chatId = message.getChatId().toString();

            if (message.hasText()) {
                String text = message.getText();

                if (text.equalsIgnoreCase("/start")) {
                    sendTelegram(buttons.chooseLanguage(chatId));
                } else if (text.equalsIgnoreCase("\uD83E\uDD59 Ovqatlar")) {
                    sendTelegram(buttons.ovqatlar(chatId));
                } else if (text.equalsIgnoreCase("Back")) {
                    sendTelegram(buttons.menu(chatId));
                } else if (text.equalsIgnoreCase("Lavash")) {
                    openBox(buttons.sendProduct(text, chatId).get());
                } else if (text.equalsIgnoreCase("Burger")) {
                    openBox(buttons.sendProduct(text, chatId).get());
                } else if (text.equalsIgnoreCase("Hotdog")) {
                    openBox(buttons.sendProduct(text, chatId).get());
                } else if (text.equalsIgnoreCase("Danar")) {
                    openBox(buttons.sendProduct(text, chatId).get());
                }else if(text.equalsIgnoreCase("ashula")){

                    InputFile file = new InputFile(new File("C:\\Users\\Asus\\Desktop\\Ovqat\\ashula.mp3"));

                    SendAudio audio = new SendAudio();
                    audio.setAudio(file);
                    audio.setCaption("Bu juda zor qo'shiq");
                    audio.setChatId(chatId);

                    try {
                        execute(audio);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                else {

                    openBox(buttons.sendProduct(text, chatId).get());
                }

            }
            else if (message.hasContact()) {
                sendTelegram(buttons.registerLocation(chatId));
            }
            else if (message.hasLocation()) {
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

    private void openBox(Object o) {
        if (o instanceof SendMessage) {
            sendTelegram((SendMessage) o);
        } else {
            sendTelegram((SendPhoto) o);
        }
    }

    private void sendTelegram(SendMessage sendMessage) {
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            log.error("Error : {}", e.getMessage());
        }
    }

    private void sendTelegram(SendPhoto sendPhoto) {
        try {
            execute(sendPhoto);
        } catch (TelegramApiException e) {
            log.error("Error : {}", e.getMessage());
        }
    }

}
