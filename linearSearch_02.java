import java.util.Scanner;

public class linearSearch_02 {

    public static int linearsearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
        int[] arr={10,20,30,40,50,60,70};
        System.out.println("Enter the key value");
        int key=sc.nextInt();
        int index=linearsearch(arr, key);
        if(index==-1){
            System.out.println("Key not found");
        }else{
            System.out.println("Key Found at index : " +index );

        }
    }
}
//Time complexity for linear search is O(n)