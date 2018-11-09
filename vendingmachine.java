import java.util.*;

public class vendingmachine {
    public static void main(String[]args ){
        Scanner scanner = new Scanner(System.in);

        int cola = 90;
        int sprite = 90;
        int fanta = 90;
        int drpepper = 90;
        int icetea = 90;
        int user = 200;
        int choice = 0;
        int money = 0;
        int amount = 0;

        ArrayList<String> drankjes = new ArrayList<String>();
        drankjes.add("cola");
        drankjes.add("sprite");
        drankjes.add("fanta");
        drankjes.add("drpepper");
        drankjes.add("icetea");

        ArrayList<String> output = new ArrayList<String>();

        System.out.println("Hello, we have a selection of the following drinks: ");
        System.out.println(drankjes);

        while(user > 90){
            System.out.println("what would you like?");
            choice = scanner.nextInt();

            if (choice < 1){
                System.out.println("please choose one of the drinks");
                choice = scanner.nextInt();
            }

            else if(choice > 5){
                System.out.println("please choose one of the drinks");
                choice = scanner.nextInt();
            }

            switch(choice){
                case 1:
                    System.out.println("That will be 90 cents please.");
                    output.add("cola");
                    break;
                case 2:
                    System.out.println("That will be 90 cents please.");
                    output.add("sprite");
                    break;
                case 3:
                    System.out.println("That will be 90 cents please.");
                    output.add("fanta");
                    break;
                case 4:
                    System.out.println("That will be 90 cents please.");
                    output.add("drpepper");
                    break;
                case 5:
                    System.out.println("That will be 90 cents please.");
                    output.add("icetea");
                    break;
            }

            System.out.println("Enter your amount in cents");
            money = scanner.nextInt();

            if (money > 200){
                System.out.println("Please a little less");
                money = scanner.nextInt();
            }

            else if(money < 90){
                System.out.println("I'm afraid you'll need a little more");
                money = scanner.nextInt();
            }

            switch(choice){
                case 1:
                    System.out.println("Congrats you've chosen for cola");
                    amount = money - cola;
                    System.out.println("Your change is: " + amount + " cent");
                    break;
                case 2:
                    System.out.println("Congrats you've chosen for sprite");
                    amount = money - sprite;
                    System.out.println("Your change is: " + amount + " cent");
                    break;
                case 3:
                    System.out.println("Congrats you've chosen for fanta");
                    amount = money - fanta;
                    System.out.println("Your change is: " + amount + " cent");
                    break;
                case 4:
                    System.out.println("Congrats you've chosen for drpepper");
                    amount = money - drpepper;
                    System.out.println("Your change is: " + amount + " cent");
                    break;
                case 5:
                    System.out.println("Congrats you've chosen for icetea");
                    amount = money - icetea;
                    System.out.println("Your change is: " + amount + " cent");
                    break;
            }

            user = user - (money-amount);
        }
        System.out.println("I'm afraid you don't have enough money mate.");
        System.out.println("you have bought: " + output);
    }

}
