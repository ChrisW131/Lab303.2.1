//(=) - x=y
//(+=) - x+=y = x=x+y
//(-=) - x-=y = x=x-y
//(*=) - x*=y = x=x*y
//(/=) - x/=y = x=x/y
//(%=) - x%=y = x=x%y
//Java Assignment Operators are used for modifying a value, performing some mathematical calculations, and assigning values to the operands.


//If the value already exists in the variable, it is overwritten by the assignment operator (=).


public class AssignmentOperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int j, k;
		   j = 10; // j gets the value 10.
		   j = 5; // j gets the value 5. The previous value is overwritten.
		   k = j; // k gets the value 5.
		   System.out.println("j is : " + j);
		   System.out.println("k is : " + k);

		       //              Multiple Assignments
		   k = j = 10; // (k = (j = 10))
		   System.out.println("j is : " + j);
		   System.out.println("k is : " + k);

	}

}
