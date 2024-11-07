//Logical operators return a true or false value based on the state of the variables. The result is always a Boolean data type.

// LOGICAL AND - Value returned is true when both given conditions are true.

// LOGICAL OR - Value returned is true when at least one given condition is true.

// LOGICAL NOT - Has the power to reverse the overall result. For example, if the value returned is true, it gives out false.

public class LogicalOperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean x = true;
	       boolean y = false;
	       System.out.println("x & y : " + (x & y));
	       System.out.println("x && y : " + (x && y));
	       System.out.println("x | y : " + (x | y));
	       System.out.println("x || y: " + (x || y));
	       System.out.println("x ^ y : " + (x ^ y));
	       System.out.println("!x : " + (!x));

	}

}
