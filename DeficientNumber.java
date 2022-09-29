// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class deficientNumber {
    static int Deficient(int n){
        int sum=0;
        for(int i =1 ; i<=(Math.sqrt(n));i++){
            if(n%i==0){
                
                        if(n/i==i){
                sum = sum + 1;
            }else{
                sum = sum + i;
                sum = sum + (n/i);
            }
            
        }
        }
    
    return sum;
}
    
    
    
  static boolean isDef(int n)   
    {   
   return (Deficient(n) < (2 * n));   
    }   
    
   public static void main(String args[])   
    {   
       System.out.println("Enter the number?");  
       Scanner sc = new Scanner(System.in);   
       int n = sc.nextInt();  
       if (isDef(n))   
          System.out.println("The number is deficient.");   
       else  
           System.out.println("The number is not deficient");    
    }   
}  