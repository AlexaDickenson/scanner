import java.util.Scanner;

class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String inputString = scanner.nextLine();
        System.out.println("Hi" + inputString);
        scanner.close();
    }
}
class HelloThere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello there! How are you doing today? ");
        String input1 = scanner.nextLine();

        System.out.print("Wow - Interesting! Tell me more! ");
        String input2 = scanner.nextLine();

        System.out.println("Nice chatting with you, goodbye!");
        scanner.close();
    }
}
class Superhero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's write a story about a superhero.");
        System.out.print("Who is the hero of our story? ");
        String name = scanner.nextLine();

        System.out.print("What is their superpower? ");
        String superpower = scanner.nextLine();

        System.out.println("Here is the story:");
        System.out.println("There once was a superhero named " + name + ", who had the power of " + superpower + ".");
        System.out.println("As they grew older, " + name + " saw that the world needed them.");
        System.out.println(name + " used their ability to " + superpower + " to save the world.");

        scanner.close();
    }
}

class VariableInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string of text: ");
        String strInput = scanner.nextLine();

        System.out.print("Enter an integer: ");
        int intInput = scanner.nextInt();

        System.out.print("Enter a double: ");
        double doubleInput = scanner.nextDouble();

        System.out.print("Enter a boolean value: ");
        boolean booleanInput = scanner.nextBoolean();

        System.out.println("Your string is " + strInput);
        System.out.println("Your integer is " + intInput);
        System.out.println("Your double is " + doubleInput);
        System.out.println("Your boolean is " + booleanInput);

        scanner.close();
    }
}

