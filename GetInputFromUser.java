import java.util.Scanner;

class GetInputFromUser
{
    public static void main(String args[])
    {
        int a;
        float b;
        String s;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter an integer");
        a = in.nextInt();
        System.out.println("You entered integer "+a);

        System.out.println("Enter a float");
        b = in.nextFloat();
        in.nextLine(); // Consumes the leftover newline character from nextFloat()
        System.out.println("You entered float "+b);

        System.out.println("Enter a string");
        s = in.nextLine(); // Properly waits for input now
        System.out.println("You entered string "+s);

        in.close(); // Closes the scanner to remove the VS Code warning
    }
}
