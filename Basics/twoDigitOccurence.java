public class twoDigitOccurence {
    public static void main(String[] args) {
        System.out.println(bruteForce(20));
    }
    public static int bruteForce(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            int temp = i;
            while(temp!=0){
                if(temp%10==2)
                    count++;
                temp/=10;
            }
        }
        return count;
    }
}
