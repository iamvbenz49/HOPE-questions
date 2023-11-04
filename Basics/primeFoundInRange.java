public class primeFoundInRange {
    public static void main(String[] args) {
        int start = 1;
        int end = 25;
        boolean[] primes = new boolean[26];
        sieve(end,primes);
        System.out.println("for 11 to 25 : "+driverCode(1,25,primes));
    }
    public static boolean driverCode(int start,int end,boolean[] primes){
        end-=1;
        while(start<=end){
            if(!primes[start] && !primes[end]){
                System.out.println("Pairs : "+ start + " to " + end);
                return true;
            }
            start++;
            end--;
        }
        return false;
    }
    static void sieve(int n ,boolean[] primes){
        for(int i = 2;i*i<=n;i++){
            if(!primes[i]){
                for(int j=i*2;j<=n;j+=i){
                    primes[j] = true;
                }
            }
        }
    }
}
