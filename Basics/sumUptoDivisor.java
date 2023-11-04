public class sumUptoDivisor {
    public static void main(String[] args) {
        System.out.println("for 12 4 : "+driverCode(12,4));
        System.out.println("for 16 6 : "+driverCode(16,6));
    }
    public static int driverCode(int n,int divisor){
        int remainderOfNumber = n%divisor;
        int sumOfDivisor = (divisor*(divisor-1))/2;
        int quotient = n/divisor;
        int remainderSum = (remainderOfNumber*(remainderOfNumber+1))/2;
        int res = (sumOfDivisor*quotient) + remainderSum;
        return res;
    }
}
