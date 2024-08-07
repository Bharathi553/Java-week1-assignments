package Task4;

import java.util.Arrays;

public class Question7 {
    public static int[] removeDuplicates(int[] array){
       int index=1;
       int countZero=0;

       for(int i=1;i<array.length;i++){
           if(array[i]!=array[i-1]){
               array[index]=array[i];
               index++;
           }
           else{
               countZero++;
           }
        }
       while(countZero>0){
           array[array.length-countZero]=0;
           countZero--;
       }
       return array;

    }
    public static void main(String[] args) {
        int[] array={2,2,3,3,4,4,4,11,11,11,11};
        System.out.println("Input array: "+ Arrays.toString(array));

        int[] result=removeDuplicates(array);

        System.out.println("Output array: "+ Arrays.toString(result));


    }
}
