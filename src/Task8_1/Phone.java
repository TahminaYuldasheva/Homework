package Task8_1;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {

    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }
    public void receiveCall(String name) {
        System.out.println(name + " is calling");
    }

    public void receiveCall(String name, String callerNumber) {
        System.out.println(name + " is calling " +  "with number: " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.println("The message will be sent to the following numbers: ");
        for (String num : numbers) {
            System.out.println(num);
        }
    }
    public void printPhoneInfo() {
        System.out.println("Phone number: " + number);
        System.out.println("Phone model: " + model);
        System.out.println("Weight: " + weight);
        System.out.println();
    }
}
