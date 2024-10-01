package Task9_1;

    class Cat extends Animal {
        public Cat(int id, String name, int age) {
            super(id,name,age);
        }
        public void speak() {
            System.out.println(name + " says: Meow!");
        }
        public String showInfo() {
            return "ID: " + id+ ", " + "cat name: " + name+", " +"age: "+ age;
        }
    }

