package DecimalToBinary;

import java.util.Scanner;

public class DecimalToBinary {
    public static void converter(int n){
        int[] bin = new int[8];
        int r,p=n;

        if(p!=1){
            for(int i=7;i>=0;i--){
                r=p%2;
                p=p/2;
                bin[i]=r;
            }
        }
        for (int j=0;j<8;j++){
            System.out.print(bin[j]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        converter(n);
    }
}
