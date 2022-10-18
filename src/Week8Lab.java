import java.util.Arrays;
/**
 * CLASS DESCRIPTION
 * @author AUTHOR NAMES
 */
public class Week8Lab {
   /**
    * DESCRIPTION OF METHOD TRANSFORMATION
    * @param n DESCRIPTION OF PARAMETER
    * @return DESCRIPTION OF RETURN VALUE
    */
   public long fib( long n ) {
      long out = 0;
      if (n < 0) {
         out = (long) (Math.pow(-1, (n + 1)) * fib(-n));
      }
      else if (n == 0){
         out = 0;
      }
      else if (n == 1){
         out = 1;
      }
      else{
         out = (long) (fib(n - 2) + fib(n-1));
      }
      return out;
   }
   
   /**
    * DESCRIPTION OF METHOD TRANSFORMATION
    * @param s DESCRIPTION OF PARAMETER
    * @return DESCRIPTION OF RETURN VALUE
    */
   public boolean isPalindrome( String s ) {
      String newS = s.replaceAll(" ", "");
      if (!((newS.length() - 1 ) < 1)){
         if (newS.charAt(0) == newS.charAt(newS.length() - 1)){
            return isPalindrome(newS.substring(1, newS.length() - 1));
         }
         else return false;
      }
      return true;
   }
   
   /**
    * DESCRIPTION OF METHOD TRANSFORMATION
    * @param a DESCRIPTION OF PARAMETER
    * @return DESCRIPTION OF RETURN VALUE
    */
   public Integer maxValue( Integer[ ] a ) {
      if (a.length == 1){
         return a[0];
      }
      else if (a[0] < a[a.length - 1]){
         a[0] = a[a.length - 1];
      }
      return maxValue(Arrays.copyOf(a, a.length-1));
   }
   
} // END OF CLASS Week7Lab