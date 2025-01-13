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
//INlayn button
        InlineKeyboardButton uzb = new InlineKeyboardButton();
        uzb.setText(("\uD83C\uDDFA\uD83C\uDDFFO'zbek tili"));
        uzb.setCallbackData("uzb");

        InlineKeyboardButton rus = new InlineKeyboardButton();
        rus.setText(("\uD83C\uDDF7\uD83C\uDDFAРуский"));
        rus.setCallbackData("rus");

        List<InlineKeyboardButton> row = new ArrayList<>();

        row.add(uzb);
        row.add(rus);
//colum
        List<List<InlineKeyboardButton>> colum = new ArrayList<>();
        colum.add(row);


        //Markup
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        markup.setKeyboard(colum);


        SendMessage habar = new SendMessage();
        habar.setText("Tilni tanlang / Выберите язык ");
        habar.setParseMode(ParseMode.HTML);
        habar.setChatId(chatId);
        habar.setReplyMarkup(markup);

        return habar;


    }


    //keybort phone
    public SendMessage registrPhone(String chatId) {
        KeyboardButton phoneButton = new KeyboardButton();
        phoneButton.setText("\uD83D\uDCDE Telefon raqam ");
        phoneButton.setRequestContact(true);

        KeyboardRow row = new KeyboardRow();
        row.add(phoneButton);

        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row);

        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);


        SendMessage habar = new SendMessage();
        habar.setText("Royxatdan otish uchun raqam yuboring ");
        habar.setChatId(chatId);
        habar.setReplyMarkup(markup);


        return habar;
    }
//location
    public SendMessage registrLocation(String chatId) {
        KeyboardButton locationButton = new KeyboardButton();
        locationButton.setText("\uD83D\uDCCD Manzilingizni yuboring ");
        locationButton.setRequestLocation(true);

        KeyboardRow row = new KeyboardRow();
        row.add(locationButton);

        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row);

        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(rowList);
        markup.setResizeKeyboard(true);


        SendMessage habar = new SendMessage();
        habar.setText("Manzilingizni yuboring ");
        habar.setChatId(chatId);
        habar.setReplyMarkup(markup);

        return habar;

    }

//Menu
    public SendMessage menyu(String chatId) {
        KeyboardButton menuButton = new KeyboardButton();
        menuButton.setText("\uD83D\uDCCD Menyu ");
        menuButton.setRequestLocation(true);



        KeyboardButton rasm = new KeyboardButton();
        rasm.setText("\uD83C\uDF81 Aksiya");

        KeyboardButton lavash = new KeyboardButton();
        lavash.setText("\uD83E\uDED4 Lavash");

        KeyboardButton burger = new KeyboardButton();
        burger.setText(" \uD83C\uDF54Burger");

        KeyboardButton hotdog = new KeyboardButton();
        hotdog.setText(" \uD83C\uDF2D HotDog");


        KeyboardRow row = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();

        row.add(rasm);
        row.add(lavash);

        row2.add(burger);
        row2.add(hotdog);

        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row);
        rowList.add(row2);

        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setResizeKeyboard(true);
        markup.setKeyboard(rowList);

        SendMessage message = new SendMessage();
        message.setText("\uD83C\uDFE1 Menyuga hush kelibsiz ");
        message.setChatId(chatId);
        message.setReplyMarkup(markup);

        return message;
    }
}
