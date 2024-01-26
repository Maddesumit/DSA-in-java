import java.util.Arrays;
import java.util.Scanner;

public class Array_00{
    //Function to change Array Element
    static void change(int[] arr){
        arr[0]=200;
        
    }
public static void main(String[] args) {
    Scanner  sc =new Scanner(System.in);
    // Syntax
    // datatype[] referencevariable= new datatype[sizeofarray];

    // int[] ros=new int[5];
    // //New is a keyword used to create object in java
    // //or
    // int[] ros1={10,20,30,40};
    
    // int[] ros -: Declaration : During compile time -: Stack of Memory
    // new int[5] -: Initilization : During Runtime , when program execulting memory will be Alloted -: Dyamic Meomry Allocation-: Heap of meomory
    // All objects are stored in heap 

    // In array, each element of array is itself an indiviual object-: in heap memory

    // According to java language specificfication, heap meomory is not continous, interally array may not continous sometimes.

    //If no values are added in integer array, then for integers zero will be asigned internally
    //If no values are assigned in string array, then for Strings Null will be asigned internally

    //Null-: Null is a literal in java, which is used to assign to non primitives ,if they dont have value to initialize.
    //Null is a by default value for refernce variables of non primitive data types

    // Array Input 

    // int[] arr= new int[5];

    // for(int i=0;i<arr.length;i++){
    //     System.out.println("Enter "+ i+"th "+" the Array Elements");
    //    arr[i]=sc.nextInt();
    // }
    // System.out.println();
    //METHODS TO DISPLAY ARRAY ELEMENTS -: 3 METHODS
    /*
     * 1)For Loop
     * 2)For Each Loop
     * 3)Arrays.toString Method
     */

    // 1) for(int i=0;i<arr.length;i++){
    //     System.out.println("Displaying "+ i + "th Element of array : "+arr[i]);
    // }

    // 2) For each
    // for (int i : arr) {
    //     System.out.print(i + " " ); //Here i represent element of array 
    // }

    //3) Arrays.toString method()
    // System.out.println(Arrays.toString(arr));

    // String[] names={"Sumit","madde"};
    // System.out.println(Arrays.toString(names));

    //Passing Arrays as agruments for functions 
    int[] arr1={10,20,3,0,40,60};
    change(arr1);
    System.out.println(Arrays.toString(arr1));


}

}