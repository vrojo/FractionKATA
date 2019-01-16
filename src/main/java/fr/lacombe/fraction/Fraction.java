package fr.lacombe.fraction;

import java.util.Objects;
import static java.lang.Math.*;

public class Fraction {
    private int numerator;
    private int denominator;

    private Fraction(int pnumerator) {
        this.numerator = pnumerator;
        this.denominator = 1;
    }
    public static Fraction instantiate(int pnumerator) {
        return new Fraction(pnumerator);
    }
    public static Fraction instantiate(int pnumerator, int pdenominator) {
        if (pdenominator == 0)
            throw new IllegalArgumentException("You can't create a fraction having a denominator equal to 0 !");
        Fraction fr = new Fraction(pnumerator);
        fr.setDenominator(pdenominator);
        return fr;
    }


    private int getNumerator() {
        return numerator;
    }
    private int getDenominator() {
        return denominator;
    }
    private void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator/denominator == fraction.numerator/fraction.denominator;
    }
    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
    @Override
    public String toString() {
        if ((numerator<0 && denominator>0) ||(numerator>0 && denominator<0))
            return "Fraction = " +
                "-" + abs(numerator) +
                "/" + abs(denominator) +
                " }";
        return "Fraction = " +
                      abs(numerator) +
                "/" + abs(denominator) +
                " }";
    }


    public Fraction sum(Fraction otherFrctn) {
        int num, den;
        if (this.denominator != otherFrctn.getDenominator()) {
            num = this.numerator * otherFrctn.getDenominator() + this.denominator * otherFrctn.getNumerator();
            den = this.denominator * otherFrctn.getDenominator();
        } else {
            num = this.numerator + otherFrctn.getNumerator();
            den = this.denominator;
        }
        return Fraction.instantiate(num, den);
    }
    public void reduceFraction() {
        int divider = 1;
        if (numerator == 0) {
            divider = denominator;
        } else if (numerator % denominator == 0) {
            divider = denominator;
        } else {
            for (int i = 2; i < abs(numerator); i++) {
                if (numerator % i == 0) {
                    divider = i;
                }
            }
        }
        numerator = numerator / divider;
        denominator = denominator / divider;
    }
}
