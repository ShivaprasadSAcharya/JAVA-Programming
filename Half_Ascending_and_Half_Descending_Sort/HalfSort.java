package Half_Ascending_and_Half_Descending_Sort;

import java.util.Scanner;

public class HalfSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;
        int[] a = {8,9,5,1,7,4};
        System.out.println("Initial Array:");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            for(int j=n/2; j<n-1; j++){
                if(a[j]<a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
