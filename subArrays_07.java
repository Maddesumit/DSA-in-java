//Sub array-: Continous Part of array

public class subArrays_07
 {
    public static void printSubArrays(int[] numbers){
        int totalSubarray=0;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k] + " ");
                }
                totalSubarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArrays printed are : " + totalSubarray);
    }
    public static void main(String[] args) {
        int[] numbers={2,4,6,8};

        printSubArrays(numbers);

    }
}
//for n number
//n(n+1)/2;