package school.maang.telegrambot;

import lombok.extern.slf4j.Slf4j;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
@Slf4j
public class Main {
    public static void main(String[] args) {
        try{
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            MyBot bot = new MyBot();
            botsApi.registerBot(bot);
            log.info("Ishga tushdi");

        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Hatolik yuzzaga keldi");
        }
    }
}
