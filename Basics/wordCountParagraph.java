public class wordCountParagraph {
    public static void main(String[] args) {
        String s = "Hello Guys! Good Morning. Hope your doing good. Let's start our day with positives crood to go";
        System.out.println("Number of words in sentence : "+wordCount(s));
    }
    public static int wordCount(String s){
        int count = 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)!=' ' && s.charAt(i)==' ')
                count++;
        }
        return count;
    }
}
