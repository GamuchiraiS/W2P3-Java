//importing utility classes
import java.util.*;

public class P3{
	public static void main(String args []){
	//From the Fibonacci sequence the first and second
        //number are always going to be 
        //0 and 1 so we code that
        int firstNum = 0;
        int secondNum = 1;
        int thirdNum;
        int numsShown;

        //Creating a scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers from the Fibonacci series must be shown? ");
        numsShown = sc.nextInt();
        System.out.println(firstNum + "\n" + secondNum); //prints 1st and 2nd num

        for (int i = 2; i < numsShown; i++){
        	thirdNum = firstNum + secondNum;
        	System.out.println(thirdNum + "");
        	firstNum = secondNum;
        	secondNum = thirdNum;
        }
	}
}
