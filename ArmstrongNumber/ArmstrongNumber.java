package ArmstrongNumber;
import java.util.Scanner;
//An Armstrong number is a number that is equal to the sum of
// its own digits each raised to the power of the number of digits.
//For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153

public class ArmstrongNumber {
    public static boolean test(int n){
        int sum = 0;
        int temp = n;
        int count = 0;
        while(temp!=0){
            temp = temp/10;
            count++;
        }
        temp = n;
        while(temp!=0){
            int r = temp%10;
            temp =temp/10;
            int m = 1;
            for(int i =1; i<=count;i++ ){
                m = m*r;
            }
            sum +=m;
        }
        System.out.println("sum: "+sum);
        if(n==sum){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        System.out.println(test(n)? n+" is a Armstrong Number.":n+" is not a Armstrong Number.");
    }
}
