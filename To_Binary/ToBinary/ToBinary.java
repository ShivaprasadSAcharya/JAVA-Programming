package ToBinary;

import java.util.Scanner;

public class ToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        //int[] binary =new int[8];
        String bin ="";
        while(n!=0){
            int r=n%2;
            bin = r+bin;
            n=n/2;
        }
        System.out.println(bin);
    }
}
