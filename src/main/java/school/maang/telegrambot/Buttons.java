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
    //aksiya

    public SendMessage aksiya(String chatId) {
        KeyboardButton aksiyaButton = new KeyboardButton();
        aksiyaButton.setText("\uD83C\uDF81 Aksiya ");
        aksiyaButton.setRequestLocation(true);



        KeyboardButton rasm1 = new KeyboardButton();
        rasm1.setText("2 ta cola 10 ming");

        KeyboardButton lavash3 = new KeyboardButton();
        lavash3.setText("3 ta lavash 60 ming");

        KeyboardButton danar1 = new KeyboardButton();
        danar1.setText(" 4 ta danar 70 ming");



        KeyboardRow row = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();

        row.add(rasm1);
        row.add(lavash3);

        row2.add(danar1);


        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row);
        rowList.add(row2);

        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setResizeKeyboard(true);
        markup.setKeyboard(rowList);

        SendMessage message = new SendMessage();
        message.setText("\uD83C\uDF81Aksiyadagi mahsulotlar");
        message.setChatId(chatId);
        message.setReplyMarkup(markup);

        return message;
    }

    //lavash
    public SendMessage lavash1(String chatId) {
        KeyboardButton lavash1Button = new KeyboardButton();
        lavash1Button.setText("\uD83C\uDF81 Lavash ");
        lavash1Button.setRequestLocation(true);

        KeyboardButton lavash2 = new KeyboardButton();
        lavash2.setText("mini lavash 25 ming");

        KeyboardButton lavash4 = new KeyboardButton();
        lavash4.setText("katta lavash 30 ming");

        KeyboardButton lavash5 = new KeyboardButton();
        lavash5.setText("sirli lavash 33 ming");

        // "Orqaga qaytish" tugmasi
        KeyboardButton backButton = new KeyboardButton();
        backButton.setText("⬅ Orqaga qaytish");

        // KeyboardRow yaratish
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow(); // Orqaga qaytish uchun yangi qator

        row.add(lavash2);
        row2.add(lavash4);
        row3.add(lavash5);
        row4.add(backButton); // Orqaga qaytish tugmasini qo'shish

        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4); // Yangi qatorni qo‘shish

        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setResizeKeyboard(true);
        markup.setKeyboard(rowList);

        SendMessage message = new SendMessage();
        message.setText("\uD83E\uDED4Lavashlar");
        message.setChatId(chatId);
        message.setReplyMarkup(markup);

        return message;
    }
    public SendMessage burger(String chatId) {
        KeyboardButton burger1Button = new KeyboardButton();
        burger1Button.setText("\uD83C\uDF81 Lavash ");
        burger1Button.setRequestLocation(true);

        KeyboardButton burger2 = new KeyboardButton();
        burger2.setText("mini  25 miburgerng");

        KeyboardButton burger4 = new KeyboardButton();
        burger4.setText("katta burger 30 ming");

        KeyboardButton burger5 = new KeyboardButton();
        burger5.setText("sirli burger 33 ming");

        // "Orqaga qaytish" tugmasi
        KeyboardButton backButton = new KeyboardButton();
        backButton.setText("⬅ Orqaga qaytish");

        // KeyboardRow yaratish
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow(); // Orqaga qaytish uchun yangi qator

        row.add(burger2);
        row2.add(burger4);
        row3.add(burger5);
        row4.add(backButton); // Orqaga qaytish tugmasini qo'shish

        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4); // Yangi qatorni qo‘shish

        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setResizeKeyboard(true);
        markup.setKeyboard(rowList);

        SendMessage message = new SendMessage();
        message.setText("\uD83C\uDF54Burger");
        message.setChatId(chatId);
        message.setReplyMarkup(markup);

        return message;
    }
    //hotdog

    public SendMessage hotdog(String chatId) {
        KeyboardButton  hotdogButton = new KeyboardButton();
        hotdogButton.setText("\uD83C\uDF81 Lavash ");
        hotdogButton.setRequestLocation(true);

        KeyboardButton hotdog2 = new KeyboardButton();
        hotdog2.setText("mini  25 mini  hotdog");

        KeyboardButton  hotdog4 = new KeyboardButton();
        hotdog4.setText("katta  hotdog 30 ming");

        KeyboardButton  hotdog5 = new KeyboardButton();
        hotdog5.setText("sirli  hotdog 33 ming");

        // "Orqaga qaytish" tugmasi
        KeyboardButton backButton = new KeyboardButton();
        backButton.setText("⬅ Orqaga qaytish");

        // KeyboardRow yaratish
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow(); // Orqaga qaytish uchun yangi qator

        row.add( hotdog2);
        row2.add( hotdog4);
        row3.add( hotdog5);
        row4.add(backButton); // Orqaga qaytish tugmasini qo'shish

        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(row);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4); // Yangi qatorni qo‘shish

        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setResizeKeyboard(true);
        markup.setKeyboard(rowList);

        SendMessage message = new SendMessage();
        message.setText(" \uD83C\uDF2D HotDog");
        message.setChatId(chatId);
        message.setReplyMarkup(markup);

        return message;
    }



}
