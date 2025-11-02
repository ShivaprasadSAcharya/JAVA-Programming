package AutomorphicNumber;
import java.util.Scanner;

//An automorphic number is a number whose square ends with the same digits as the original number.
public class AutomorphicNumber {
    public static boolean Auto(int n){
        int sq = n*n;
        System.out.println("Square of "+n+" is "+sq);
        while(n!=0){
            int r = n%10;
            int s = sq%10;
            sq = sq/10;
            n = n/10;
            if(r!=s){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        System.out.println(Auto(n)? n+" is a Automorphic Number.":n+" is not a Automorphic Number.");
    }
}
