package school.maang.telegrambot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MyBot extends TelegramLongPollingBot {
    @Override
    public  String getBotToken(){
        return "7628712941:AAGq4cyKnm2T-kULLsX_5BmZbIR9I7fJR2I";
    }


    @Override
    public String getBotUsername() {
        return "https://t.me/Math_uzb_misolbot";
    }
    @Override
    public void onUpdateReceived(Update update) {

    }
}
