package src;
import java.awt.List;
import java.math.BigInteger;
import java.util.ArrayList;

public class Main {	
	public static void main(String [] args){	
		if(args.length > 1){
			BigInteger a = new BigInteger(args[0]);
			BigInteger b = new BigInteger(args[1]);
			// System.out.println("the gcd is: " + a.gcd(b));

			if(a.compareTo(b) == 1) 
			{
				ggT(a,b);
			}
			if(a.compareTo(b) == -1)
			{
				ggT(b,a);
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

	public static void ggT(BigInteger a, BigInteger b)
	{
		ArrayList<BigInteger> aValues = new ArrayList<BigInteger>();
		ArrayList<BigInteger> bValues = new ArrayList<BigInteger>();
		ArrayList<Integer> q = new ArrayList<>();

		aValues.add(a);
		bValues.add(b);

		while(b.intValue() != 0){
			q.add(a.divide(b).intValue());
			aValues.add(b);
			BigInteger tempCopy = a;
			a = b;
			b = tempCopy.mod(b);
			bValues.add(b);
		}
		
		System.out.println("Der ggT lautet: " + a.toString());
		System.out.println(b);
		System.out.println(a);
		System.out.println(aValues);
		System.out.println(bValues);
	}


}
