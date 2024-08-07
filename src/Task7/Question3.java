package Task7;

import java.util.HashSet;
import java.util.Scanner;

public class Question3 {
    public static boolean hasAllUniqueCharacters(String str){
       HashSet<Character> charSet=new HashSet<>();
       
       for(int i=0;i<str.length();i++){
           char c=str.charAt(i);
           if(charSet.contains(c)){
               return false;
           }
           charSet.add(c);
           
       }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        boolean isUnique=hasAllUniqueCharacters(str);
        if(isUnique){
            System.out.println("The given string has all unique characters");
        }
        else{
            System.out.println("The given string is don't have all unique characters");
        }
    }
}
