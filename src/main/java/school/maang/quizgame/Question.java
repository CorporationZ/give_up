package school.maang.quizgame;

import java.util.ArrayList;

class Question {
    private String questionText;
    private ArrayList<String> answers;
    private String correctAnswer;

    // Конструктор
    public Question(String questionText, ArrayList<String> answers,
                    String correctAnswer) {
        this.questionText = questionText;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    // Геттерлар
    public String getQuestionText() {
        return questionText;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    // Сеттерлар
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
