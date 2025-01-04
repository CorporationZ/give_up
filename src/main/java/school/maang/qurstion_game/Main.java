package school.maang.qurstion_game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Controller controller = new Controller(LocalStorage.loadQuestion());

        while (true) {

            System.out.println("""
                    1.Start
                    2.Coin
                    3.Exit
                    """);

            int chose = input.nextInt();

            switch (chose) {
                case 1 -> {
                    System.out.println("O'yin boshlandi !!!!");
                    System.out.println("------------------------------");
                    startGame(input, controller);
                }
                case 2 -> {
                    System.out.println("Your coin: " + controller.getCoin());
                }
                case 3 -> {
                    System.exit(0);
                }
            }
        }
    }

    private static void startGame(Scanner input, Controller controller) {

        System.out.println("Savol :" + controller.getQuestion());
        for (String variant : controller.getVariants()) {
            System.out.println(variant);
        }
        System.out.print("Javobni kiriting: ");
        String userAnswer = input.next();
        controller.checkAnswer(userAnswer);  //

        if (!controller.isFinished()) {
            startGame(input, controller);
        } else {
            System.out.println("Tog'ri javob: " + controller.getTrueAnswers());
            System.out.println("Notog'ri javob: " + controller.getFalseAnswers());
            System.out.println("Coin: " + controller.getCoin());
            controller.defaultsValue();
        }
    }
}