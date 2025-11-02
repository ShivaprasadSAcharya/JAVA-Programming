package LeapYear;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int n= sc.nextInt();

        if((n%4==0 && n%100!=0)||(n%400==0)){
            System.out.println("The year "+n+" is a Leap year.");
        }else{
            System.out.println("The year "+n+" is not a Leap year.");
        }
    }
}
