package LinearSearch;
import  java.util.*;

public class linearSearch {
    public static int search(int[] array,int key){
        for(int i=0; i<array.length;i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the Elements");
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter key element: ");
        int key = sc.nextInt();
        int result = search(array,key);
        if(result != -1){
            System.out.println("The Element "+key+" is found in the position "+result);
        }else {
            System.out.println("The Element "+key+" not Found!!");
        }

    }
}
