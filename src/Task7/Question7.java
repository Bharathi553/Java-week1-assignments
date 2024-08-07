package Task7;

import java.util.Scanner;

public class Question7 {
    public static void printPermutations(String str){
        char[] chars=str.toCharArray();
        permute(chars,0);
    }
    public static void permute(char[] chars, int index){
        if(index==chars.length){
            System.out.println(new String(chars));
            return;
        }
        for(int i=index;i<chars.length;i++){
            swap(chars,index,i);
            permute(chars,index+1);
            swap(chars, index,i);
        }
    }
    public static void swap(char[] chars, int i,int j){
        char temp=chars[i];
        chars[i]=chars[j];
        chars[j]=temp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        System.out.println("Permutation of given string is: ");
        printPermutations(str);
    }
}
