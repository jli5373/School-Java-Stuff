import java.util.*;

public class stringzz
{

    public static void main(System[]args) {
       System.out.println("");
       Scanner scan = new Scanner(System.in);
       String str = scan.nextLine();
       int k = 0;
       String sub = "";
       for(int i=0; i<str.length(); i++) {
          if(str.charAt(i)>='A' && str.charAt(i)<='z') {
            if(k%2==0){
                sub = sub + Character.toUpperCase(str.charAt(i));
                k++;
               }
               else {
                   sub = sub + Character.toLowerCase(str.charAt(i));
                   k++;
                }
            }
           else {
            sub = sub + str.charAt(i);
           }

   
    
        }
       System.out.println(sub);
    }
}
