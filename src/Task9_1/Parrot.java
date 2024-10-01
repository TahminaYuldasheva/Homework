package Task9_1;

    public class Parrot extends Bird {
        String featherColor;

        public Parrot(int id, String name, int age, int maxFlightHeight, String featherColor) {
            super(id, name, age, maxFlightHeight);
            this.featherColor = featherColor;
        }
        public String showInfo() {
            return "ID: " + id+ ", " + "bird name: " + name+", " +"age: "+ age +", "+ "feather color: "+featherColor;
        }

    }

