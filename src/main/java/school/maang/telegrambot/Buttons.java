package school.maang.telegrambot;

import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class Buttons {

    public SendMessage chooseLanguage(String chatId) {

        InlineKeyboardButton uzb = new InlineKeyboardButton();
        uzb.setText("\uD83C\uDDFA\uD83C\uDDFF O'zbek");
        uzb.setCallbackData("uzb");

        InlineKeyboardButton rus = new InlineKeyboardButton();
        rus.setText("\uD83C\uDDF7\uD83C\uDDFA Русский");
        rus.setCallbackData("rus");

        //row
        List<InlineKeyboardButton> row = new ArrayList<>();
        row.add(uzb);
        row.add(rus);

        //colum
        List<List<InlineKeyboardButton>> colum = new ArrayList<>();
        colum.add(row);

        //markup
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        markup.setKeyboard(colum);

        SendMessage message = new SendMessage();
        message.setText("Tilni tanlang / Выберите язык");
        message.setParseMode(ParseMode.HTML);
        message.setChatId(chatId);
        message.setReplyMarkup(markup);
        return message;
    }

    public SendMessage registerPhone(String chatId) {
        KeyboardButton phoneButton = new KeyboardButton();
        phoneButton.setText("☎\uFE0F Phone number");
        phoneButton.setRequestContact(true);

        KeyboardRow row = new KeyboardRow();
        row.add(phoneButton);

        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row);

        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);

        SendMessage message = new SendMessage();
        message.setText("Ro'yxatdan o'tish uchun raqam jo'natng !");
        message.setChatId(chatId);
        message.setReplyMarkup(markup);
        return message;
    }

    public SendMessage registerLocation(String chatId) {
        KeyboardButton locationButton = new KeyboardButton();
        locationButton.setText("\uD83D\uDCCD Location");
        locationButton.setRequestLocation(true);

        KeyboardRow row = new KeyboardRow();
        row.add(locationButton);

        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row);

        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);

        SendMessage message = new SendMessage();
        message.setText("Ro'yxatdan o'tish uchun location jo'natng !");
        message.setChatId(chatId);
        message.setReplyMarkup(markup);
        return message;
    }

    public SendMessage menu(String chatId) {
        KeyboardButton promo = new KeyboardButton();
        promo.setText("\uD83C\uDF81 Promokodni ro'yxatdan o'tkazish");

        KeyboardButton myPromo = new KeyboardButton();
        myPromo.setText("\uD83D\uDECD Mening promokodlarim");

        KeyboardButton profile = new KeyboardButton();
        profile.setText("\uD83D\uDC64 Shaxsiy kabinet");

        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        row1.add(promo);
        row2.add(profile);
        row2.add(myPromo);

        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row1);
        rowList.add(row2);

        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setResizeKeyboard(true);
        markup.setKeyboard(rowList);

        SendMessage message = new SendMessage();
        message.setText("\uD83C\uDFD8 Asosiy Menyu");
        message.setChatId(chatId);
        message.setReplyMarkup(markup);
        return message;
    }
}
