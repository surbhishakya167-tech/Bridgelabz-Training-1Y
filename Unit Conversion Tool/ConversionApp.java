public class ConversionApp {

    public static void main(String[] args) {

        double km = 15;
        double kg = 10;

        System.out.println("Miles: " + UnitConverter.kmToMiles(km));
        System.out.println("Pounds: " + UnitConverter.kgToLbs(kg));
    }
}