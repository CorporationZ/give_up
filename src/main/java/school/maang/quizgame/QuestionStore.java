package school.maang.quizgame;

import java.util.ArrayList;
import java.util.List;

public class QuestionStore {
    private final List<Question> questions;

    public QuestionStore() {
        this.questions = new ArrayList<>();
        initializeQuestions();
    }

    private void initializeQuestions() {
        questions.add(new Question("1-savol: final kalit so‘zi qanday ma’noni anglatadi?",
                List.of("O‘zgaruvchi qiymati o‘zgarishi mumkin",
                        "O‘zgaruvchi qiymati o‘zgarmas bo‘ladi",
                        "Bu metod faqat o‘qilishi mumkin"), "b"));
        questions.add(new Question("2-savol: JVM nimani anglatadi?",
                List.of("Java Virtual Machine",
                        "Java Visual Model",
                        "Java Version Manager"), "a"));
        questions.add(new Question("3-savol: Java-da ArrayList qanday ishlatiladi?",
                List.of("Statik o‘lchamga ega massiv yaratadi",
                        "Dinamik o‘lchamga ega ro‘yxat yaratadi",
                        "Obyektlarni jadval shaklida saqlaydi"), "b"));
        questions.add(new Question("4-savol: Java ning asosiy xususiyati nima?",
                List.of("Platformaga bog'liq",
                        "Platformaga bog'liq emas",
                        "Tez ishlash"), "b"));
        questions.add(new Question("5-savol: Java dasturlarining kengaytmasi nima?",
                List.of(".java", ".class", ".jav"), "a"));
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
