package school.maang.telegrambot;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;


public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        try {
            TelegramBotsApi botApi = new TelegramBotsApi(DefaultBotSession.class);
            MyBot bot = new MyBot();
            botApi.registerBot(bot); // Ёки botApi.registerBot(new MyBot());
            log.info("Bot ishga tushdi..");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
