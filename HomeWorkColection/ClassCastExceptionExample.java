package Debt.HomeWorkColection;

import java.util.ArrayList;
import java.util.List;

    public class ClassCastExceptionExample {

        public static void main(String[] args) {
            List<Object> mixedList = new ArrayList<>();

            mixedList.add("Строка");
            mixedList.add(42);
            mixedList.add(3.14);
            mixedList.add(new Object());

            try {
                for (Object obj : mixedList) {
                    String str = (String) obj;
                    System.out.println("Приведение успешно: " + str);
                }
            } catch (ClassCastException e) {
                System.out.println("Ошибка приведения типа: " + e.getMessage());
            }
        }
    }

