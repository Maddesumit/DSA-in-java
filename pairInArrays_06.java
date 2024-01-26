//Making possible pairs from given array
public class pairInArrays_06
 {
    public static void printPairs(int[] numbers){
        int totalPairs=0;
        for (int i = 0; i < numbers.length; i++) {
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print(" (" + curr + "," + numbers[j] +") ");
                totalPairs++;
            }
            System.out.println();
        }
        
        System.out.println("Total pairs are : "+ totalPairs);
    }
    public static void main(String[] args) {
        int[] numbers={2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
        printPairs(numbers);
    }
}
// Total pairs formula(Important for Interview )
// for n numbers 
//n(n-1)/2
//Time complexiy-: O(n^2)