public class WordLength implements Comparable<WordLength>
{
    private String word;

    public WordLength( String s )
    {
        word = new String(s);
    }

    public int compareTo(WordLength other) {
        if(word.length()!=other.word.length()) {
            return word.length()-other.word.length();
        }
        else {
            return word.compareTo(other.word);
        }
        
    }
    
    public String toString() {
        return "" + word;
    }
}