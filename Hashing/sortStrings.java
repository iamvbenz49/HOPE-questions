import java.util.Arrays;
import java.util.Scanner;

public class sortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings : ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.print("Enter the the string "+(i+1)+": ");
            arr[i] = sc.nextLine();
        }
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(String[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static void swap(String[] arr,int i,int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
