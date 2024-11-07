// LESS THAN (<) - The value returned will be true if the left-hand side (LHS) is less than the right-hand side (RHS).

// GREATER THAN (>) - The value returned will be true if the left-hand side (LHS) is greater than the right-hand side (RHS).

// EQUAL TO (==) - The value returned will be true if the LHS is equal to the RHS.

// NOT EQUAL TO (!=) - The value returned will be true if the LHS is not equal to the RHS.

// LESS THAN OR EQUAL TO (<=) - The value returned will be true if the LHS is less than or equal to the RHS.

// GREATER THAN OR EQUAL TO (>=) - The value returned will be true if the LHS is greater than or equal to the RHS.

// Binary numeric promotion is applied to the operands of these operators. The evaluation results in a boolean value. Relational operators have a lower precedence than arithmetic operators, but a higher precedence than the assignment operators. The program below demonstrates the different relational operators in Java.

public class RelationalOperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y = 5;
	       System.out.println("x > y : "+(x > y));
	       System.out.println("x < y : "+(x < y));
	       System.out.println("x >= y : "+(x >= y));
	       System.out.println("x <= y : "+(x <= y));
	       System.out.println("x == y : "+(x == y));
	       System.out.println("x != y : "+(x != y));

	       int variable1 = 50, variable2 = 100, variable3 = 50;
	       System.out.println("variable1 = " + variable1);
	       System.out.println("variable2 = " + variable2);
	       System.out.println("variable3 = " + variable3);
	       System.out.println("variable1 == variable2: "
	               + (variable1 == variable2));

	       System.out.println("variable1 == variable3: "
	               + (variable1 == variable3));


	}

}
