public class PracticeProblems {
    public static int nextFib(int n) {
        if (n == 0) {
            return 1;  
        } else if (n == 1) {
            return 1;  
        }
        int a = 0, b = 1; 
        for (int i = 2; i <= n; i++) {
            int temp = a + b; 
            a = b;              
            b = temp;           
        }
        return a + b; 
    }
    public static void main(String[] args) {
        int n = 1;
        System.out.println("After (" + n + ") is: " + nextFib(n));
    }
}