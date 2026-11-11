import java.util.Scanner;

class WhileLoop {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer");

        // Safely check if the next entry is an integer before reading it
        while (input.hasNextInt() && (n = input.nextInt()) != 0) {
            System.out.println("You entered " + n);
            System.out.println("Input an integer");
        }

        System.out.println("Out of loop");
        input.close(); // Clears the VS Code warning
    }
}
