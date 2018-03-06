package ru.kusliyva.calculator;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testWhenPassArgToAddItShouldReturnSumm() {
        final ICalculator calc = new Calculator();
        calc.addition(2, 2);
        final double result = calc.getResult();
        assertThat(result, is(4d));
    }

    @Test
    public void testWhenPassArgToSubstractItShouldReturnSubstract() {
        final ICalculator calc = new Calculator();
        calc.subtraction(2, 2);
        final double result = calc.getResult();
        assertThat(result, is(0d));
    }

    @Test
    public void testWhenPassArgToMultipleItShouldReturnMultiple() {
        final ICalculator calc = new Calculator();
        calc.multiplication(2, 2);
        final double result = calc.getResult();
        assertThat(result, is(4d));
    }

    @Test
    public void testWhenPassArgToDivItShouldReturnDiv() {
        final ICalculator calc = new Calculator();
        calc.division(2, 2);
        final double result = calc.getResult();
        assertThat(result, is(1d));
    }

    @Test
    public void testWhenPassArgToExpandItShouldReturnExpand() {
        final ICalculator calc = new Calculator();
        calc.exponentiation(2, 2);
        final double result = calc.getResult();
        assertThat(result, is(4d));
    }
}
