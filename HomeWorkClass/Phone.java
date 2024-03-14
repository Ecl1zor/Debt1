package Debt.HomeWorkClass;

import java.util.Arrays;

public class Phone {

    String number;
    double weight;
    String model;


    void receiveCall(String name) {
        System.out.println("Звонить " + name);

    }

    void receiveCall(String name, String number) {
        System.out.println("Звонить " + name + "Номер: ");
    }
    String getNumber() {
        return number;
    }
    void sendMessage (String... numbers){
        System.out.println(" Перезвоню ");
        System.out.println(Arrays.toString(numbers));

    }
}


