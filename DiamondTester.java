import java.util.Arrays;
import java.util.*;
public class DiamondTester
{
  ArrayList<Diamond> stones = new ArrayList<Diamond>();

  public void main ( String[] args )
  {
  
    
   stones.add(new Diamond( "A1023", 1.0, "VS1",  'F', "brilliant"));
   stones.add(new Diamond( "A5911", 1.1, "VVS2", 'G', "rose"));
   stones.add(new Diamond( "C5427", 1.0, "VS1",  'D', "princess"));
   stones.add(new Diamond( "D8307", 1.6, "SI1",  'H', "brilliant"));
   stones.add(new Diamond( "B4825", 0.3, "I1",   'D', "rose"));
   stones.add(new Diamond( "A1844", 2.1, "VS2",  'D', "lozenge"));
   stones.add(new Diamond( "A3747", 3.1, "SI2",  'W', "baguette"));
   stones.add(new Diamond( "E6393", 2.3, "VS2",  'I', "brillian"));
   stones.add(new Diamond( "C5619", 2.8, "VVS1", 'E', "pear"));
   stones.add(new Diamond( "E8348", 1.4, "VS2",  'G', "brilliant"));
   stones.add(new Diamond( "D2381", 1.7, "I3",   'G', "brilliant"));
   stones.add(new Diamond( "C9253", 1.3, "VS2",  'H', "baguette"));
   stones.add(new Diamond( "G3459", 2.1, "VS2",  'H', "rose"));
   stones.add(new Diamond( "B3598", 2.4, "VVS2", 'D', "pear"));
   stones.add(new Diamond( "D9836", 2.8, "IF",   'E', "princess"));
   stones.add(new Diamond( "E1046", 2.2, "FL",   'E', "rose"));
       
   Collections.sort( stones );

   for ( Diamond diamond : stones )
     System.out.println( diamond );
  }
  
  public void addDiamond(String s, double car, String clar, char col, String ct) {
      Diamond rock = new Diamond(s, car, clar, col, ct);
      for(int i=0; i<stones.size(); i++) {
          if(rock.compareTo(stones.get(i))>0) {
              stones.add(i,rock);
          }
          else stones.add(rock);
      }
  }
}
