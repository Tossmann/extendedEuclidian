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

		aValues.add(a);
		bValues.add(b);

		BigInteger uc = new BigInteger("1");
		BigInteger vc = new BigInteger("0");
		BigInteger ud = new BigInteger("0");
		BigInteger vd = new BigInteger("1");
		
		BigInteger c = a;
		System.out.println(c);
		BigInteger d = b;
		
		BigInteger q;
		
		while(c.intValue() != 0){
			q = d.divide(c);
			
			BigInteger tempCopyC = c;
			c = d.subtract(q.multiply(c));
			d = tempCopyC;

			
			BigInteger tempCopyUC = uc;
			BigInteger tempCopyVC = vc;
			uc = ud.subtract(q.multiply(uc));
			vc = vd.subtract(q.multiply(vc));
			ud = tempCopyUC;
			vd = tempCopyVC;		
			
			//aValues.add(b);
			//BigInteger tempCopy = a;
			//a = b;
			//b = tempCopy.mod(b);
			//bValues.add(b);
			//something
		}
		System.out.println("Der ggT lautet: " + d + " u: " + ud + " v: "+ vd);
	}


}