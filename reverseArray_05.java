public class reverseArray_05 {
    public static void reverseArray(int[] numbers){
        int start=0,end=numbers.length-1;

        while (start< end) {
            //Swapping a array using temp variable
            int temp=numbers[end];
            numbers[end]=numbers[start];
            numbers[start]=temp;

            start++;
            end--;
        }
    }
public static void main(String[] args) {
    int[] numbers={1,2,3,4,5,6,7};

    reverseArray(numbers);
    System.out.println("Reversed Array is -: ");
    //Printing an array
    // As java follows call by reference, if any changes made to array which is presnet in function then those changes in reflect in original array.
    for(int i=0;i<numbers.length;i++){
        System.out.print(numbers[i]+" ");
    }
    System.out.println();

}    
}
//Time Complexity is O(n)
//Space Complexity is O(1)-: Without taking any extra space arary is swapped.