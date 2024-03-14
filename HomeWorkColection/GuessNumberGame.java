package Debt.HomeWorkColection;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

    public static void main(String[] args) {
        playGuessNumberGame();
    }

    private static void playGuessNumberGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int guess;

        System.out.println("Добро пожаловать в игру 'Угадай число' от 1 до 100!");

        do {
            System.out.print("Введите ваше предположение: ");
            try {
                guess = scanner.nextInt();

                if (guess < 1 || guess > 100) {
                    System.out.println("Пожалуйста, введите число от 1 до 100.");
                    continue;
                }

                if (guess < secretNumber) {
                    System.out.println("Искомое число больше.");
                } else if (guess > secretNumber) {
                    System.out.println("Искомое число меньше.");
                } else {
                    System.out.println("Поздравляем! Вы угадали число: " + secretNumber);
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода. Пожалуйста, введите целое число.");
                scanner.next();
            }

        } while (true);

        scanner.close();
    }
}
