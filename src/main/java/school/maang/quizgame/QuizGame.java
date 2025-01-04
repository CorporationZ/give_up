package school.maang.quizgame;


import java.util.ArrayList;
import java.util.Scanner;

public class QuizGame {

    // Метод, унутилган саволларни сўраш
    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        int coins = 10;
        int correctAnswers = 0;
        int incorrectAnswers = 0;

        // Саволлар листи
        ArrayList<Question> questions = new ArrayList<>();

        // Саволлар
        ArrayList<String> answers1 = new ArrayList<>();
        answers1.add("a) 1445 йил");
        answers1.add("b) 1441 йил");
        answers1.add("c) 1472 йил");
        questions.add(new Question("Алишер Навоий қачон туғилган?", answers1, "b"));

        ArrayList<String> answers2 = new ArrayList<>();
        answers2.add("a) Самарқанд");
        answers2.add("b) Тошкент");
        answers2.add("c) Андижон");
        questions.add(new Question("Ўзбекистоннинг пойтахти нима?", answers2, "b"));

        ArrayList<String> answers3 = new ArrayList<>();
        answers3.add("a) Шоир");
        answers3.add("b) Улуғ саркарда ва хукмдор");
        answers3.add("c) Боғбон");
        questions.add(new Question("Амир Темур ким бўлган?", answers3, "b"));

        // Саволларга жавоб бериш
        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);
            System.out.println("Савол " + (i + 1) + ": " + question.getQuestionText());
            for (String answer : question.getAnswers()) {
                System.out.println(answer);
            }

            System.out.print("Жавобни киритинг: ");
            String userAnswer = scanner.nextLine().toLowerCase();

            if (userAnswer.equals(question.getCorrectAnswer())) {
                correctAnswers++;
                System.out.println("Тўғри жавоб!");
            } else {
                incorrectAnswers++;
                System.out.println("Нотўғри жавоб!");
            }
        }

        // Жавоблар натижаси
        System.out.println("\nТўғри жавоблар: " + correctAnswers);
        System.out.println("Нотўғри жавоблар: " + incorrectAnswers);
        System.out.println("Коинлар сони: " + coins);
    }

    // Главный метод для меню
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coins = 10;

        while (true) {
            // Асосий меню
            System.out.println("\n1. Start");
            System.out.println("2. Coin");
            System.out.println("3. Exit");
            System.out.print("Танланг: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфер

            switch (choice) {
                case 1:
                    startGame();  // Ўйинни бошлаш
                    break;
                case 2:
                    System.out.println("Коинлар сони: " + coins);  // Коинлар сонини кўриш
                    break;
                case 3:
                    System.out.println("Ўйиндан чиқиш...");
                    return;  // Ўйиндан чиқиш
                default:
                    System.out.println("Нотўғри танлов!");
            }
        }
    }
}
