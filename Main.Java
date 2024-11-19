public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
public class Main {
	public static void main(String[] args) {
		int x = 6;
		System.out.println(x + 4);
		System.out.println(x);
		System.out.println(x % 2 == 0);
	}
}
public class Main {
	static int x = 6;
	
	public static void main(String[] args) {
		System.out.println("x: " + x);
		// reassigning the value of x to be the old x plus 4
		x = x + 4;
		System.out.println("new x: " + x);
	}
	public class Main {
		static double[] arr = {4.5, 6, 9.0, 8};
		
		public static void main(String[] args) {
			// to find the length of an array, use array.length
			System.out.println(arr.length);
		}
	}
		static String intArrToString(int[] arr) {
		String str = "(";
		for (int i = 0; i < arr.length; i++) {
			str += arr[i];
			if (i != arr.length - 1) {
				str += ", ";
			}
		}
		return str + ")";
	}


