package school.maang.quizgame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // userdan kiritishni olish uchun..
        Controller controller = new Controller(); // Controller obyekti yaratamiz.

        while (true) { // cheksiz sikl
            System.out.println("\n1. Start\n2. Coin\n3. Exit");
            System.out.print("Tanlovingizni kiriting: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                controller.startQuiz(scanner);
            } else if (choice.equals("2")) {
                System.out.println("Umumiy ballaringiz: " + controller.getTotalScore());
            } else if (choice.equals("3")) {
                System.out.println("Dasturdan chiqilmoqda...");
                break;
            } else {
                System.out.println("Noto'g'ri tanlov. Qayta urinib ko'ring.");
            }
        }
        scanner.close();
    }
}