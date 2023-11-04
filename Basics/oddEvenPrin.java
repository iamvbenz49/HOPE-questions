public class oddEvenPrin {
    public static void main(String[] args) {
        int n = 6758;
        System.out.println(driverCode(n));
    }
    public static int driverCode(int n){
        n = reverseInteger(n);
        int oddNum = 0;
        int evenNum = 0;
        int count = 0;
        int res = 0;
        while(n!=0){
            if((n%10)%2==0){
                evenNum = (evenNum*10) + (n%10);
                count++;
            }
            else{
                oddNum = (oddNum*10) + (n%10);
            }
            n/=10;
        }
        res =  (oddNum*((int)Math.pow(10,count))) + evenNum;
        return res;
    }
    public static int reverseInteger(int n){
        int res = 0;
        while(n!=0){
            res = (res*10) + (n%10);
            n/=10;
        }
        return res;
    }
}
