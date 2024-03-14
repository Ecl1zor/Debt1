package Debt.HomeworkString;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {
    public static void main (String[] args) {
        String text="Дан 11текст. 222Найти наибольшее 5555555количество 777идущих 1подряд 00цифр.";
        Pattern pattern = Pattern.compile("[^0-9]{1,}");
        Matcher matcher = pattern.matcher(text);
        String res = matcher.replaceAll(" ");
        OptionalInt m = Arrays.asList(res.split(" ")).stream()
                .mapToInt(s -> s.length())
                .max();
        System.out.println(m.getAsInt());
    }
}
