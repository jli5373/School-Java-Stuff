import java.util.ArrayList;

public class RandomStringChooser
{
    private ArrayList<String> choices;
    
    public RandomStringChooser(String[] arr) {
        choices = new ArrayList<String>();
        for(int i=0; i<arr.length; i++) {
            choices.add(arr[i]);
        }
        
    }
    
    public String getNext() {
        if(choices.size()==0) {
            return "NONE";
        }
        else {int i = (int) (Math.random()*(choices.size()));
        String str = choices.get(i);
        choices.remove(i);
        return str;
    }
    }
     
    public String toString()
    {
        return "" + choices;
    }    
}