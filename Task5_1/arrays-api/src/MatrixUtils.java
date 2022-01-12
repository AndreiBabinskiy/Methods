public class MatrixUtils {
    
    public static int FindMaxNumber (int [][] multiArray) {   
            int maxNumber = 0;  
            for (int i = 0; i < multiArray.length; i++) {
                for (int j = 0; j < multiArray[i].length; j++) {
                    if (multiArray[i][j] > maxNumber) {
                        maxNumber = multiArray[i][j];  
                    }
                }
            }
            return maxNumber;
        }
        
    public static int FindMaxNumbersLineIndex(int [][] multiArray) { 
        int maxNumber = 0; 
        int maxLineIndex = 0;
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                if (multiArray[i][j] > maxNumber) {
                    maxNumber = multiArray[i][j];  
                    maxLineIndex = i;
                }
            }
        }
        return maxLineIndex;
    }

    public static int FindMaxNumbersColimnIndex(int [][] multiArray) { 
        int maxNumber = 0; 
        int maxColumnIndex = 0; 
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                if (multiArray[i][j] > maxNumber) {
                    maxNumber = multiArray[i][j];  
                    maxColumnIndex = j;
                }
            }
        }
        return maxColumnIndex;
    }
    

    public static void SumOfLines(int [][] multiArray) { 
    
        int lineSum =0;
        int [] line = new int [multiArray[0].length];
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                line[j] = multiArray[i][j];
                lineSum = lineSum + line[j];
            }
          
            System.out.print("\n" + "Sum of line  " + i + " = " + lineSum);
            lineSum = 0;
        }   
    }
    
    public static void MultiOfColums(int [][] multiArray) {
        int columnMulti = 1;
        int [] column = new int [multiArray.length];
        for (int i = 0; i < multiArray[i].length; i++) {  
            for (int j = 0; j < multiArray.length; j++) { 
                column[j] = multiArray[j][i];
                columnMulti = columnMulti * column[j];
            }
            
            System.out.print("\n" + "Multi of column  " + i + " = " + columnMulti);
            columnMulti = 1;
        }
    }
    
    public static void MatrixReverse(int [][] multiArray) {
        int [][] multiArrayReverse = new int [multiArray[0].length][multiArray.length];
        
        for (int i = 0; i < multiArray[i].length; i++) {
            for (int j = 0; j < multiArray.length; j++) {
                multiArrayReverse[i][j] = multiArray[j][i];
            }
        }
        
        System.out.println("Array reverse: ");
        
        for (int i = 0; i < multiArrayReverse.length; i++) {
            System.out.println();
            for (int j = 0; j < multiArrayReverse[i].length; j++) {
                System.out.print(multiArrayReverse[i][j]+" ");
            }
        }
    }
    
    public static void OnlyEvenMatrix(int [][] multiArray) {
        int [][] arrayEven = new int [multiArray.length][];  
        
        int evenIndex = 0;
        
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                if (multiArray[i][j] % 2 == 0 && multiArray[i][j] != 0) {
                    evenIndex++;
                }
            }
            arrayEven[i] = new int [evenIndex];
            evenIndex = 0;
        }
        
        for (int i = 0; i < multiArray.length; i++) {
            
            int v = 0;
           
            for (int j = 0; j < multiArray[i].length; j++) {
                if (multiArray[i][j] % 2 == 0 && multiArray[i][j] != 0) {
                    arrayEven[i][v] = multiArray[i][j];
                    v++;
                }
            }
        }
        
        System.out.println("Arrays even numbers only: ");
        for (int i = 0; i < arrayEven.length; i++) {
            System.out.println();
            for (int j = 0; j < arrayEven[i].length; j++) {
                System.out.print(arrayEven[i][j]+" ");
            }
        }
    }
}