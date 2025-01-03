package school.maang.quizgame;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    private ArrayList<Question> questions; // savollar ro'yxati.
    private int totalScore; // umumiy to'plagan ballar

    // konstruktor
    public Controller() {
        this.questions = new ArrayList<>();
        this.totalScore = 0; // boshlang'ich qiymatini 0 deb olamiz
        initializeQuestions();
    }

    // .addQuestion metodi orqali yana savollar qo'shishingiz mumkin
    private void initializeQuestions() {
        questions.add(new Question("1-savol: final kalit so‘zi qanday ma’noni anglatadi?", "a. O‘zgaruvchi qiymati o‘zgarishi mumkin", "b. O‘zgaruvchi qiymati o‘zgarmas bo‘ladi", "c. Bu metod faqat o‘qilishi mumkin", "b"));
        questions.add(new Question("2-savol: JVM nimani anglatadi?", "a. Java Virtual Machine", "b. Java Visual Model", "c. Java Version Manager", "a"));
        questions.add(new Question("3-savol: Java-da ArrayList qanday ishlatiladi?", "a. Statik o‘lchamga ega massiv yaratadi", "b. Dinamik o‘lchamga ega ro‘yxat yaratadi", "c. Obyektlarni jadval shaklida saqlaydi", "b"));
        questions.add(new Question("4-savol: Java ning asosiy xususiyati nima?", "a. Platformaga bog'liq", "b. Platformaga bog'liq emas", "c. Tez ishlash", "b"));
        questions.add(new Question("5-savol: Java dasturlarining kengaytmasi nima?", "a. .java", "b. .class", "c. .jav", "a"));
    }

    public void startQuiz(Scanner scanner) {
        int score = 0;

        for (Question question : questions) {
            System.out.println(question.getQuestion());
            System.out.println(question.getOptionA());
            System.out.println(question.getOptionB());
            System.out.println(question.getOptionC());
            System.out.print("Javobingizni kiriting (a, b, c): ");

            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase(question.getCorrectAnswer())) {
                System.out.println("To'g'ri javob! 5 ball qo'shildi.");
                score += 5;
            } else {
                System.out.println("Noto'g'ri javob.");
            }
        }

        totalScore += score;
        System.out.println("Sizning natijangiz: " + score + " ball.");
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void addQuestion(String question, String optionA, String optionB, String optionC, String correctAnswer) {
        questions.add(new Question(question, optionA, optionB, optionC, correctAnswer));
    }
}
