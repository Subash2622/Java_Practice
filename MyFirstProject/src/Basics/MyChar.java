package Basics;

public class MyChar {
    private char ch;

    public MyChar(char ch){
        this.ch = ch;
    }

    public static void printLowerCaseAlphabet() {
        for(char ch = 'a';ch <= 'z';ch++){
            System.out.print(ch + " ");
        }
    }

    public static void printUpperCaseAlphabet() {
        for(char ch = 'A';ch <= 'Z';ch++){
            System.out.print(ch + " ");
        }
    }

    public boolean isConsonant() {
        if(isAlphabet() && !isVowel())
            return true;
        return false;
    }

    public boolean isVowel() {
        if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o'
                ||ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                ||ch == 'O' ||ch == 'U' )
            return true;
        return false;
    }

    public boolean isAlphabet() {
        if (ch >= 97 && ch <= 122)
            return true;
        if (ch >= 65 && ch <= 90)
            return true;
        return false;
    }

    public boolean isDigit() {
        if(ch >= '0' && ch <= '9'){
            return true;

        }
        return false;
    }
}
