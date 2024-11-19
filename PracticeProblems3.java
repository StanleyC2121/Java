public class PracticeProblems3 {
    public static double sumGrid(double[][] grid) {
        double sum = 0;
        for (double[] row : grid) {         
            for (double value : row) {      
                sum += value;               
            }
        }    
        return sum; 
    }
    public static void main(String[] args) {
        double[][] grid = {
            {1, 2, 3},
            {1, 2, 3},
            {1, 2, 3}
        };
        double result = sumGrid(grid);
        System.out.println("Sum is " + result);
    }
}

