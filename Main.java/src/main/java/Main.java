import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {


    static Scanner console = new Scanner(System.in);
    public static void main(String[] args){
        int UserInput;
        System.out.println("How many random numbers would you like generated?: ");
        UserInput = console.nextInt();

        try{
           Integer.parseInt(String.valueOf(UserInput));
        }catch (NumberFormatException e){
            System.out.println("Error request is invalid");
        }
        if (UserInput < 0) {
            System.out.println("Error request is invalid");
        }else{
        System.out.println("what is the min value youd like?: ");
       int MinInt = console.nextInt();

        System.out.println("What is the max value youd like?: ");
        int MaxInt = console.nextInt();

        if(MaxInt < MinInt){
            System.out.println("Error request Invalid");
        }else{
            for (int i = 0; i <= UserInput; i++){

               int randomNum = ThreadLocalRandom.current().nextInt(MinInt,MaxInt+1);
                System.out.print(randomNum + ", ");
            }

        }

        }


    }
}
