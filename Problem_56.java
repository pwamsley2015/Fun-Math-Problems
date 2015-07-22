import java.math.BigInteger;

public class Problem_56 {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis(); 

		int digitSum = 0, max = 0; 

		BigInteger c; //c = a^b

		for (BigInteger a = new BigInteger("0"); a.compareTo(new BigInteger("100")) == -1; a = new BigInteger((a.add(new BigInteger("1"))).toString())) {
			for (int b = 0; b < 100; b++) {
				c = a.pow(b); 
				digitSum = findDigitSum(new BigInteger(c.toString())); 
				if (digitSum >= max)
					max = digitSum; 
			}
		}
		System.out.println("Answer is: " + max + "\nCalculated in: " + ((System.currentTimeMillis() - startTime)) + " miliseconds");
	}
	public static int findDigitSum(BigInteger n) {
		String numb = n.toString();

		char[] digits = numb.toCharArray(); //char[] > .subString()

		int digitSum = 0, digit; 

		for (char digitChar : digits) {

			digit = Integer.parseInt(String.valueOf(digitChar)); 
			digitSum += digit; 
		}
		return digitSum; 
	}
}
