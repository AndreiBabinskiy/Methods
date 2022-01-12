import java.util.Scanner;


public class ArrayUtils {
    
    public static int MaxNumber(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {    
            if (array[i] > max) {
                max = array[i];      
            }
        }
        return max;
    }

    public static int MaxIndex(int[] array) {
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {    
            if (array[i] == maxIndex) {
                maxIndex = i;      
            }
        }
        return maxIndex;
    }
    
    public static int Min(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {    
            if (array[i] < min) {
                min = array[i];      
            }
        }
        return min;
    }
    
    public static int MinIndex(int[] array) {
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {    
            if (array[i] == minIndex) {
                minIndex = i;      
            }
        }
        return minIndex;
    }
    
    public static int Sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {    
            sum = sum + array[i];
        }
        return sum;
    }
    
    public static int Multi(int[] array) {
        int multi = 1;
        for (int i = 0; i < array.length; i++) {    
            multi = multi * array[i];
        } 
        return multi;
    }
    
    public static int EvenSum(int[] array) {
        int evenSum = 0;
        for (int i = 0; i < array.length; i++) {    
            if (array[i] % 2 == 0) {
                evenSum = evenSum + array[i];      
            }
        }
        return evenSum;
    }
    
    public static int NotEvenSum(int[] array) {
    int notEvenSum = 0; 
        for (int i = 0; i < array.length; i++) {    
            if (array[i] % 2 != 0) {
                notEvenSum = notEvenSum + array[i];      
            }
        }
        return notEvenSum;
    }
    
    
    public static void findIndexOfNumber(int[] array) {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter index number you want to know: ");
        
        int userNumber = scanner.nextInt(); 
        
        int firstUserNumber = -1;
        for (int i = 0; i < array.length; i++) {    
            if (array[i] == userNumber) {
                firstUserNumber = i;
                break;
            }
        }
        
        int lastUserNumber = -1;
        for (int i = array.length - 1; i >= 0; i--) {    
            if (array[i] == userNumber) {
                lastUserNumber = i;
                break;
            } 
        }
        
        System.out.println("First index of chosen nubmer is " + firstUserNumber);
        System.out.println("Last index of chosen nubmer is " + lastUserNumber);
    }        
    
}