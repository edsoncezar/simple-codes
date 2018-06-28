package simple.codes.br;

/**
 * 
 * @author edson
 *
 */
public class Fibonacci {

	public int fibonacciIterative(int n) {
		if (n <= 1) {
			return n;
		}
		int fib = 1;
		int prevFib = 1;

		for (int i = 2; i < n; i++) {
			int temp = fib;
			fib += prevFib;
			prevFib = temp;
		}
		return fib;
	}

	public int fibonacciRecursive(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}

	public int fibonacciDe(int n) {

		if (n <= 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

		return fibonacciDe(n - 1) + fibonacciDe(n - 2);
	}

	public static void main(String args[]) {
		Fibonacci fib = new Fibonacci();

		System.out.println("Iterative version:");
		System.out.println(fib.fibonacciIterative(5));

		System.out.println("Recursive version:");
		System.out.println(fib.fibonacciRecursive(5));

		System.out.println("Recursive traditional version:");
		System.out.print("Traditional " + new Fibonacci().fibonacciDe(5));

	}
}