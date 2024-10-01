package Task9_1;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class AnimalMainClass2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal[] animals = new Animal[5];
        Random random = new Random();

        String[] names = {"Balto", "Garfield", "Bran", "Nemo", "Crookshanks", "Rio", "Dory", "Daisy", "Luna", "Kesha"};
        String[] ownerNames = {"John Wick", "Leo", "Harry", "Kate", "Lana"};
        String[] featherColors = {"Green", "Blue", "Red", "Yellow", "White"};

        for (int i = 0; i < animals.length; i++) {
            int id = i + 1;
            String name = names[random.nextInt(names.length)];
            int age = random.nextInt(15);
            int animalType = random.nextInt(5);
            switch (animalType) {
                case 0:
                    String ownerName = ownerNames[random.nextInt(ownerNames.length)];
                    animals[i] = new Dog(id, name, age, ownerName);
                    break;
                case 1:
                    animals[i] = new Cat(id, name, age);
                    break;
                case 2:
                    int maxFlightHeight = random.nextInt(2000);
                    animals[i] = new Raven(id, name, age, maxFlightHeight);
                    break;
                case 3:
                    animals[i] = new Fish(id, name, age);
                    break;
                case 4:
                    int parrotMaxFlightHeight = random.nextInt(1000);
                    String featherColor = featherColors[random.nextInt(featherColors.length)];
                    animals[i] = new Parrot(id, name, age, parrotMaxFlightHeight, featherColor);
                    break;
            }
        }

        while (true) {
            System.out.println("Select an animal:");
            for (int i = 0; i < animals.length; i++) {
                System.out.println((i + 1) + ". " + animals[i].showInfo());
            }

            try {
                System.out.print("Enter animal number (or 0 to exit): ");
                int choice = scanner.nextInt();

                if (choice == 0) {
                    System.out.println("Exit the program.");
                    break;
                }

                if (choice < 1 || choice > animals.length) {
                    throw new InputMismatchException("Incorrect entry of animal number.");
                }

                Animal selectedAnimal = animals[choice - 1];

                System.out.println("Select an action for " + selectedAnimal.name + ":");
                System.out.println("1. Feed");
                if (!(selectedAnimal instanceof Fish||selectedAnimal instanceof Raven || selectedAnimal instanceof Parrot)) {
                    System.out.println("2. Speak");
                }
                else if (selectedAnimal instanceof Fish) {
                    System.out.println("2. Swim");
                }

                if (selectedAnimal instanceof Dog) {
                    System.out.println("3. Walk");
                } else if (selectedAnimal instanceof Raven || selectedAnimal instanceof Parrot) {
                    System.out.println("2. Fly");
                }

                int action = scanner.nextInt();

                switch (action) {
                    case 1:
                        selectedAnimal.eat();
                        break;
                    case 2:
                        if ((selectedAnimal instanceof Fish)) {
                            selectedAnimal.swim();
                        }
                        else if ((selectedAnimal instanceof Dog)) {
                            selectedAnimal.speak();
                        }
                        else if ((selectedAnimal instanceof Cat)) {
                            selectedAnimal.speak();
                        }
                        else if (selectedAnimal instanceof Raven) {
                            selectedAnimal.fly();
                        }
                        else if (selectedAnimal instanceof Parrot) {
                            selectedAnimal.fly();
                        }
                        break;
                    case 3:
                        if (selectedAnimal instanceof Dog) {
                            selectedAnimal.walk();
                        }
                        break;
                    default:
                        System.out.println("Incorrect action.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input. Please enter a number.");
                scanner.next();
            }
            break;
        }
        scanner.close();
    }
}





