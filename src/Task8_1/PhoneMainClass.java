package Task8_1;

public class PhoneMainClass {
    public static void main(String[] args) {

        Phone phone1 = new Phone("48-551783326", "iPhone", 150.5);
        Phone phone2 = new Phone("48-888324533", "Samsung", 300);
        Phone phone3 = new Phone("48-777614122", "Huawei", 200);

        phone1.printPhoneInfo();
        phone2.printPhoneInfo();
        phone3.printPhoneInfo();

        phone1.receiveCall("Sara");
        System.out.println("Phone number: "+phone1.getNumber());
        System.out.println();

        phone2.receiveCall("Kate");
        System.out.println("Phone number: "+phone2.getNumber());
        System.out.println();

        phone3.receiveCall("Alex");
        System.out.println("Phone number: "+phone3.getNumber());
        System.out.println();

        phone1.receiveCall("Sara", "48-551783326");
        System.out.println();

        phone1.sendMessage("48-551783326", "48-888324533", "48-777614122");
    }
}

