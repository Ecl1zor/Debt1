package Debt.HomeworkString;

import java.util.Scanner;

public class HomeWorkString {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку: ");
            String s = scanner.nextLine();

            if (s.startsWith("abc")) {
               s = "www" + s.substring(3);
            } else {
                s = s + "zzz";
            }

            System.out.println("Результат: " + s);
        }
    }
