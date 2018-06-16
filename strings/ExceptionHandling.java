package strings;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandling
{
	public static void exceptions() throws IOException {
		
		throw new IOException();
	}
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	//int sum = 9 / n;
   // System.out.println(sum);
    //	int a[] = {1,2,3};
        try
        {
            System.out.println("1");
          int sum = 9 / n;
   //         System.out.println(a[4]);
            System.out.println("2");
        } catch(Exception e ) {
        	System.out.println(e.getMessage());
        }
        
        finally {
			System.out.println("4");
		}
    /*    catch(ArithmeticException e)
        {
            System.out.println("3");
        }
        catch(Exception e)
        {
            System.out.println("4");
        }*/
     /*   finally
        {
            System.out.println("5");
        }*/
    }
}