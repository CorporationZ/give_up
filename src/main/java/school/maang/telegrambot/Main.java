package school.maang.telegrambot;

import lombok.extern.slf4j.Slf4j;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Slf4j
public class Main {
    public static void main(String[] args) {

        try {
            TelegramBotsApi botApi = new TelegramBotsApi(DefaultBotSession.class);
            botApi.registerBot(new MyBot());
            log.info("Bot ishga tushdi ! ! !");
        } catch (Exception e) {
            e.printStackTrace();
            log.info("Xatolik yuzaga keldi ! ! !");
        }
    }
}
