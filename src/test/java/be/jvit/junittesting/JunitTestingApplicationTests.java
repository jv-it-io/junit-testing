package be.jvit.junittesting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class JunitTestingApplicationTests {

    Calculator underTest = new Calculator();

    @Test
    void itShouldAddTwoNumbers() {
        //given
        int numberOne = 20;
        int numberTwo = 30;

        //When
        int result = underTest.add(numberOne, numberTwo);

        //Then
        assertThat(result).isEqualTo(50);
    }

    class Calculator{
        int add(int a , int b){
            return a + b;
        }
    }

}
