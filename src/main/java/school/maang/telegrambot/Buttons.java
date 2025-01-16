package school.maang.telegrambot;

import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class Buttons {

    InlineKeyboardButton uzb = new InlineKeyboardButton();


    public SendMessage chooseLanguage(String chatId) {
        //buttons
        InlineKeyboardButton uzb = new InlineKeyboardButton();
        uzb.setText("\uD83C\uDDFA\uD83C\uDDFF O'zbek");
        uzb.setCallbackData("Uzb");
        //buttons
        InlineKeyboardButton rus = new InlineKeyboardButton();
        rus.setText("\uD83C\uDDF7\uD83C\uDDFA Русский");
        rus.setCallbackData("Rus");

        //button
        List<InlineKeyboardButton> row = new ArrayList<>();
        //row
        row.add(uzb);
        row.add(rus);
        //colum
        List<List<InlineKeyboardButton>> colum = new ArrayList<>();
        colum.add(row);

        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        markup.setKeyboard(colum);

        SendMessage message = new SendMessage();
        message.setText("Tilni tanlang / Выберите язык");
        message.setParseMode(ParseMode.HTML);
        message.setChatId(chatId);
        message.setReplyMarkup(markup);
        return message;

    }


    public SendMessage chooseCity(String chatId) {

        //buttons
        InlineKeyboardButton tosh = new InlineKeyboardButton();
        tosh.setText("Toshkent");
        tosh.setCallbackData("Tosh");

        //buttons
        InlineKeyboardButton sam = new InlineKeyboardButton();
        sam.setText("Samarqand");
        sam.setCallbackData("Sam");

        InlineKeyboardButton bux = new InlineKeyboardButton();
        bux.setText("Buxoro");
        bux.setCallbackData("Bux");



        //button
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        List<InlineKeyboardButton> row3 = new ArrayList<>();


        row1.add(tosh);
        row2.add(sam);
        row3.add(bux);


        //colum
        List<List<InlineKeyboardButton>> colum = new ArrayList<>();
        colum.add(row1);
        colum.add(row2);
        colum.add(row3);




        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        markup.setKeyboard(colum);

        SendMessage message = new SendMessage();
        message.setText("Viloyatni tanlang\uD83C\uDDFA\uD83C\uDDFF");
        message.setChatId(chatId);
        message.setReplyMarkup(markup);
        return message;

    }

}



