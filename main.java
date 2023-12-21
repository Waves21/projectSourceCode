import java.util.Scanner;

class GameCharacter {
    private String name;
    private int level;

    // Constructor
    public GameCharacter(String name, int level) {
        this.name = name;
        this.level = level;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level >= 0) { 
            this.level = level;
        } else {
            System.out.println("Invalid level. Level must be non-negative.");
        }
    }

    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
    }
}

class Mount {
    void makeSound() {
        System.out.println("Bark Bark!");
    }

    void displayDetails() {
        System.out.println("This is a Dog Mount");
    }
}

class Horse extends Mount {
    @Override
    void makeSound() {
        System.out.println("Neigh! Neigh!");
    }

    @Override
    void displayDetails() {
        System.out.println("This is a Horse Mount");
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("[1] Method Overriding");
            System.out.println("[2] Encapsulation");
            System.out.println("[3] Exit");

            int choice = scanner.nextInt();

            switch (choice ){
                case 1:
                    runMethodOverridingExample();
                    break;
                case 2:
                    runEncapsulationExample(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void runMethodOverridingExample() {
        System.out.println("Method Overriding Example:");

        
        Mount genericMount = new Mount();
        Mount myHorse = new Horse();

        
        System.out.println("Generic Mount Details:");
        genericMount.displayDetails();
        System.out.println("Generic Mount Sound:");
        genericMount.makeSound();

        System.out.println("\nMy Horse's Details:");
        myHorse.displayDetails();
        System.out.println("My Horse's Sound:");
        myHorse.makeSound();

        System.out.println("Method Overriding example completed.\n");
    }

    private static void runEncapsulationExample(Scanner scanner) {
        System.out.println(" Encapsulation example...");

        
        System.out.println("Enter character details:");
        System.out.print("Name: ");
        scanner.nextLine(); 
        String name = scanner.nextLine();

        System.out.print("Level: ");
        int level = scanner.nextInt();

        
        GameCharacter character = new GameCharacter(name, level);

        
        System.out.println("\nCharacter Details:");
        character.displayDetails();

        
        System.out.println("\nEnter new details:");
        scanner.nextLine(); 
        System.out.print("New Name: ");
        character.setName(scanner.nextLine());

        System.out.print("New Level: ");
        character.setLevel(scanner.nextInt());

        
        System.out.println("\nUpdated Character Details:");
        character.displayDetails();

        System.out.println("Encapsulation example completed.\n");
    }
}
