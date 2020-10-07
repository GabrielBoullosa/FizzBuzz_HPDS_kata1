package test;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzz_ {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_number_when_it_is_not_fizz_and_not_buzz() {
        assertThat(fizzBuzz.of(1)).isEqualTo("1");
        assertThat(fizzBuzz.of(2)).isEqualTo("2");
    }

    @Test
    public void should_return_Fizz_when_it_is_multiple_3() {
        assertThat(fizzBuzz.of(3)).isEqualTo("Fizz");
        assertThat(fizzBuzz.of(6)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_Buzz_when_it_is_multiple_5() {
        assertThat(fizzBuzz.of(5)).isEqualTo("Buzz");
        assertThat(fizzBuzz.of(10)).isEqualTo("Buzz");
    }

    @Test
    public void should_return_FizzBuzz_when_it_is_multiple_15() {
        assertThat(fizzBuzz.of(15)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzz.of(30)).isEqualTo("FizzBuzz");
    }

    private class FizzBuzz {
        public String of(int number) {
            if (isMultipleOfFiveteen(number)) return "FizzBuzz";
            if (isMultipleOfFive(number)) return "Buzz";
            if (isMultipleOfThree(number)) return "Fizz";
            return String.valueOf(number);
        }

        private boolean isMultipleOfFiveteen(int number) {
            return number % 15 == 0;
        }

        private boolean isMultipleOfFive(int number) {
            return number % 5 == 0;
        }

        private boolean isMultipleOfThree(int number) {
            return number % 3 == 0;
        }
    }
}
