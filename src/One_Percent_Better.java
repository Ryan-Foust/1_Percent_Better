import java.util.Scanner;
public class One_Percent_Better {
    /**
     * from @AJA_Cortes on twitter
     */

    public static void main (String[] args) {
        // where will the input come from? 1 for the String []args, 0 for Scanner/user input
        int control = Integer.parseInt(args[0]);

        // invalid number
        if (control >= 2) {
            System.out.println("control variable was not good.");
        }

        // 0 for Scanner/user input
        else if (control == 0) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("control variable was 0.");
        }

        // 1 for the String []args
        else {
            System.out.println("control variable was 1.");
        }
    }


}
