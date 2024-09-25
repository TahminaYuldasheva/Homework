package Task8_2;

public class BaseConverterMainClass {
        public static void main(String[] args) {
            BaseConverter converter = new BaseConverter();

            System.out.println("Conversion 25 C: ");
            converter.convert(25, TemperatureScale.CELSIUS);

            System.out.println("Conversion 298 K: ");
            converter.convert(298, TemperatureScale.KELVIN);

            System.out.println("Conversion 77 F: ");
            converter.convert(77, TemperatureScale.FAHRENHEIT);

        }
    }

