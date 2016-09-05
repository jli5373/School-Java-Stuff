import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Word implements Comparable<Word>
{
    private String word;

    public Word( String s)
    {
        word = s;
    }

    public int compareTo(Word other) {
        int vowela=0;
        int vowelb=0;
        for(int i=0; i<word.length(); i++) {
            if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='o'||word.charAt(i)=='i'||word.charAt(i)=='u') {
                vowela++;
            }
        }
        for(int i=0;i<other.word.length(); i++) {
            if(other.word.charAt(i)=='a'||other.word.charAt(i)=='e'||other.word.charAt(i)=='o'||other.word.charAt(i)=='i'||other.word.charAt(i)=='u') {
                vowelb++;
            }
        }
        if(vowela!=vowelb) {
            return vowela-vowelb;
        }
        else {
            return word.compareTo(other.word);
        }
    }
    
    public String toString() {

    return word;
    
    
    
    }
}
