package Task7;

abstract class Animal {
    int id;
    String name;
    int age;

    public Animal(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

     public void showInfo() {
        System.out.println("ID: " + id+ "," + " name: " + name + "," + " age: " + age);
     }
    public void speak() {
       System.out.println("He can't speak!");
    }

    public void fly() {
    }

    public void swim() {
    }

    public void walk() {
    }

}

