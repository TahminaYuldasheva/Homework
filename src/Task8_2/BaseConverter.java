package Task8_2;

        public class BaseConverter {
            public void convert(double temperature, TemperatureScale inputScale) {
                double celsiusTemp;

                switch (inputScale) {
                    case CELSIUS:
                        celsiusTemp = temperature;
                        System.out.println(temperature + " C");
                        break;
                    case KELVIN:
                        celsiusTemp = temperature - 273.15;
                        System.out.println(temperature + " K -> " + celsiusTemp + " C");
                        break;
                    case FAHRENHEIT:
                        celsiusTemp = (temperature - 32) / 1.8;
                        System.out.println(temperature + " F -> " + celsiusTemp + " C");
                        break;
                    default:
                        System.out.println("Incorrect scale");
                }

            }
        }




