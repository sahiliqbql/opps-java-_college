public class q10_input_from_keyboard_n_addition_using_command_line_argument {
    public static void main(String[] args) {
        // Input from command-line argument (if available)
        if (args.length == 2) {
            try {
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);
                System.out.println("Sum using command-line arguments: " + (num1 + num2));
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid numbers as command-line arguments.");
            }
        } else {
            System.out.println("Command-line arguments not provided or insufficient. Moving to keyboard input...");
        }

        // Input from keyboard
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("Sum using keyboard input: " + (num1 + num2));
    }
}
