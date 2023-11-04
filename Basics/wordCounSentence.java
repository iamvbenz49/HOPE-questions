public class wordCounSentence {
    public static void main(String[] args) {
        String s = "Hello Student! How are you?";
        System.out.println("Number of words in sentence : "+wordCount(s));
    }
    public static int wordCount(String s){
        int count = 1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
                count++;
        }
        return count;
    }
}
