
public class TemperaturaTeste {
    public static void main(String[] args) {
        // Temperatura t = new Temperatura();
        System.out.println("Temperatura em C para F " + Temperatura.celsiusToFah(100));
        System.out.println("Temperatura em F para C " + Temperatura.fahToCelsius(32));
        System.out.println("Temperatura em C para K " + Temperatura.celsiusToKelvin(100));
        System.out.println("Temperatura em K para C " + Temperatura.kelvinToCelsius(100));
    }

}
