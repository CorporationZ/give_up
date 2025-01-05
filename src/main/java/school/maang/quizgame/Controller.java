package school.maang.quizgame;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    private static final int REWARD_COIN = 5;
    private final QuestionStore questionBank;
    private int totalScore;

    public Controller(QuestionStore questionBank) {
        this.questionBank = questionBank;
        this.totalScore = 0;
    }

    public void startQuiz(Scanner scanner) {
        int score = 0;

        for (Question question : questionBank.getQuestions()) {
            System.out.println(question.getQuestion());
            for (int i = 0; i < question.getOptions().size(); i++) {
                System.out.println((char) ('a' + i) + ". " + question.getOptions().get(i));
            }
            System.out.print("Javobingizni kiriting (a, b, c): ");

            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase(question.getCorrectAnswer())) {
                System.out.println("To'g'ri javob! " + REWARD_COIN + " ball qo'shildi.");
                score += REWARD_COIN;
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
}
