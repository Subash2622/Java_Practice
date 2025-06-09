package Array_And_Arraylist;

public class StringMagic {
    public String findLongestWord(String sentence){
        if(sentence == null || sentence.equals("")){
            return "";
        }
        String[] words = sentence.split(" ");
        int maxLength = 0;
        String longestWord = "";
        for (String word: words){
            if(word.length()>maxLength){
                maxLength = word.length();
                longestWord = word;
            }
        }
        return longestWord;
    }
    public static void main(String[] args) {
        StringMagic sm = new StringMagic();
        String sentence = "Java is an object oriented programming language";
        String sentence1 = "A quick brown fox jumps over the lazy dog";
        String result = sm.findLongestWord(sentence);
        String result1 = sm.findLongestWord(sentence1);
        System.out.println("Longest word: " + result);
        System.out.println("Longest word: " + result1);
    }
}
