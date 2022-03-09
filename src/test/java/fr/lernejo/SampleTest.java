package fr.lernejo;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static fr.lernejo.Sample.Operation.ADD;
import static fr.lernejo.Sample.Operation.MULT;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.assertj.core.api.Assertions;

class SampleTest {

    int n = 10;
    int n2 = -10;
    int n3 = -7;
    int fact1 = 6;
    int fact2 = 1;
    int fact3 = 1;
    Sample sample = new Sample();

    @Test
    public void operationAddPositive() {
        System.out.println("Fonction operationAddPositive :");
        assertEquals(n, sample.op(ADD, 5, 5));
    }

    @Test
    public void operationAddNegative() {
        System.out.println("Fonction operationAddNegative :");
        assertEquals(n2, sample.op(ADD, -5, -5));
    }

    @Test
    public void operationAddPositiveNegative() {
        System.out.println("Fonction operationAddPositiveNegative :");
        assertEquals(n3, sample.op(ADD, -17, 10));
    }

    @Test
    public void operationMultPosisitive() {
        System.out.println("Fonction operationMultPositive :");
        assertEquals(n, sample.op(MULT, 2, 5));
    }

    @Test
    public void operationMultNegative() {
        System.out.println("Fonction operationMultNegative :");
        assertEquals(n, sample.op(MULT, -2, -5));
    }

    @Test
    public void operationMultPositiveNegative() {
        System.out.println("Fonction operationMultPositiveNegative :");
        assertEquals(n2, sample.op(MULT, -2, 5));
    }

    @Test
    public void operationFact1() {
        System.out.println("Fonction operationFact1 :");
        assertEquals(fact1, sample.fact(3));
    }

    @Test
    public void operationFact2() {
        System.out.println("Fonction operationFact2 :");
        assertEquals(fact2, sample.fact(0));
    }

    @Test
    public void operationFact3() {
        System.out.println("Fonction operationFact3 :");
        assertEquals(fact3, sample.fact(1));
    }

    @Test
    public void operationFactNegative() {
        System.out.println("Fonction operationFactNegative :");

        Sample sample1 = new Sample();
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> sample1.fact(-1));
    }
}
