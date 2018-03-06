package ru.kusliyva.calculator;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ArgRunnerTest {

    @Test
    public void testWhenPassArgToAddItShouldReturnSumm() {
        final Calculator calc = new Calculator();
        calc.calculate("+", 2, 2);
        final double result = calc.getResult();
        assertThat(result, is(4d));
    }

    @Test
    public void testWhenPassArgToSubstractItShouldReturnSubstract() {
        final Calculator calc = new Calculator();
        calc.calculate("-",2, 2);
        final double result = calc.getResult();
        assertThat(result, is(0d));
    }

    @Test
    public void testWhenPassArgToMultipleItShouldReturnMultiple() {
        final Calculator calc = new Calculator();
        calc.calculate("*",2, 2);
        final double result = calc.getResult();
        assertThat(result, is(4d));
    }

    @Test
    public void testWhenPassArgToDivItShouldReturnDiv() {
        final Calculator calc = new Calculator();
        calc.calculate("/",2, 2);
        final double result = calc.getResult();
        assertThat(result, is(1d));
    }

    @Test
    public void testWhenPassArgToExpandItShouldReturnExpand() {
        final Calculator calc = new Calculator();
        calc.calculate("^",2, 2);
        final double result = calc.getResult();
        assertThat(result, is(4d));
    }
}