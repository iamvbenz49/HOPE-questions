import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String 1 : ");
        String s1 = sc.next();
        System.out.println();
        System.out.print("Enter the String 2 : ");
        String s2 = sc.next();
        if(validAnagaram(s1,s2)){
            System.out.println("Strings are Anagram");
        }else{
            System.out.println("Strings are not anagram");
        }
    }
    public static boolean validAnagaram(String s1,String s2){
        int[] hash = new int[26];
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(ch>='a'){
                hash[(int)(ch-97)]+=1;
            }else{
                hash[(int)(ch-65)]+=1;
            }
        }
        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            if(ch>='a'){
                hash[ch-97]-=1;
            }else{
                hash[ch-65]-=1;
            }
        }
        for(int i=0;i<s2.length();i++){
            if(hash[i]!=0)
                return false;
        }
        return true;
    }
}
