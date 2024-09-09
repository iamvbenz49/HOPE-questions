public class integerToBinary {
    public static void main(String[] args) {
        int inputNumber = 10;
        toBinary(inputNumber);
        System.out.println();
    }
    public static void toBinary(int number) {
        if(number == 0)
            return ;
        toBinary(number/2);
        System.out.print(number%2);
    }
}
