public class SystemLogRunner 
{
    public static void main(String[] args) 
    {
 		SystemLog sys = new SystemLog();
 		sys.add( new LogMessage( "CLIENT3:security alert - repeated login failures" ) );
 		sys.add( new LogMessage( "Webserver:disk offline" ) );
 		sys.add( new LogMessage( "SERVER1:file not found" ) );
 		sys.add( new LogMessage( "SERVER2:read error on disk DSK1" ) );
 		sys.add( new LogMessage( "SERVER1:write error on disk DSK2"  ) );
 		sys.add( new LogMessage( "Webserver:error on /dev/disk"  ) );
 		System.out.println( sys.removeMessages( "disk" ) );	
 		System.out.println( sys );
 		
 		/*
 		 OUTPUT
 		 [Webserver disk offline, 
 		 SERVER2 read error on disk DSK1, 
 		 SERVER1 write error on disk DSK2]
 		 
		 [CLIENT3 security alert - repeated login failures, 
		  SERVER1 file not found, 
		  Webserver error on /dev/disk]
		*/	 		
    }
}
