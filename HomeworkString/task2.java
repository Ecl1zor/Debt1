package Debt.HomeworkString;
import java.util.Scanner;
public class task2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String string = scanner.nextLine();
            String normalString = string.trim().replaceAll("\\s+", " ");
            System.out.println(normalString);
        }
    }
