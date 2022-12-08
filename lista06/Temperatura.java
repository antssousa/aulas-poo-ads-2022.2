
/**
 * Temperatura
 */
public class Temperatura {

    // private Temperatura() {
    // }

    public static double celsiusToFah(double c) {
        return 9 * c / 5 + 32;
    }

    public static double fahToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double c) {
        return c + 273.15;
    }

    public static double kelvinToCelsius(double k) {
        return k - 273.15;
    }

}