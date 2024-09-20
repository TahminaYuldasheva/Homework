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

    }
class Cat extends Animal {
    public Cat(int id, String name, int age) {
        super(id,name,age);
    }
    public void speak() {
        System.out.println(name + " says: Meow!");
    }

}
class Raven extends Animal {
    int maxFlightHeight;

    public Raven(int id, String name, int age, int maxFlightHeight) {
        super(id, name, age);
        this.maxFlightHeight = maxFlightHeight;
    }
    public void fly () {
        System.out.println( name + " is flying at " + maxFlightHeight + " meters.");
    }

}
class Fish extends Animal {
    public Fish (int id, String name, int age) {
        super(id,name,age);
    }
    public void swim () {
        System.out.println(name + " is swimming.");
    }

}
class Parrot extends Animal {
    int parrotMaxFlightHeight;
    String featherColor;

    public Parrot(int id, String name, int age, int maxFlightHeight, String featherColor) {
        super(id, name, age);
        this.parrotMaxFlightHeight = maxFlightHeight;
        this.featherColor = featherColor;
    }

    public void fly() {
        System.out.println(name + " is flying at " + parrotMaxFlightHeight + " meters.");
    }


}