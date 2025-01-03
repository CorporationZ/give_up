package school.maang.quizgame;

// Question ni xususiyatlarini yozib olamiz
public class Question {
    private String question; // savol
    private String optionA; // variant-a
    private String optionB; // variant-b
    private String optionC; // variant-c
    private String correctAnswer; // to'g'ri javob.

    // konstruktor.
    public Question(String question, String optionA, String optionB, String optionC, String correctAnswer) {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.correctAnswer = correctAnswer;
    }

    // getter'lari
    public String getQuestion() {
        return question;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
