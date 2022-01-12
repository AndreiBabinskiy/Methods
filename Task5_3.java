import java.util.Scanner;
import java.util.Random;
import java.util.Date;
class Task5_3 {
    
    //private static final String RESULTS_BASE_DIR = “D:/results”;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int userValue = scanner.nextInt();
        System.out.println("userValue = " + userValue);
       
        int [] userArray = new int[userValue];      
        Random random = new Random();
        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = (random.nextInt(31) - 15);
            System.out.print(" " + userArray[i]);
        }
        System.out.println();
        
        BubbleSort(userArray);       
        Printer(userArray);
        
        InsertionSort(userArray);
        Printer(userArray);
        
    }  
    public static void BubbleSort(int[] userArray) {
        boolean isSorted = false;
        int number;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < userArray.length-1; i++) {
                if(userArray[i] > userArray[i + 1]) {
                    isSorted = false;
                    
                    number = userArray[i];
                    userArray[i] = userArray[i + 1];
                    userArray[i + 1] = number;
                }
               
            }
        }       
    }
    
    public static void Printer(int[] userArray) {          
        for (int i = 0; i < userArray.length; i++){    
            System.out.print(userArray[i] + " ");   
            
        }
        System.out.println();         
        System.out.println("----End array output----");
    }
    
    public static void InsertionSort (int[] userArray) {
        for (int i = 0; i < userArray.length; i++) {
            int value = userArray[i];
            int j = i - 1;
            while(j >=0 && value < userArray[j]) {
                userArray[j + 1] = userArray[j];
                j--;
            }
            userArray[j + 1] = value;
        }
    }
    
    public void shellSort(int[] userArray) {
       int temp;
       int h = 0;//величина интервала
       
       //вычисляем исходное значение интервала
       while(h <= userArray.length/3)
           h = 3*h + 1;
       
       for(int k = h; k > 0; k = (k-1)/3)
           for(int i = k; i < userArray.length; i++)
           {
               temp = userArray[i];
               int j;
               for(j = i; j >= k; j -= k)
               {
                   if(temp < userArray[j - k])
                       userArray[j] = userArray[j - k];
                   else
                       break;
               }
              userArray[j] = temp;
           }
   
    
}