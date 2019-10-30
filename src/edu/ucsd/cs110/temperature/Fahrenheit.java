package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature {

    public Fahrenheit(float t) {
        super(t);
    }

    public String toString() {
        return "" + getValue() + " F";
    }

    @Override
    public Temperature toCelsius() {
        float val = (getValue() - 32) * 5 / 9;
        return new Celsius(val);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }
}
