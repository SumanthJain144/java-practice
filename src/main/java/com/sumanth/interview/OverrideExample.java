package com.sumanth.interview;

/**
 * 1.new NauticalMilesToKmConverter().milesToKm(1) will return 1.852.
 * 2.((NauticalMilesToKmConverter)new MilesToKmConverter()).milesToKm(1) will return 1.852.
 * 3.new MilesToKmConverter().milesToKm(1) will return 1.609.
 * 4.((MilesToKmConverter)new NauticalMilesToKmConverter()).milesToKm(1) will return 1.609.
 */
public class OverrideExample {
    public static void main(String[] args) {
        System.out.println(new NauticalMilesToKmConverter().milesToKm(1));
        System.out.println(new MilesToKmConverter().milesToKm(1));
    }
}
class MilesToKmConverter {
    public final double milesToKm(double miles) {
        return getMilesToKmFactor() * miles;
    }
    public double getMilesToKmFactor() {
        return 1.609;
    }
}

class NauticalMilesToKmConverter extends MilesToKmConverter {
    @Override
    public double getMilesToKmFactor() {
        return 1.852;
    }
}

