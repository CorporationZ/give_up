package school.maang.telegrambot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class MyBot extends TelegramLongPollingBot {

    private final InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
    private final List<List<InlineKeyboardButton>> rows = new ArrayList<>();
    private final List<InlineKeyboardButton> row = new ArrayList<>();


    @Override
    public String getBotUsername() {
        return "@ob_havo_uz0_bot";
    }

    @Override
    public String getBotToken() {
        return "7266025772:AAHOPGFHmZsGG13WOwILOOTtOyZ8sBjFmpY";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();
            String chatId = update.getMessage().getChatId().toString();

            if (messageText.equals("/start")) {
                SendMessage message = new SendMessage();
                message.setChatId(chatId);
                message.setText("Toshkent shahar ob-havosi haqida ma'lumot olish uchun tugmani bosing:");

                InlineKeyboardButton button = new InlineKeyboardButton();
                button.setText("Toshkent shahar ob-havosi");
                button.setUrl("https://www.gismeteo.ru/weather-tashkent-5331/10-days/");
                row.add(button);

                rows.add(row);
                markup.setKeyboard(rows);

                message.setReplyMarkup(markup);

                try {
                    execute(message);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
