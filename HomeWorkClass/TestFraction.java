package Debt.HomeWorkClass;

public class TestFraction {
    public static void main(String[] args) {
        Fraction fraction3_4 = new Fraction(1,2);
        Fraction fraction2_3 = new Fraction(3,4);

        System.out.println("F1: " + fraction3_4.getFraction() + " Dec: " + fraction3_4.getFractionDecimal());
        System.out.println("F2: " + fraction2_3.getFraction() + " Dec: " + fraction2_3.getFractionDecimal() + "\n");
        System.out.println("F1 + F2: " + fraction3_4.addFraction(fraction2_3));
        System.out.println("F2 + F1: " + fraction2_3.addFraction(fraction3_4) + "\n");
        System.out.println("F1 - F2: " + fraction3_4.subtractFraction(fraction2_3));
        System.out.println("F2 - F1: " + fraction2_3.subtractFraction(fraction3_4) + "\n");
        System.out.println("F1 * F2: " + fraction3_4.multiplyByFraction(fraction2_3));
        System.out.println("F2 * F1: " + fraction2_3.multiplyByFraction(fraction3_4) + "\n");
        System.out.println("F1 / F2: " + fraction3_4.divideByFraction(fraction2_3));
        System.out.println("F2 / F1: " + fraction2_3.divideByFraction(fraction3_4));
    }
}
