import static org.junit.Assert.*;
import org.junit.Test;

/**
 * DESCRIBE TEST SUITE
 * @author AUTHOR NAMES
 */
public class Week8LabTest {
   /**
    * DESCRIBE TEST
    */
   @Test
   public void isPalindromeTest( ) {
      Week8Lab Week8Lab = new Week8Lab();
      String s = "race car";
      boolean expected = true;
      if (expected != Week8Lab.isPalindrome(s)){
         fail();
      }
   }

   /**
    * DESCRIBE TEST
    */
   @Test
   public void maxValueTest( ) {
      Week8Lab Week8Lab = new Week8Lab();
      Integer[] a = new Integer[]{2, 16, 8, 4};
      int max = 16;
      if (max != Week8Lab.maxValue(a) ){
         fail();
      }
   }

   /**
    * Testing base case n=0 for fibonacci sequence
    * Expecting result fib(0) = 0
    */
   @Test
   public void fibTest0( ) {
      Week8Lab Week8Lab = new Week8Lab();
      long n = 0;
      long expected = 0; // base case
      long result = Week8Lab.fib( n );
      if ( result != expected ) {
         fail( String.format( "FAILURE: fib(%d) returned %d, expected %d.", n, result, expected ));
      }
   }

   /**
    * Testing base case n=1 for fibonacci sequence
    * Expecting result fib(1) = 1
    */
   @Test
   public void fibTest1( ) {
      Week8Lab Week8Lab = new Week8Lab();
      long n = 1;
      long expected = 1; // base case
      long result = Week8Lab.fib( n );
      if ( result != expected ) {
         fail( String.format( "FAILURE: fib(%d) returned %d, expected %d.", n, result, expected ));
      }
   }

   /**
    * Testing case n=-1 for fibonacci sequence
    * Expecting result fib(-1) = 1
    */
   @Test
   public void fibTestneg1( ) {
      Week8Lab Week8Lab = new Week8Lab();
      long n = -1;
      long expected = 1; // base case
      long result = Week8Lab.fib( n );
      if ( result != expected ) {
         fail( String.format( "FAILURE: fib(%d) returned %d, expected %d.", n, result, expected ));
      }
   }

   /**
    * Testing case n=2 for fibonacci sequence
    * Expecting result fib(2) = 1
    */
   @Test
   public void fibTest2( ) {
      Week8Lab Week8Lab = new Week8Lab();
      long n = 2;
      long expected = 1; // base case
      long result = Week8Lab.fib( n );
      if ( result != expected ) {
         fail( String.format( "FAILURE: fib(%d) returned %d, expected %d.", n, result, expected ));
      }
   }

   /**
    * Testing case n=-2 for fibonacci sequence
    * Expecting result fib(-2) = -1
    */
   @Test
   public void fibTestneg2( ) {
      Week8Lab Week8Lab = new Week8Lab();
      long n = -2;
      long expected = -1; // base case
      long result = Week8Lab.fib( n );
      if ( result != expected ) {
         fail( String.format( "FAILURE: fib(%d) returned %d, expected %d.", n, result, expected ));
      }
   }

   /**
    * Testing case n=3 for fibonacci sequence
    * Expecting result fib(3) = 2
    */
   @Test
   public void fibTest3( ) {
      Week8Lab Week8Lab = new Week8Lab();
      long n = 3;
      long expected = 2; // base case
      long result = Week8Lab.fib( n );
      if ( result != expected ) {
         fail( String.format( "FAILURE: fib(%d) returned %d, expected %d.", n, result, expected ));
      }
   }

   /**
    * Testing case n=-3 for fibonacci sequence
    * Expecting result fib(-3) = 2
    */
   @Test
   public void fibTestneg3( ) {
      Week8Lab Week8Lab = new Week8Lab();
      long n = -3;
      long expected = 2; // base case
      long result = Week8Lab.fib( n );
      if ( result != expected ) {
         fail( String.format( "FAILURE: fib(%d) returned %d, expected %d.", n, result, expected ));
      }
   }

   /**
    * Testing case n=4 for fibonacci sequence
    * Expecting result fib(4) = 3
    */
   @Test
   public void fibTest4( ) {
      Week8Lab Week8Lab = new Week8Lab();
      long n = 4;
      long expected = 3; // base case
      long result = Week8Lab.fib( n );
      if ( result != expected ) {
         fail( String.format( "FAILURE: fib(%d) returned %d, expected %d.", n, result, expected ));
      }
   }

   /**
    * Testing case n=-4 for fibonacci sequence
    * Expecting result fib(-4) = -3
    */
   @Test
   public void fibTestneg4( ) {
      Week8Lab Week8Lab = new Week8Lab();
      long n = -4;
      long expected = -3; // base case
      long result = Week8Lab.fib( n );
      if ( result != expected ) {
         fail( String.format( "FAILURE: fib(%d) returned %d, expected %d.", n, result, expected ));
      }
   }

} // END OF CLASS Lab13Test