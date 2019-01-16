package fr.lacombe.fraction;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AcceptanceTest {

    @Test
    public void should_make_the_addition_between_2_fractions() {
        Fraction f1 = Fraction.instantiate(1, 3);
        Fraction f2 = Fraction.instantiate(3, 2);

        Fraction sum = f1.sum(f2);

        Fraction expectedSum = Fraction.instantiate(11, 6);

        Assertions.assertThat(sum).isEqualTo(expectedSum);
    }
}
