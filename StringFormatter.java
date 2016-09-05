import java.util.ArrayList;
import java.util.List;

public class StringFormatter
{
    public static int totalLetters( List<String> wordList )
    {
        int sum = 0;
        for(int i=0; i<wordList.size(); i++) {
            sum+=wordList.get(i).length();
          }
        return sum;
    }
    
    public static int basicGapWidth( List<String> wordList, int formattedLen )
    {
        int gap = ((formattedLen-totalLetters(wordList))/(wordList.size()-1));
        return gap;
    }
    
    public static int leftoverSpaces( List<String> wordList, int formattedLen)
    {
        int left = (formattedLen-totalLetters(wordList)-((wordList.size()-1)*basicGapWidth(wordList,formattedLen)));
        return left;
    }
    
    public static String format( List<String> wordList, int formattedLen )
    {
        String form = "";
        form+=wordList.get(0);
        String gap="";
        for(int i=0; i<basicGapWidth(wordList,formattedLen); i++) {
            gap+= " ";
          }
        for(int i=1; i<wordList.size(); i++) {
            if(leftoverSpaces(wordList,formattedLen)>0) {
                form+= gap+" "+wordList.get(i);
          }
          else {
              form+= gap + wordList.get(i);
          }
        }
        return form;
    }
}