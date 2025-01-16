package school.maang.telegrambot;

import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;



class MyBot extends TelegramLongPollingBot {
    private static final Logger log = LoggerFactory.getLogger(MyBot.class);
    private static final Buttons buttons = new Buttons();

    String chatId = "";
    private static String userCity = "";

    @Override
    public String getBotToken() {
        return "7580910849:AAHPJCULhZ3QQQ49PH18MxVHPOeOHrYOwMY";
    }

    @Override
    public String getBotUsername() {
        return "@weather625_bot";
    }

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
        System.out.println("Habar jonatildi");

        if (update.hasMessage()) {
            Message message = update.getMessage();
            if (message.hasText()) {
                String text = message.getText();
                String chatId = message.getChatId().toString();

                if (text.equalsIgnoreCase("/start")) {
                    execute(buttons.chooseLanguage(chatId));
                }
            }
        }

        if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            String chatId = callbackQuery.getMessage().getChatId().toString();

            // Shahar tanlash tugmachalarini qayta ishlash
            if (data.equalsIgnoreCase("Sam")) {
                SendMessage message = new SendMessage();
                message.setChatId(chatId);
                message.setText("16-yanvar kuni Samarqandda ob-havo quyidagicha bo‘ladi:\n" +
                        "\n" +
                        "Havo bulutli, yog‘ingarchilik kutilmaydi.\n" +
                        "Harorat kechasi 2-4°C, kunduzi 9-11°C iliq bo‘ladi.\n" +
                        "Shamol sharqdan 3-6 m/s tezlikda esadi.\n" +
                        "Ayrim joylarda tuman tushishi mumkin.");
                execute(message);
            } else if (data.equalsIgnoreCase("Tosh")) {
                SendMessage message = new SendMessage();
                message.setChatId(chatId);
                message.setText("16-yanvar kuni Toshkentda ob-havo shunday bo‘ladi:\n" +
                        "\n" +
                        "Havo bulutli, yog‘ingarchilik kutilmaydi.\n" +
                        "Harorat kechasi 3-5°C, kunduzi 10-12°C iliq bo‘ladi.\n" +
                        "Shamol janubi-sharqdan 3-7 m/s tezlikda esadi.\n" +
                        "Bu ob-havo sharoitlariga mos ravishda tayyorlanish tavsiya etiladi.");
                execute(message);
            } else if (data.equalsIgnoreCase("Bux")) {
                SendMessage message = new SendMessage();
                message.setChatId(chatId);
                message.setText("\n" +
                        "16-yanvar kuni Buxoroda ob-havo quyidagicha bo‘ladi:\n" +
                        "\n" +
                        "Havo bulutli, yog‘ingarchilik kutilmaydi.\n" +
                        "Harorat kechasi 2-4°C, kunduzi 10-12°C iliq bo‘ladi.\n" +
                        "Shamol janubi-sharqdan 3-7 m/s tezlikda esadi.\n" +
                        "Ayrim joylarda tuman tushishi mumkin.");
                execute(message);
            }

                // Foydalanuvchi tilni tanlasa, shaharlarni tanlash menyusini ko‘rsatish
                if (data.equalsIgnoreCase("Uzb")) {
                    execute(buttons.chooseCity(chatId));
                }
            }
        }
    }



