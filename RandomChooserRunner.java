import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class RandomChooserRunner 
{
    public static void main(String[] args) 
    {
			System.out.println("\nRandomStringChooser");
			String[] ray = "wheels on the bus".split(" ");
			RandomStringChooser rsc = new RandomStringChooser( ray );
			for( int x = 0; x < 10; x++ )
			{
				System.out.println( rsc.getNext() );
				System.out.println( rsc );
			}
			
			RandomLetterChooser rsc2 = new RandomLetterChooser( "apluscompsci" );
			for( int x = 0; x < 15; x++ )
			{
				System.out.println( rsc2.getNext() );
				System.out.println( rsc2 );
			}			

    }
}
