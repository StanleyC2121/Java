
    public class  PracticeProblems {
        //problem 1
        public static int countOccurrences(int[] arr, int n) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == n) {
                    count++;
                }
            }
            return count;
        }
        public static void main(String[] args) {
        int[] arr = {1, 3, 3, 4, 3, 9, 10};
        System.out.println(PracticeProblems.countOccurrences(arr, 3));
    }

}  
    
     
    

    
