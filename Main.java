import java.util.*;
public class Main {
    public static void main(String[] args) {
//        int test1 = 1;
//        int test2 = 3;
//        int testOutput = test1/test2;
//        System.out.println(testOutput);

        //Input-output section
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the dividend");
        int dividend = Integer.parseInt(sc.nextLine()); //The number to be divided
        System.out.println("Please input the divisor");
        int divisor = Integer.parseInt(sc.nextLine()); //The number to divide the other one by
        boolean resultIsInteger; //A boolean that should be set to true when the result is an integer

        //Determine if the quotient is an integer
        if(dividend % divisor == 0) {
            resultIsInteger = true;
        }
        else {
            resultIsInteger = false;
        }


        System.out.println("------------------------------------------------------------"); //For visual formatting

        //Calculating and printing the output
        if (resultIsInteger) {
            int output = dividend / divisor;
            System.out.println("The quotient is an integer: " + output);
        }
        else {
            System.out.println("The result is not an integer. How many digits would you like to print: ");
            int digits = Integer.parseInt(sc.nextLine());
            System.out.println(calc(dividend, divisor, digits));
        }

    }

    public static String calc(int dividend, int divisor, int digits) {
        String output = "";
        int temp = 0;
        int remainder;
        boolean isSmaller = false;
        for (int i = 0; i < digits; i++) {
            if (dividend < divisor && !isSmaller) {
                isSmaller = true;
                output = output + "0";
                output = output + ".";
                temp = dividend/divisor;
                dividend = (dividend % divisor) * 10;
                continue;
            }
            temp = dividend/divisor;
            dividend = (dividend % divisor) * 10;
            output = output + temp;
        }
        return output;
    }
}