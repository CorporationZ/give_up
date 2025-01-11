package school.maang.telegrambot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {

    private static final Logger log = LoggerFactory.getLogger(MyBot.class);

    @Override
    public String getBotUsername() {
        return "@javobsind_uz_bot";
    }

    @Override
    public String getBotToken() {
        return "7602180776:AAHJQVrW4CjM70zxiDqWruTn_v-Xk7cewlA";
    }

    @Override
    public void onUpdateReceived(Update update) {
        log.debug("update ishladi !!! .................");

        if (update.hasMessage()) {
            Message message = update.getMessage();

            if (message.hasText()) {
                String text = message.getText();

                if (text.equals("/start")) {
                    SendMessage habar = new SendMessage();
                    habar.setText("Assalomu alaykum");
                    habar.setChatId(message.getChatId());
                    //execute(habar);
                    try {
                        execute(habar);
                    } catch (TelegramApiException e) {
                        log.error("Excute : {}", e.getMessage());
                    }
                } else if (text.equals("Voaleykum assalom")) {
                    SendMessage habar = new SendMessage();
                    habar.setText("Ishlaringiz qanday");
                    habar.setChatId(message.getChatId());
                    try {
                        execute(habar);
                    } catch (TelegramApiException e) {
                        log.error("Excute : {}", e.getMessage());
                    }
                } else if (text.equals("Yahshi rahmat")) {
                    SendMessage habar = new SendMessage();
                    habar.setText("Sizga qanday yordam bera olaman, yordam kerakmi");
                    habar.setChatId(message.getChatId());
                    try {
                        execute(habar);
                    } catch (TelegramApiException e) {
                        log.error("Excute : {}", e.getMessage());
                    }
                } else if (text.equals("yo`q")) {
                    SendMessage habar = new SendMessage();
                    habar.setText("Salomat boling");
                    habar.setChatId(message.getChatId());
                    try {
                        execute(habar);
                    } catch (TelegramApiException e) {
                        log.error("Excute : {}", e.getMessage());
                    }
                } else if (text.equals("ha")) {
                    SendMessage habar = new SendMessage();
                    habar.setText("Qanday yordam? Murojatingizni yozma qoldirishingiz mumkin");
                    habar.setChatId(message.getChatId());
                    try {
                        execute(habar);
                    } catch (TelegramApiException e) {
                        log.error("Excute : {}", e.getMessage());
                    }
                } else if (text.equals("Murojaat")) {
                    SendMessage habar = new SendMessage();
                    habar.setText("Sizning murojatingiz qabuk qilindi, tez orada sizga habar yuboriladi.");
                    habar.setChatId(message.getChatId());
                    try {
                        execute(habar);
                    } catch (TelegramApiException e) {
                        log.error("Excute : {}", e.getMessage());
                    }
                }
            }
        }
    }
}

