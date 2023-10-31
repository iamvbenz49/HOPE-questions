import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class symmetricPairs {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4},{2,1},{4,3}};
        System.out.println("Count with brute force : "+bruteForce(arr));
        System.out.println("Count with HashMap" + pairs(arr));
        
    }
    public static int pairs(int[][] arr){
        Map<Integer,Integer> set = new HashMap<>();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            Arrays.sort(arr[i]);
            if(set.containsKey(arr[i][0]) && set.get(arr[i][0])==arr[i][1]){
                count++;
            }else{
                set.put(arr[i][0],arr[i][1]);
            }
        }
        for (Entry<Integer, Integer> entry : set.entrySet()) {
            System.out.println("["+entry.getKey() + "," + entry.getValue()+"]"+" and "+"["+entry.getValue() + "," + entry.getKey()+"]");
        }
        return count;
    }
    public static int bruteForce(int[][] arr){
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i][0]==arr[j][0] && arr[i][1]==arr[j][1]) || (arr[i][0]==arr[j][1] && arr[i][1]==arr[j][0])){
                  //  System.out.println();
                    count++;
                }
            }
        }
        return count;
    }
}
