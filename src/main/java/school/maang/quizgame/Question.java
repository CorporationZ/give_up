package school.maang.quizgame;

import java.util.List;

// Question ni xususiyatlarini yozib olamiz
public class Question {
    private final String question;
    private final List<String> options;
    private final String correctAnswer;

    public Question(String question, List<String> options, String correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
