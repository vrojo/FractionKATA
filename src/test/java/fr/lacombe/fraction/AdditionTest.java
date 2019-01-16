package fr.lacombe.fraction;

import org.junit.Test;
import static fr.lacombe.fraction.Fraction.*;
import static org.assertj.core.api.Assertions.*;


public class AdditionTest {

    @Test
    public void should_sum_2_fractions_when_numerators_equal_to_0_and_0_without_denominator() {
        Fraction f1 = instantiate(0);
        Fraction f2 = instantiate(0);
        Fraction expectedResult = instantiate(0);

        Fraction sum = f1.sum(f2);

        assertThat(sum).isEqualTo(expectedResult);
    }

    @Test
    public void should_sum_2_fractions_when_numerators_equal_to_0_and_1_without_denominator() {
        Fraction f1 = instantiate(0);
        Fraction f2 = instantiate(1);
        Fraction expectedResult = instantiate(1);

        Fraction sum = f1.sum(f2);

        assertThat(sum).isEqualTo(expectedResult);
    }

    @Test
    public void should_sum_2_fractions_when_numerators_equal_to_0_and_2_without_denominator() {
        Fraction f1 = instantiate(0);
        Fraction f2 = instantiate(2);
        Fraction expectedResult = instantiate(2);

        Fraction sum = f1.sum(f2);

        assertThat(sum).isEqualTo(expectedResult);
    }

    @Test
    public void should_sum_2_fractions_when_numerators_equal_to_0_and_3_without_denominator() {
        Fraction f1 = instantiate(0);
        Fraction f2 = instantiate(3);
        Fraction expectedResult = instantiate(3);

        Fraction sum = f1.sum(f2);

        assertThat(sum).isEqualTo(expectedResult);
    }

    @Test
    public void should_sum_2_fractions_when_numerators_equal_to_1_and_0_without_denominator() {
        Fraction f1 = instantiate(1);
        Fraction f2 = instantiate(0);
        Fraction expectedResult = instantiate(1);

        Fraction sum = f1.sum(f2);

        assertThat(sum).isEqualTo(expectedResult);
    }

    @Test
    public void should_sum_2_fractions_when_numerators_equal_to_2_and_0_without_denominator() {
        Fraction f1 = instantiate(2);
        Fraction f2 = instantiate(0);
        Fraction expectedResult = instantiate(2);

        Fraction sum = f1.sum(f2);

        assertThat(sum).isEqualTo(expectedResult);
    }

    @Test
    public void should_sum_2_fractions_when_numerators_equal_to_3_and_0_without_denominator() {
        Fraction f1 = instantiate(3);
        Fraction f2 = instantiate(0);
        Fraction expectedResult = instantiate(3);

        Fraction sum = f1.sum(f2);

        assertThat(sum).isEqualTo(expectedResult);
    }

    @Test
    public void should_sum_2_fractions_when_numerators_equal_to_1_and_1_without_denominator() {
        Fraction f1 = instantiate(1);
        Fraction f2 = instantiate(1);
        Fraction expectedResult = instantiate(2);

        Fraction sum = f1.sum(f2);

        assertThat(sum).isEqualTo(expectedResult);
    }

    @Test
    public void should_sum_2_fractions_when_numerators_equal_to_2_and_2_without_denominator() {
        Fraction f1 = instantiate(2);
        Fraction f2 = instantiate(2);
        Fraction expectedResult = instantiate(4);

        Fraction sum = f1.sum(f2);

        assertThat(sum).isEqualTo(expectedResult);
    }

    @Test
    public void should_sum_2_fractions_when_numerators_equal_to_3_and_3_without_denominator() {
        Fraction f1 = instantiate(3);
        Fraction f2 = instantiate(3);
        Fraction expectedResult = instantiate(6);

        Fraction sum = f1.sum(f2);

        assertThat(sum).isEqualTo(expectedResult);
    }

    @Test
    public void should_sum_2_fractions_when_numerators_equal_to_1_and_2_without_denominator() {
        Fraction f1 = instantiate(1);
        Fraction f2 = instantiate(2);
        Fraction expectedResult = instantiate(3);

        Fraction sum = f1.sum(f2);

        assertThat(sum).isEqualTo(expectedResult);
    }

    @Test
    public void should_sum_2_fractions_when_numerators_equal_to_1_and_3_without_denominator() {
        Fraction f1 = instantiate(1);
        Fraction f2 = instantiate(3);
        Fraction expectedResult = instantiate(4);

        Fraction sum = f1.sum(f2);

        assertThat(sum).isEqualTo(expectedResult);
    }

    @Test
    public void should_sum_2_fractions_when_numerators_equal_to_1_and_4_without_denominator() {
        Fraction f1 = instantiate(1);
        Fraction f2 = instantiate(4);
        Fraction expectedResult = instantiate(5);

        Fraction sum = f1.sum(f2);

        assertThat(sum).isEqualTo(expectedResult);
    }

    @Test
    public void should_sum_2_fractions_when_numerators_equal_to_1_and_5_without_denominator() {
        Fraction f1 = instantiate(1);
        Fraction f2 = instantiate(5);
        Fraction expectedResult = instantiate(6);

        Fraction sum = f1.sum(f2);

        assertThat(sum).isEqualTo(expectedResult);
    }

    @Test
    public void should_sum_2_fractions_when_numerators_equal_to_2_and_3_without_denominator() {
        Fraction f1 = instantiate(2);
        Fraction f2 = instantiate(3);
        Fraction expectedResult = instantiate(5);

        Fraction sum = f1.sum(f2);

        assertThat(sum).isEqualTo(expectedResult);
    }

    @Test
    public void should_sum_2_fractions_when_numerators_equal_to_4_and_3_without_denominator() {
        Fraction f1 = instantiate(4);
        Fraction f2 = instantiate(3);
        Fraction expectedResult = instantiate(7);

        Fraction sum = f1.sum(f2);

        assertThat(sum).isEqualTo(expectedResult);
    }

    @Test
    public void should_sum_2_fractions_when_denomerators_are_not_the_same() {
        Fraction f1 = instantiate(3, 1);
        Fraction f2 = instantiate(2, 3);
        Fraction expectedResult = instantiate(11, 3);

        Fraction sum = f1.sum(f2);

        assertThat(sum).isEqualTo(expectedResult);
    }
}