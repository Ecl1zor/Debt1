package Debt.TaskAdditional;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    void say() {

        System.out.println("hi" + name);
    }

    static void sayFromAll() {

        System.out.println("sayFromAll");
    }
}
