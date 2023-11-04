import java.util.Arrays;

public class arrayOfIndex {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,1};
        driverCode(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void driverCode(int[] arr){
        for(int i=0;i<arr.length;i++){
            int temp = arr[i];
            arr[i] = arr[temp];  
            arr[temp] = temp;
        }
    }
}
