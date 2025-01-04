package school.maang.qurstion_game;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private static final int TRUE_ANSWER_POINTS = 10;

    private final ArrayList<QuestionModel> questions;
    private int currentQuestion = 0;
    @Getter
    private int trueAnswers = 0;
    @Getter
    private int falseAnswers = 0;
    @Getter
    private int coin = 0;

    public Controller(ArrayList<QuestionModel> questions) {
        this.questions = questions;
    }

    public void defaultsValue() {
        currentQuestion = 0;
        trueAnswers = 0;
        falseAnswers = 0;
    }

    public int getLevel() {
        return currentQuestion + 1;
    }

    private QuestionModel getCurrentQuestion() {
        return questions.get(currentQuestion);
    }

    private String getAnswer() {
        return getCurrentQuestion().getAnswer();
    }

    public String getQuestion() {
        return getCurrentQuestion().getQuestion();
    }

    public List<String> getVariants() {
        return getCurrentQuestion().getVariants();
    }

    public void checkAnswer(String userAnswer) {
        if (userAnswer.equals(getAnswer())) {
            trueAnswers++;
            coin += TRUE_ANSWER_POINTS;
        } else {
            falseAnswers++;
        }
        currentQuestion++;
    }

    public boolean isFinished() {
        return currentQuestion == questions.size();
    }
}
