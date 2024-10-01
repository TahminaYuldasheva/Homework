package Task9_1;

    class Fish extends Animal {
        public Fish (int id, String name, int age) {
            super(id,name,age);
        }
        public void swim () {
            System.out.println(name + " is swimming.");
        }
        public String showInfo() {
            return "ID: " + id+ ", " + "fish name: " + name+", " +"age: "+ age;
        }
    }

