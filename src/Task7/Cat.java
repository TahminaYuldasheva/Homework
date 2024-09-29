package Task7;

    class Cat extends Animal {
        public Cat(int id, String name, int age) {
            super(id,name,age);
        }
        public void speak() {
            System.out.println(name + " says: Meow!");
        }

    }
