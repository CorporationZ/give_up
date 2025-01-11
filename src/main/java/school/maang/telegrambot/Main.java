package school.maang.telegrambot;


import lombok.extern.slf4j.Slf4j;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;


@Slf4j
public class Main {
    public static void main(String[] args) {
        try {
            TelegramBotsApi botApi = new TelegramBotsApi(DefaultBotSession.class);
            MyBot bot = new MyBot();
            botApi.registerBot(bot);
            log.info("Bo't ishga tushdi.");
        } catch (Exception e) {
            log.error("Hatolik yuzaga keldi.");
        }
    }
}
