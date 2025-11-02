package ToHexadecimal;

import java.util.Scanner;

public class ToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        String hexa = "";
        while(n!=0){
            int r = n%16;
            if(r<=15 && r>=10){
                r = r+55;
                hexa=(char)r+hexa;
            }else{
                hexa = r+hexa;
            }
            n=n/16;
        }
        System.out.println("Hexadecimal Value: ");
        System.out.println(hexa);
    }
}
