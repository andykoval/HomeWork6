package com.company;

public enum Planets {
    MERCURY(3.303e+23, 2.4397e6, 58e9),
    VENUS(4.869e+24, 6.0518e6, 108e9),
    EARTH(5.976e+24, 6.37814e6, 150e9),
    MARS(6.421e+23, 3.3972e6, 228e9),
    JUPITER(1.9e+27, 7.1492e7, 778e9),
    SATURN(5.688e+26, 6.0268e7, 1429e9),
    URANUS(8.686e+25, 2.5559e7, 2871e9),
    NEPTUNE(1.024e+26, 2.4746e7, 4504e9);

    private final double mass;
    private final double radius;
    private final double radiusOrb;

    Planets(double mass, double radius, double radiusOrb) {
        this.mass = mass;
        this.radius = radius;
        this.radiusOrb = radiusOrb;
    }

    public double getMass() {
        return mass;
    }

    public double getRad() {
        return radius;
    }

    public double getRadOrb() {
        return radiusOrb;
    }

    public static void main(String[] args) {
        System.out.println(Planets.EARTH.getMass());
        System.out.println(Planets.MARS.getRad());
        System.out.println(Planets.SATURN.getRadOrb());
        System.out.println(Planets.NEPTUNE.getRad());
        System.out.println(Planets.JUPITER.getRadOrb());
    }   // write your code here
}
