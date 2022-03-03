package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("input numerator1:");
        int numerator1 = in.nextInt();

        System.out.print("input denominator1 :");
        int denominator1 = in.nextInt();

        System.out.print("input numerator2:");
        int numerator2 = in.nextInt();

        System.out.print("input denominator2 :");
        int denominator2 = in.nextInt();

        Fraction frac1 = new Fraction(denominator1, numerator1);

        Fraction frac2 = new Fraction(denominator2, numerator2);

        Fraction sum1 = frac1.add(frac2);
        System.out.println(frac1 + " + " + frac2 +" = " + sum1);

        Fraction sum2 = Fraction.add(frac1, frac2);
        System.out.println(frac1 + " + " + frac2 +" = " + sum2);

        Fraction sub1 = frac1.dif(frac2);
        System.out.println(frac1 + " - " + frac2 +" = " + sub1);

        Fraction sub2 = Fraction.dif(frac1, frac2);
        System.out.println(frac1 + " - " + frac2 +" = " + sub2);

        Fraction mult1 = frac1.multiply(frac2);
        System.out.println(frac1 + " * " + frac2 +" = " + mult1);

        Fraction mult2 = Fraction.multiply(frac1, frac2);
        System.out.println(frac1 + " * " + frac2 +" = " + mult2);

        Fraction div1 = frac1.division(frac2);
        System.out.println(frac1 + " : " + frac2 +" = " + div1);

        Fraction div2 = Fraction.division(frac1, frac2);
        System.out.println(frac1 + " : " + frac2 +" = " + div2);
    }
}
