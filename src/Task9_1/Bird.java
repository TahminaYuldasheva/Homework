package Task9_1;

    class Bird extends Animal {
        int maxFlightHeight;

        public Bird(int id, String name, int age, int maxFlightHeight) {
            super(id, name, age);
            this.maxFlightHeight = maxFlightHeight;
        }

        public void fly() {
            System.out.println( name + " is flying at " + maxFlightHeight + " meters.");
        }
        public String showInfo() {
            return "ID: " + id+ ", " + "bird name: " + name+", " +"age: "+ age;
        }
    }

