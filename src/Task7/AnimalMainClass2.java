package Task7;
import java.util.Random;

public class AnimalMainClass2 {
    public static void main(String[] args) {
        Random random = new Random();
        Animal[] animals = new Animal[10];

        String[] names = {"Balto", "Garfield", "Bran", "Nemo", "Crookshanks", "Rio", "Dory", "Daisy", "Luna", "Kesha"};
        String[] ownerNames = {"John Wick", "Leo", "Harry", "Kate", "Lana"};
        String[] featherColors = {"Green", "Blue", "Red", "Yellow", "Rainbow", "White"};

        for (int i = 0; i < animals.length; i++) {
            int id = i + 1;
            String name = names[random.nextInt(names.length)];
            int age = random.nextInt(15);

            int animalType = random.nextInt(5);


            switch (animalType) {
                case 0:
                    String ownerName = ownerNames[random.nextInt(ownerNames.length)];
                    animals[i] = new Dog(id, name, age, ownerName);
                    animals[i].eat();
                    animals[i].speak();
                    animals[i].walk();
                    animals[i].showInfo();
                   break;
                case 1:
                    animals[i] = new Cat(id, name, age);
                    animals[i].eat();
                    animals[i].speak();
                    animals[i].showInfo();
                    break;
                case 2:
                    int maxFlightHeight = random.nextInt(2000);
                    animals[i] = new Raven(id, name, age, maxFlightHeight);
                    animals[i].eat();
                    animals[i].fly();
                    animals[i].showInfo();
                    break;
                case 3:
                    animals[i] = new Fish(id, name, age);
                    animals[i].eat();
                    animals[i].speak();
                    animals[i].swim();
                    animals[i].showInfo();
                    break;
                case 4:
                    int parrotMaxFlightHeight = random.nextInt(1000);
                    String featherColor = featherColors[random.nextInt(featherColors.length)];
                    animals[i] = new Parrot(id, name, age, parrotMaxFlightHeight, featherColor);
                    animals[i].eat();
                    animals[i].fly();
                    animals[i].showInfo();
                    break;
            }
            System.out.println();
            }

        }
    }


