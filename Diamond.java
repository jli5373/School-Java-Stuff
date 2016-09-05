

public class Diamond implements Comparable<Diamond>
{
    private String stockNumber;
    private double caret;
    private String clarity;
    private char color;
    private String cut;
    
    

    public Diamond(String s, double car, String clar, char col, String ct)
    {
        stockNumber = s;
        caret = car;
        clarity = clar;
        color = col;
        cut = ct;
    }

    public String getStock() {return stockNumber;}
    public double getCaret() {return caret;}
    public String getClarity() {return clarity;}
    public char getColor() {return color;}
    public String getCut() {return cut;}
    
    public String toString()
    {
        return getStock() + " " + getCaret() + " " + getClarity() + " " + getColor() + " " + getCut();
    }
    
    public int getClarityGrade() {
        if(getClarity().equals("FL")) {
            return 1;
        }
        if(getClarity().equals("IF")) {
            return 2;
        }
        if(getClarity().equals("VVS1")) {
            return 3;
        }
        if(getClarity().equals("VVS2")) {
            return 4;
        }
        if(getClarity().equals("VS1")) {
            return 5;
        }
        if(getClarity().equals("VS2")) {
            return 6;
        }
        if(getClarity().equals("SI1")) {
            return 7;
        }
        if(getClarity().equals("SI2")) {
            return 8;
        }
        if(getClarity().equals("I1")) {
            return 9;
        }
        if(getClarity().equals("I2")) {
            return 10;
        }
        if(getClarity().equals("I3")) {
            return 11;
        }
        else return 0;
    }
    
    public int getColorGrade() {
        if(getColor()=='D'||getColor()=='E') {
            return 1;
        }
        if(getColor()=='F'||getColor()=='G') {
            return 2;
        }
        if(getColor()=='H'||getColor()=='I') {
            return 3;
        }
        if(getColor()=='J'||getColor()=='K') {
            return 4;
        }
        if(getColor()=='L'||getColor()=='M') {
            return 5;
        }
        if(getColor()=='N'||getColor()=='O') {
            return 6;
        }
        if(getColor()=='P'||getColor()=='Q') {
            return 7;
        }
        if(getColor()=='R'||getColor()=='S') {
            return 8;
        }
        if(getColor()=='T'||getColor()=='U') {
            return 9;
        }
        if(getColor()=='V'||getColor()=='W') {
            return 10;
        }
        if(getColor()=='X'||getColor()=='Y') {
            return 11;
        }
        if(getColor()=='Z') {
            return 12;
        }
        else return 0;
        
    }
    
    public int compareTo(Diamond other) {
        int a;
        int b;
        if(getCaret()==other.getCaret()) {
            if(getClarityGrade()<=getColorGrade()) {
                a=getClarityGrade();
            }
            else {a=getColorGrade();}
            if(other.getClarityGrade()<=other.getColorGrade()) {
                b=other.getClarityGrade();
            }
            else {b=other.getColorGrade();}
            return a-b;
        }
        else return (int) ((10*other.getCaret())-(10*getCaret()));
    }
    
}
