public class PracticeProblems2 {
    public static int[] reverseArray(int[] arr) {
        int n = arr.length; 
        int[] reversedArr = new int[n]; 
        for (int i = 0; i < n; i++) {
            reversedArr[i] = arr[n - 1 - i]; 
        }
        return reversedArr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; 
        int[] reversed = reverseArray(arr); 
        System.out.print("Reversed Array: ");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }
       
    }
}