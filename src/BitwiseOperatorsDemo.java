//Java provides Bitwise operators to manipulate the content of variables at the bit level.
//These variables must be of numeric data type (char, short, int, or long). Java provides seven bitwise operators, as shown in the list below:

public class BitwiseOperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x = 58; //111010
	       int y =13; //1101
	       System.out.println("x & y : " + (x & y)); //returns 8 = 1000
	       System.out.println("x | y : " + (x | y)); //63=111111
	       System.out.println("x ^ y : " + (x ^ y)); //55=11011
	       System.out.println("~x : " + (~x));  //-59
	       System.out.println("x << y : " + (x << y));
	       System.out.println("x >> y : " + (x >> y));


	}

}
