public class LogMessageRunner 
{
    public static void main(String[] args) 
    {
 		LogMessage lm = new LogMessage( "SERVER1:error on disk" );
 		System.out.println( lm );
 		System.out.println( lm.containsWord("disk") );  //true
 		lm.setMessage( "SERVER1:error on /dev/disk disk" );
 		System.out.println( lm.containsWord("disk") );  //true
 		lm.setMessage( "SERVER1:error on disk DSK1" );
 		System.out.println( lm.containsWord("disk") );  //true
 		lm.setMessage( "SERVER1:error on disk3" );
 		System.out.println( lm.containsWord("disk") );   //false
 		lm.setMessage( "SERVER1:DISK" );
 		System.out.println( lm.containsWord("disk") );   //false
 		lm.setMessage( "SERVER1:error on /dev/disk" );
 		System.out.println( lm.containsWord("disk") );   //false
  		lm.setMessage( "SERVER1:diskette" );
 		System.out.println( lm.containsWord("disk") );   //false		 		 		
    }
}
