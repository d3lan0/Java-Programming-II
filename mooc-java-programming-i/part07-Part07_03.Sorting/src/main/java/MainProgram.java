
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {-1, 3, 1, 2};
        sort(array);
        
    }
    
    public static void sort(int[] array){
        int startIndex = 0;
        while(startIndex < array.length -1){
            int smallest = indexOfSmallestFrom(array, startIndex);
            swap(array, smallest, startIndex);
            startIndex++;
        }
        
        System.out.println(Arrays.toString(array));
        
    }
    
    public static int smallest(int[] array){
        int small = array[0];
        for(int i = 0; i < array.length; i++){
            
            if(array[i] < small){
                small = array[i];
            }
            
        }
        
        return small;
    }
    
    public static int indexOfSmallest(int[] array){
        int small = array[0];
        int index = 0;
        for(int i = 0; i < array.length; i++){
            
            if(array[i] < small){
                small = array[i];
                index = i;
            }
            
        }
        
        return index;
        
    }
    
    public static int indexOfSmallestFrom(int[]table, int startIndex){
        int small = table[startIndex];
        int index = startIndex;
        
        for(int i = startIndex; i < table.length; i++){
            
            if(table[i] < small){
                small = table[i];
                index = i;
            }
            
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int valueAtIndex1 = array[index1];
        int valueAtIndex2 = array[index2];
        array[index1] = valueAtIndex2;
        array[index2] = valueAtIndex1;
    }

}
