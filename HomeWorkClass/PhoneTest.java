package Debt.HomeWorkClass;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        phone1.number = "+375 33 377-99-73";
        phone1.model = "Apple";
        phone1.weight = 9;


        phone2.number = "+375 33 362-82-22";
        phone2.model = "Xiomi";
        phone2.weight = 8.3;


        System.out.println(phone1.getNumber());
        System.out.println(phone1.model);
        System.out.println(phone1.weight);


        System.out.println(phone2.getNumber());
        System.out.println(phone2.model);
        System.out.println(phone2.weight);

        phone1.receiveCall(" Мама ");
        phone2.receiveCall(" Жена " , "+375 33 648-92-79");

        phone1.sendMessage("+375 29 845-99-25");
        phone2.sendMessage("+375 33 672-83-23","+375 33 923-54-67");
    }
}







