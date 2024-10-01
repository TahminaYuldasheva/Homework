package Task9_1;

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

     public abstract String showInfo();


    public void speak() {
       System.out.println(name+" can't speak!");
    }

    public void fly() {
    }

    public void swim() {
    }

    public void walk() {
    }

}