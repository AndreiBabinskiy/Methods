import java.util.Random;

public class ArraysTest {
  
    static final int LINE = 4;
    static final int COLUMN = 3;
    
	public static void main(String args[]) {
    
        Random random = new Random();
        
        int[] array = new int[10];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(31) - 15);
            System.out.println(array[i]);
        }
        int max = ArrayUtils.MaxNumber(array);
        int maxIndex = ArrayUtils.MaxIndex(array);
        int min = ArrayUtils.Min(array);
        int minIndex = ArrayUtils.MinIndex(array);
        int sum = ArrayUtils.Sum(array);
        int multi = ArrayUtils.Multi(array);
        int evenSum = ArrayUtils.EvenSum(array);
        int notEvenSum = ArrayUtils.NotEvenSum(array);
        
        
        System.out.println("Max number is " + max);
        System.out.println("Index of max number is " + maxIndex);
        System.out.println("Min number is " + min);
        System.out.println("Index of min number is  " + minIndex);
        System.out.println("Sum of numbers is " + sum);
        System.out.println("multi of numbers is " + multi);
        System.out.println("Sum of even numbers is " + evenSum);
        System.out.println("Sum of not even numbers is " + notEvenSum);
        
        ArrayUtils.findIndexOfNumber(array);
    
        System.out.println("******************************************************");
      
      int [][] multiArray = new int [LINE][COLUMN];
        
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = (random.nextInt(31)-15);
            }
        }
        
        
        
        int maxNumber = MatrixUtils.FindMaxNumber(multiArray);
        int maxLineIndex = MatrixUtils.FindMaxNumbersLineIndex(multiArray);
        int maxColumnIndex = MatrixUtils.FindMaxNumbersColimnIndex(multiArray);
      
        System.out.println("\n");
        System.out.print("Max number " + maxNumber );
        System.out.println("\n");
        System.out.print("Max number's line index " + maxLineIndex);
        System.out.println("\n");
        System.out.print("Max number's column index " + maxColumnIndex  );
        System.out.println("\n");
        
        
        MatrixUtils.SumOfLines(multiArray);
        System.out.println("\n");
        MatrixUtils.MultiOfColums(multiArray);
        System.out.println("\n");
        MatrixUtils.MatrixReverse(multiArray);
        System.out.println("\n");
        MatrixUtils.OnlyEvenMatrix(multiArray);
        System.out.println("\n");
    }
}


    
        