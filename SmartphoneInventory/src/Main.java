import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Smartphone phoneOne = new Smartphone("Google", "Pixel 7 Pro",
                "Android", 12, 128, "Hazel", 3, 899.00f);

        Smartphone phoneTwo = new Smartphone("Google", "Pixel 6a",
                "Android", 6, 138, "Sage", 2, 449.00f);

        Smartphone phoneThree = new Smartphone("Samsung", "Galaxy Galaxy Z Flip 4", "Android",
                8, 512, "Pink Gold", 2, 999.00f);

        Smartphone phoneFour = new Smartphone("Samsung", "Galaxy S22 Ultra",
                "Android", 8, 128, "Burgundy", 4, 799.00f);

        Smartphone phoneFive = new Smartphone("Apple", "iPhone 14 Pro", "iOS",
                6, 128, "Deep Purple", 3, 999.00f);

        Smartphone phoneSix = new Smartphone("Apple", "iPhone 13 Pro", "iOS",
                6, 128, "Starlight", 3, 899.00f);


        Smartphone[] androidPhones = {phoneOne, phoneTwo, phoneThree, phoneFour};

        Smartphone[] iOSPhones = {phoneFive, phoneSix};

        Smartphone[] allPhones = {phoneOne, phoneTwo, phoneThree, phoneFour, phoneFive, phoneSix};

        // Store w/ just Android phones
        PhoneStore storeOne = new PhoneStore("Best Buy", "123 Main St, NY, NY, 10010", androidPhones);

        // Store w/ both Android and iOS phones
        PhoneStore storeTwo = new PhoneStore("Circuit City", "456 Main St, NY, NY, 10010", allPhones);

        // Store w/ just iOS phones
        PhoneStore storeThree = new PhoneStore("Apple NYC", "789 Main St, NY, NY, 10010", iOSPhones);

        Scanner input = new Scanner(System.in); // Collects user input

        System.out.println("Hi, this program provides an inventory of smartphones.\n"
                + "\nYou can either:"
                + "\n1): Enter 'S' to view all stores"
                + "\n2) Enter 'SA' to list store(s) with Android phones"
                + "\n3) Enter 'Si' to list store(s) with iPhones"
                + "\n4) Enter 'P' to see a list of available phones enter 'P'"
                + "\n5) Enter 'A' to view a list Android phones currently being sold"
                + "\n6) Enter 'i' to view a list iOS phones currently being sold");

        System.out.println();

        String cmd = "";

        while (!cmd.equalsIgnoreCase("q")) {
            System.out.println("Valid commands:"
                    + "\n- stores: S, SA, Si"
                    + "\n- phones: P, A, and i"
                    + "\n- quit: q ");
            System.out.print("Command: ");
            cmd = input.next().toUpperCase();  // Accesses user input as a string
            System.out.println();

            switch (cmd) {

                case "S":
                    storeOne.showStoreInfo();
                    storeTwo.showStoreInfo();
                    storeThree.showStoreInfo();
                    break;

                case "SA":
                    storeOne.showStoreInfo();
                    storeTwo.showStoreInfo();
                    break;

                case "SI":
                    storeTwo.showStoreInfo();
                    break;

                case "P":
                    for (Smartphone phone : allPhones) { // colon represents the word "in"
                        phone.show();
                    }
                    break;

                case "A":
                    for (Smartphone phone : androidPhones) {
                        phone.show();
                    }
                    break;


                case "I":
                    for (Smartphone phone : iOSPhones) {
                        phone.show();
                    }
                    break;

                case "Q":
                    System.out.println("You have exited the program");
                    break;

                default:
                    System.out.println("Invalid entry. Please try again.\n");
            }
        }

        input.close();

        // NOTE: Extra code below for other insights, can be commented out
        // Creating a store, adding its properties, and adding inventory
        System.out.println("\nPsych! ");
        PhoneStore storeFour = new PhoneStore();
        storeFour.setName("RadioShack");
        System.out.print("I think there could be more store competitions so I'm bringing " +
                storeFour.getName() + " back!\n");
        storeFour.setAddress("1012 Main St, NY, NY, 10010");
        storeFour.inventory = new Smartphone[2];
        storeFour.inventory[0] = phoneThree;
        storeFour.inventory[1] = phoneFive;
        System.out.print(storeFour.getName() +  " info:\n");
        storeFour.show();
        System.out.println("Later!!!");
    }
}
