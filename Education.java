import java.util.Scanner;

public class Education {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

        System.out.println("Enter the number on the left");

        int numberOne = input.nextInt();

        System.out.println("Enter the number on the right");

        int numberTwo = input.nextInt();

        String mergeString = merge(numberOne,numberTwo).replace("&" , "UwU");
        String printString = mergeString;
        System.out.println(printString);

        //OR
        /* String mergeInt = merge(numberOne,numberTwo).replace("&","");
        int PrintInt = Integer.parseInt(mergeInt);
        System.out.println(printInt);
        */

    }

    public static String merge(int left , int right){
    //    String or String.valueOf()
    String result = left + "&" + right;
    return result;


    // Github = emreTurkeri
    }
}
