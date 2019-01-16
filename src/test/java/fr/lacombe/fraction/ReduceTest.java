package fr.lacombe.fraction;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import static fr.lacombe.fraction.Fraction.*;

public class ReduceTest {

    @Test
    public void should_reduce_to_the_smallest_denominator_a_fraction_with_a_0_numerator() {
        Fraction fraction = instantiate(0, 10);
        Fraction expectedFraction = instantiate(0, 1);

        fraction.reduceFraction();

        Assertions.assertThat(fraction).isEqualTo(expectedFraction);
    }

    @Test
    public void should_not_reduce_a_fraction_unreduceable() {
        Fraction fraction = instantiate(1, 2);
        Fraction expectedFraction = instantiate(1, 2);

        fraction.reduceFraction();

        Assertions.assertThat(fraction).isEqualTo(expectedFraction);
    }

    @Test
    public void should_reduce_a_fraction_containing_same_numerator_and_denominator() {
        Fraction fraction = instantiate(8, 8);
        Fraction expectedFraction = instantiate(1, 1);

        fraction.reduceFraction();

        Assertions.assertThat(fraction).isEqualTo(expectedFraction);
    }

    @Test
    public void should_reduce_a_fraction_containing_same_numerator_and_denominator_with_a_negative_number() {
        Fraction fraction = instantiate(-8, 8);
        Fraction expectedFraction = instantiate(1, -1);

        fraction.reduceFraction();

        Assertions.assertThat(fraction).isEqualTo(expectedFraction);
    }

    @Test
    public void should_reduce_a_fraction_that_is_reductable() {
        Fraction fraction = instantiate(4, 8);
        Fraction expectedFraction = instantiate(1, 2);

        fraction.reduceFraction();

        Assertions.assertThat(fraction).isEqualTo(expectedFraction);
    }

    @Test
    public void should_reduce_a_fraction_that_is_reductable_and_containing_a_negative_number() {
        Fraction fraction = instantiate(4, -8);
        Fraction expectedFraction = instantiate(-1, 2);

        fraction.reduceFraction();

        Assertions.assertThat(fraction).isEqualTo(expectedFraction);
    }
}
