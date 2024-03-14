package Debt.HomeWorkClass;

public class Fraction {
    private final int numerator;
    private final int denominator;
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    Fraction() {
        numerator = 0;
        denominator = 1;
    }
    Fraction (int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        } else {
            this.denominator = denominator;
        }
    }
    public String getFraction() {
        return numerator + "/" + denominator;
    }
    public double getFractionDecimal() {
        return ((double) numerator) / denominator;
    }
    public String addFraction(Fraction otherFraction) {
        int a = this.numerator;
        int b = this.denominator;
        int c = otherFraction.numerator;
        int d = otherFraction.denominator;
        return ((a*d) + (c*b)) + "/" + (b*d);
    }

    public String subtractFraction(Fraction otherFraction) {
        int a = this.numerator;
        int b = this.denominator;
        int c = otherFraction.numerator;
        int d = otherFraction.denominator;
        return ((a*d) - (c*b)) + "/" + (b*d);
    }

    public String multiplyByFraction(Fraction otherFraction) {
        int a = this.numerator;
        int b = this.denominator;
        int c = otherFraction.numerator;
        int d = otherFraction.denominator;
        return (a*c) + "/" + (b*d);
    }

    public String divideByFraction(Fraction otherFraction) {
        int a = this.numerator;
        int b = this.denominator;
        int c = otherFraction.numerator;
        int d = otherFraction.denominator;
        return (a*d) + "/" + (b*c);
    }
}

