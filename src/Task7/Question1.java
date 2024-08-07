package Task7;

import java.util.Scanner;

public class Question1 {
    public static char findFirstNonRepeatedCharacter(String str){
       int[] charCount=new int[256];
       for(char c: str.toCharArray()){
           charCount[c]++;
       }
       for(char c: str.toCharArray()){
           if(charCount[c]==1){
               return c;
           }
       }
       return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        char result= findFirstNonRepeatedCharacter(str);
        if(result!=0){
            System.out.println("The First Non Repeative Character in the given string: "+result);
        }
        else {
            System.out.println("No such character is found!");
        }
    }
}
