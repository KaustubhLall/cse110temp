package edu.ucsd.cs110.temperature;

public abstract class Temperature {

    private final float value;

    public Temperature(float temp) {
        value = temp;
    }

    public final float getValue() {
        return value;
    }

    public abstract Temperature toCelsius();

    public abstract Temperature toFahrenheit();
}
