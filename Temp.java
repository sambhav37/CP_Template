
import java.util.*;
import java.util.List; 
import java.util.ArrayList; 
import java.util.Collections; 
import java.math.BigInteger; 

public class Temp{  
 
        public static void main(String[] args){
  
         
     }


 public static boolean checkPrime(long n) { 
        BigInteger b = new BigInteger(String.valueOf(n)); 
        return b.isProbablePrime(1); 
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
 
 public static BigInteger lcm(long a, long b) { 
        BigInteger s = BigInteger.valueOf(a); 
        BigInteger s1 = BigInteger.valueOf(b); 
 
        BigInteger mul = s.multiply(s1); 
        BigInteger gcd = s.gcd(s1); 
  
        // calculate lcm using formula: lcm * gcd = x * y 
        BigInteger lcm = mul.divide(gcd); 
        return lcm; 
    } 

  }  


