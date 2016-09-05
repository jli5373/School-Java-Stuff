public class LogMessage
{
    private String machineId;
    private String description;
    
    public LogMessage( String message ) 
    {
        machineId = message.substring(0,message.indexOf(":"));
        description = message.substring(message.indexOf(":")+1);
    }
    
    public void setMessage( String message) 
    {
        machineId = message.substring(0,message.indexOf(":"));
        description = message.substring(message.indexOf(":")+1);
    }
    
    public boolean containsWord( String keyword )
    {
        int spot=description.indexOf(keyword);
        if(spot==-1) {
            return false;
           }
        else if(spot==0 || description.substring(spot-1,spot).equals(" ")) {
            if(spot==description.length()-keyword.length() || description.substring(spot+keyword.length(),spot+keyword.length()+1).equals(" ")) {
            return true;
           }
        }
      return false;
    }
    
    public String getMachineId()
    {
        return machineId;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public String toString()
    {
        return "" + machineId + " " + description;
    }    
}