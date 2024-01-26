//Sub array-: Continous Part of array

public class sumofSubArrays_08 {
    public static void printSumofSubArrays(int[] numbers){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            currSum=0;
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                   currSum+=numbers[i];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
               
            }
            
        }
        System.out.println("Max sum of Sub Array is : "+maxSum);
    }
    public static void main(String[] args) {
        int[] numbers={2,4};

        printSumofSubArrays(numbers);

    }
}
//for n number
//n(n+1)/2;