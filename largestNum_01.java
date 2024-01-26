import java.util.*;
public class largestNum_01 {

    public static int getLargest(int[]numbers){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }

        for(int i=0;i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest value in Array is : "+ smallest);
        return largest;
    }


    public static void main(String[] args) {
        int[] numbers={10,20,60,40,50,67};
        System.out.println("Largest Value in array is : " +getLargest(numbers));
    }
}
