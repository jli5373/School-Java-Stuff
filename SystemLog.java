import java.util.ArrayList;
import java.util.List;

public class SystemLog
{
	private List<LogMessage> messageList;
	
	public SystemLog()
	{
		messageList = new ArrayList<LogMessage>();
	}
	
	public void add( LogMessage m )
	{
		messageList.add( m );
	}

	public List<LogMessage> removeMessages(String keyword){
		ArrayList<LogMessage> a=new ArrayList<LogMessage>();
		for(int y=0;y<messageList.size();y++){
			if(messageList.get(y).containsWord(keyword)){
				a.add(messageList.remove(y));
			}
		}
		return a;
	}
	
	public String toString()
	{
		return "" + messageList;
	}
       
}