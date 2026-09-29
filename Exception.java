public class Exception {
   public static void main(String[] args) {
       int a= 10, b= 0;
       try {
           int ans = a/b;
           System.out.println("Answer: " + ans);
           } catch (ArithmeticException e)
	   {
           System.out.println("Error: cannot divide a number by zero!");
           }
	try{
	    int c[]={10,20,30};
	    System.out.println("value at index 4:"+c[4]);
	   }catch(ArrayIndexOutOfBoundsException e)
	      {
	    System.out.println(e);
	      }
	
  }
   
}
