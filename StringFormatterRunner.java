import java.util.ArrayList;
import java.util.List;

public class StringFormatterRunner 
{
    public static void main(String[] args) 
    {
 		ArrayList<String> list;
 		list = new ArrayList<String>();
 	/*	list.add( "A+" );
 		list.add( "COMP" );
 		list.add( "SCI" );	
 		list.add( "ROCKS" );	*/
 	/*	list.add( "BEACH" );
 		list.add( "BALL" );	 	*/
 		list.add("GREEN");
 		list.add( "EGGS" );
 		list.add( "AND" );
 		list.add( "HAM" );	
 		System.out.println( StringFormatter.totalLetters( list ) );
 		System.out.println( StringFormatter.basicGapWidth( list , 20 ) );
 		System.out.println( StringFormatter.leftoverSpaces( list , 20 ) );
 		String fin = StringFormatter.format( list, 20 );
 		System.out.println( fin );
 		
 		/*
 		 OUTPUT
 		 15
		1
		2
		GREEN  EGGS  AND HAM
		*/	 		
    }
}
