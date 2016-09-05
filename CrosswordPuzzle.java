import java.util.List;
import java.util.ArrayList;

public class CrosswordPuzzle
{
	private Square[][] puzzle;
	
	public CrosswordPuzzle( boolean[][] blackSquares ) 
	{ 
		puzzle = new Square[blackSquares.length][blackSquares[0].length];
		int count = 1;
		for(int r=0; r<blackSquares.length; r++) {
		    for(int c=0; c<blackSquares[0].length; c++) {
		        if(blackSquares[r][c]) {
		            puzzle[r][c]= new Square(true, 0);
		          }
		        else if(toBeLabeled(r,c,blackSquares)) {
		            puzzle[r][c] = new Square(false, count);
		            count++;
		          }
		        else if(toBeLabeled(r,c,blackSquares)==false && blackSquares[r][c]==false) {
		            puzzle[r][c] = new Square(false, 0);
		          }
		      }
		  }
	} 
    	
	public boolean toBeLabeled( int r, int c, boolean[][] blackSquares )
	{
		if(blackSquares[r][c]==false){
		    if(r==0 || c==0 || blackSquares[r-1][c]==true || blackSquares[r][c-1]==true) {
		        return true;
		      }
		  }
		return false;
	}   
    	
    	//not part of the exam, but helpful to see the grid
    public String toString()
    {
    	String ret = "";
    	for( Square[] row : puzzle )
    	{
    		for( Square it : row )
    		{
    			if( it == null )
    				ret += String.format("%-9s","null");
    			else
    				ret += it;
    		}
    		ret += "\n";
    	}
    	return ret;
    }
}