package school.maang.telegrambot;

import lombok.extern.slf4j.Slf4j;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Slf4j
public class MyBot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "@papugay_uz_bot";
    }

    @Override
    public String getBotToken() {
        return "8050362285:AAGp2Z1mxSY7Fp6eBNrBP_qMFfMRjpaNqSY";
    }

    @Override
    public void onUpdateReceived(Update update) {
        log.info("Foydalanuvchi habar yubordi :{}", update.getMessage().getFrom().getUserName());

        if (update.hasMessage()) {
            Message message = update.getMessage();

            if (message.hasText()) {
                String text = message.getText();

                SendMessage habar = new SendMessage();
                habar.setText(text);
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
