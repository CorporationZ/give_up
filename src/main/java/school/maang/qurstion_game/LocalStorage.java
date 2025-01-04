package school.maang.qurstion_game;

import java.util.ArrayList;
import java.util.List;

public class LocalStorage {

    private static final ArrayList<QuestionModel> questions = new ArrayList<>();

    public static ArrayList<QuestionModel> loadQuestion() {
        questions.clear();

        QuestionModel question1 = new QuestionModel(1, "What is the capital of France?", "Paris", List.of("Paris", "London", "Berlin", "Madrid"));
        QuestionModel question2 = new QuestionModel(2, "What is the capital of Germany?", "Berlin", List.of("Paris", "London", "Berlin", "Madrid"));
        QuestionModel question3 = new QuestionModel(3, "What is the capital of Spain?", "Madrid", List.of("Paris", "London", "Berlin", "Madrid"));
        QuestionModel question4 = new QuestionModel(4, "What is the capital of England?", "London", List.of("Paris", "London", "Berlin", "Madrid"));

        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);

        return questions;
    }
}
