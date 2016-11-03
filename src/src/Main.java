package src;
import java.awt.List;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static int firstPrime = 17;
	static int secondPrime = 23;
	static int firstInteger = 2;
	static int secondInteger = 3;
	static BigInteger firstPrimeNumber = BigInteger.valueOf(firstPrime);
	static BigInteger secondPrimeNumber = BigInteger.valueOf(secondPrime);
	static BigInteger firstIntegerNumber = BigInteger.valueOf(firstInteger);
	static BigInteger secondIntegerNumber = BigInteger.valueOf(secondInteger);
	
	static BigInteger uNumber;
	static BigInteger vNumber;
	
	private static void printInputValues() {
		System.out.println("First Prime Number is " + firstPrimeNumber + " and the second one ist " + secondPrimeNumber);
		System.out.println("First Integer Number is " + firstIntegerNumber + " and the second one ist " + secondIntegerNumber);
	}
	
	public static void main(String[] args) {
		comparePrimeNumbers();
		printInputValues();
		calculateExtendedEuclidianAlgorithm();
		calculateNewMysterioseNumber();
	}
	
	public static void comparePrimeNumbers () {
			if(firstPrimeNumber.compareTo(secondPrimeNumber) == -1) {
				BigInteger tempCopy = firstPrimeNumber;
				firstPrimeNumber = secondPrimeNumber;
				secondPrimeNumber = tempCopy;
			}
	}
	
	public static void calculateExtendedEuclidianAlgorithm() {
		BigInteger uc = new BigInteger("1");
		BigInteger vc = new BigInteger("0");
		BigInteger ud = new BigInteger("0");
		BigInteger vd = new BigInteger("1");
		
		BigInteger c = firstPrimeNumber;
		BigInteger d = secondPrimeNumber;
		
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
		}
		
		uNumber = ud;
		vNumber = vd;
		
		
		System.out.println("The result of the extended Euclidian Algorithm is : ");
		System.out.print(d + " = " + ud +" * "+ firstPrimeNumber + " + " + vd + " * " + secondPrimeNumber);
		System.out.println();
		System.out.println("The greatest common divisor is " + d);
		System.out.println("The parameter 'u' is " + ud);
		System.out.println("The parameter 'v' is " + vd);
	}

	public static void calculateNewMysterioseNumber() {
		BigInteger y = ((firstIntegerNumber.subtract(secondIntegerNumber)).multiply(uNumber)).subtract(secondPrimeNumber);
		BigInteger x = (y.multiply(firstPrimeNumber)).add(secondIntegerNumber);
		
		System.out.println();
		System.out.println("Calculation of new Prime Number:");
		System.out.println("First Step: 'Z' = " + uNumber);
		System.out.println("Second Step: 'Y' = " + y);
		System.out.println("Third Step: 'X' = " + x);
		System.out.println("The new calculated Prime Number is: " + x.abs());
	}


}