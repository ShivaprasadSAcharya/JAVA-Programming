package ArrayFrequency;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter Array elements: ");
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        countFrequency(arr,size);

    }
    static void countFrequency(int[] arr, int size){
        Arrays.sort(arr);

        for(int i=0; i<size; i++){
            int count =1;
            while(i< size-1 && arr[i]==arr[i+1]){
                i++;
                count++;
            }

            System.out.println(arr[i]+": "+count);

        }

    }

}

