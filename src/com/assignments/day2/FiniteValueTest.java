package com.assignments.day2;

public class FiniteValueTest {

    public static void main(String[] args) {
        
        double finiteDouble = 169999.433;
        double positiveInfinityDouble = Double.POSITIVE_INFINITY;
        double negativeInfinityDouble = Double.NEGATIVE_INFINITY;
        double nanDouble = Double.NaN;

        System.out.println("Double values:");
        System.out.println(finiteDouble + " is finite: " + Double.isFinite(finiteDouble));
        System.out.println(positiveInfinityDouble + " is finite: " + Double.isFinite(positiveInfinityDouble));
        System.out.println(negativeInfinityDouble + " is finite: " + Double.isFinite(negativeInfinityDouble));
        System.out.println(nanDouble + " is finite: " + Double.isFinite(nanDouble));

        System.out.println("Float values:");
        
        float finiteFloat = 843333.33f;
        float positiveInfinityFloat = Float.POSITIVE_INFINITY;
        float negativeInfinityFloat = Float.NEGATIVE_INFINITY;
        float nanFloat = Float.NaN;

        System.out.println(finiteFloat + " is finite: " + Float.isFinite(finiteFloat));
        System.out.println(positiveInfinityFloat + " is finite: " + Float.isFinite(positiveInfinityFloat));
        System.out.println(negativeInfinityFloat + " is finite: " + Float.isFinite(negativeInfinityFloat));
        System.out.println(nanFloat + " is finite: " + Float.isFinite(nanFloat));
    }
}