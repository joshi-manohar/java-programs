public class Multicatch{
   public static void main(String[] args) {
       int a= 10, b= 0;
       try {
           int ans = a/b;
           System.out.println("Answer: " + ans);
           } 
	   catch (ArithmeticException e)
	     {
           System.out.println("Error: cannot divide a number by zero!");
             }
	   catch(ArrayIndexOutOfBoundsException e)
	      {
	    System.out.println("Error: given index in array is out from bounds");
	      }
	
  }
   
}