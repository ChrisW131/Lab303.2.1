//Unary Operators only need a single operand, and they are used to increment, decrement, or eliminate a value.

// INCREMENT OPERATOR - (++)

// DECREMENT OPERATOR - (--)

// UNARY PLUS OPERATOR - (+) - Unary Plus Operator - Presents the positive value.

// UNARY MINUS OPERATOR - (-) - Unary Minus Operator- Normally used for eliminating or negating values.

// LOGICAL NOT OPERATOR - (!) - It is used for inversion of the Boolean value. This operator reverses the value of a Boolean expression. For example, let’s say that a Boolean value is true. If we use the “!” operator with a true expression, it will give us the result as false. It inverses the Boolean value and returns the result.

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = +1;
	       // sum is now 1
	       System.out.println(sum);

	       sum--;
	       // sum is now 0
	       System.out.println(sum);

	       sum++;
	       // sum is now 1
	       System.out.println(sum);

	       sum = -sum;
	       // sum is now -1
	       System.out.println(sum);

	       boolean result = false;
	       // false
	       System.out.println(result);
	       // true
	       System.out.println(!result);


	}

}
