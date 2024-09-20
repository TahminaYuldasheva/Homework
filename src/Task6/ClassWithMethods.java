package Task6;

public class ClassWithMethods {
}
     class CreditCard {
        String accountNumber;
        double currentSum;

        public CreditCard(double initialSum, String accountNumber) {
            this.accountNumber = accountNumber;
            if (initialSum >= 0) {
                this.currentSum = initialSum;
            } else {
                System.out.println("Initial sum cannot be less than 0. ");
                this.currentSum = 0;
            }
        }


        public void addMoney(double amount) {
            if (amount > 0) {
                currentSum += amount;
            } else {
                System.out.println("Amount to add must be greater than 0.");
            }
        }

        public void withdrawMoney(double amount) {
            if (amount > 0 && currentSum >= amount) {
                currentSum -= amount;
            } else {
                System.out.println("Not enough funds on the account.");
            }
            System.out.println();
        }

        public void showInfo() {
            System.out.println("Account number " + accountNumber);
            System.out.println("Current account balance " + currentSum);
            System.out.println();
        }
    }
