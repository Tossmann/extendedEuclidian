package src;
import java.math.BigInteger;

public class Main {	
	public static void main(String [] args){

		if(args.length > 1){


			BigInteger a = new BigInteger(args[0]);
			BigInteger b = new BigInteger(args[1]);

			if(a.compareTo(b) == 1) 
			{
				System.out.println(a + " ist größer als " + b);
			}
			if(a.compareTo(b) == -1)
			{
				System.out.println(b + " ist größer als " + a);
			}
			if(a.compareTo(b) == 0)
			{
				System.out.println("Die eingegebenen Zahlen sind identisch. Der ggT lautet "+ args[0]);
			}
		}
		else
		{
			System.out.println("Bitte starten Sie das Programm neu und übergeben 2 Argumente");
		}
	}
}
