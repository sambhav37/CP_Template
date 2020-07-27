
import java.util.*;
import java.util.List; 
import java.util.ArrayList; 
import java.util.Collections; 

public class Temp{  
 
        public static void main(String[] args){

          
         
     }




     public static long pow(long a , long b){
            long ans = 1 ;
            while(b>0){
                if((b&1)==1)
                    ans *= a ;
                a *= a ;
                b = b >> 1 ;
            }
            return ans ;

        }

  }  


