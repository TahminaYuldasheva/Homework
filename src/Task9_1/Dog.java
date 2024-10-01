package Task9_1;

    class Dog extends Animal{
        String ownerName;
        public Dog (int id, String name, int age, String ownerName) {
            super(id,name,age);
            this.ownerName=ownerName;
        }
        public void speak() {
            System.out.println(name + " says: Woof!");
        }

        public void walk() {
            System.out.println(name + " walks with " + ownerName + " in the morning.");
        }
        public String showInfo() {
            return "ID: " + id+ ", " + "dog name: " + name+", " +"age: "+ age + ", "+ "owner name: " + ownerName;
        }

    }

