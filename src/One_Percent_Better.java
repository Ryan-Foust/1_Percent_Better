import java.util.Scanner;
public class One_Percent_Better {
    /**
     * from @AJA_Cortes on twitter
     * args[0] = how to take input (should be 1 or 0)
     * args[1] = starting performance (in lbs as of now)
     * args[2] = days later
     */

    public static void main (String[] args) {
//        // checking the args arguments
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }

        // where will the input come from? 1 for the String []args, 0 for Scanner/user input
        int control = Integer.parseInt(args[0]);

        // invalid number
        if (control >= 2) {
            System.out.println("control variable was not good.");
        }

        // 0 for Scanner/user input
        else if (control == 0) {
            user();
        }

        // 1 for the String []args
        else {
            comm(args);
        }
    }

    /**
     * Handles user input
     */
    public static void user () {
        // System.out.println("entered user method");

        Scanner keyboard = new Scanner(System.in);
        double start;
        double days;

        // get starting performance from user
        System.out.print("Starting performance (in lbs): ");
        int temp_s = keyboard.nextInt();
        start = temp_s;

        // get days from user
        System.out.print("Days: ");
        int temp_d = keyboard.nextInt();
        days = temp_d;

        // call math() method
        double after = math(start, days);

        // todo work on printf to format the numbers properly
        System.out.println("After "+days+" days of 1% better everyday, with "+start+" as your starting point, " +
                "your performance should be at "+after);
    }

    /**
     * Handles command line input and/or config input
     * @param nums the same args from main(), to be used for calculation
     */
    public static void comm(String[] nums) {
//        System.out.println("entered config method");
//
//        // checking the nums arguments
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

        // parse input nums
        double start = Double.parseDouble(nums[1]);
        double days = Double.parseDouble(nums[2]);

        // call math() method
        double after = math(start, days);

        // todo work on printf to format the numbers properly
        System.out.println("After "+days+" days of 1% better everyday, with "+start+" as your starting point, " +
                "your performance should be at "+after);
    }

    /**
     * Handles the math of this app
     * @param in performance starting number
     * @param time how many days to pass
     * @return resulting performance, assuming 1% better everyday, and math works like compound interest
     */
    public static double math (double in, double time) {
        final double multiplier = 1.01;
        double result = in;

        // for each day that passes, multiply yesterday's performance by 1.01 (1% improvement)
        for (int i = 0; i < time; i++) {
            result *= multiplier;
        }

        return result;
    }
}
