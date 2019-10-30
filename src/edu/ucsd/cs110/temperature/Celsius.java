package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature {
    public Celsius(float t) {
        super(t);
    }

    public String toString() {
        return getValue() + " C";
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float val = 9 * getValue() / 5 + 32;
        return new Fahrenheit(val);
    }
}
