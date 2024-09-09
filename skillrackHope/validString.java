import java.util.Arrays;

public class validString {
    private static Boolean[][][] dp;
    public static void main(String[] args) {
        String firstString = "NOSE", secondString = "NECK", checkString = "NONSECK";
        dp = new Boolean[s1.length()+1][s2.length()+1][s.length()+1];
        for(int firstIndex = s1.length(); firstIndex >= 0; firstIndex--) {
            for(int secondIndex = s2.length(); secondIndex >= 0; secondIndex--) {
                for(int checkIndex = s.length(); checkIndex >= 0; checkIndex--) {
                    char checkChar = checkString.charAt(checkIndex);
                    boolean checkFirstString = false, checkSecondString = false;
                    if(firstIndex < firstString.length() && firstString.charAt(firstIndex) == checkChar) {
                        checkFirstString = checkValidString(firstString, secondString, checkString, firstIndex + 1, secondIndex, checkIndex + 1);
                    }
                    if(secondIndex < secondString.length() && secondString.charAt(secondIndex) == checkChar) {
                        checkSecondString = checkValidString(firstString, secondString, checkString, firstIndex , secondIndex + 1, checkIndex + 1);
                    }
                    dp[firstIndex][secondIndex][checkIndex] = checkFirstString || checkSecondString;
                }
            }        
        }
        if(checkValidString(s1, s2, s, 0, 0, 0)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
    public static boolean checkValidString(String firstString, String secondString, String checkString, int firstIndex, int secondIndex, int checkIndex) {
        if(checkIndex == checkString.length()) {
            return true;
        }
        if(dp[firstIndex][secondIndex][checkIndex] != null)
            return dp[firstIndex][secondIndex][checkIndex];
        char checkChar = checkString.charAt(checkIndex);
        boolean checkFirstString = false, checkSecondString = false;
        if(firstIndex < firstString.length() && firstString.charAt(firstIndex) == checkChar) {
            checkFirstString = checkValidString(firstString, secondString, checkString, firstIndex + 1, secondIndex, checkIndex + 1);
        }
        if(secondIndex < secondString.length() && secondString.charAt(secondIndex) == checkChar) {
            checkSecondString = checkValidString(firstString, secondString, checkString, firstIndex , secondIndex + 1, checkIndex + 1);
        }
        return dp[firstIndex][secondIndex][checkIndex] = checkFirstString || checkSecondString;
    }
}
