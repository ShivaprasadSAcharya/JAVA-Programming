package BuzzNumber;
import java.util.Scanner;
//A buzz number is a number that is either divisible by 7 or ends with the digit 7.
// For example, 14 is a buzz number because it's divisible by 7,
// and 17 is a buzz number because it ends with 7
public class BuzzNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();

        if(n%7==0 || n%10==7){
            System.out.println(n+" is a Buzz Number.");
        }else{
            System.out.println(n+" is not a Buzz Number.");
        }

    }
}
