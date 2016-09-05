import java.util.*;

public class recurzion1 {
    public int x;
    
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("hi");
        int s = scan.nextInt();
        recurzion1 var = new recurzion1();
          var.logarithm(s);
    }  
     
    public int pyramid(int n) {
     if(n==1)
        return 1;
     else
        return triangle(n) + pyramid(n-1);
    }
        
      public int triangle(int n) {
      if(n==1)
        return 1;
      else
        return n + triangle(n-1);
      }
        
      public int fib(int n) {
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else
            return fib(n-1) + fib(n-2);
        
      }
    
      public int factorial(int n) {
        if(n==1 || n== 0)
            return 1;
        else
            return n * factorial(n-1);
      }
    
      public double euler(int n) {
        if(n==1)
            return 1;
        else
            return n/factorial(n) + euler(n-1);
      }
      
      public int logarithm(int n) {
         if(n<=0)
        	return 0;
        else if(n<1)
            return logarithm(2*n) - 1;
        else  if(n==1)
           return 0;
        else
           return 1 + logarithm(n/2);
      }
      
      public boolean palindrome(String s) {
         s = s.replaceAll(" ", "").toUpperCase();
         if(s.length()==0 || s.length() == 1)
            return true;
         else if(s.charAt(0)==s.charAt(s.length()-1))
                 return palindrome(s.substring(1,s.length()-1));
         return false;
        }
    }