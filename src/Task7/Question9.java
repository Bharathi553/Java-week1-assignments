package Task7;

import java.util.Scanner;

public class Question9 {
    public static void printCombinations(String str){

        generateCombinations(str,"",0);
    }
    public static void generateCombinations(String str,String prefix, int index){
        if(index==str.length()){
            if(!prefix.isEmpty()){
                System.out.println(prefix);
            }
            return;
        }
        generateCombinations(str, prefix+str.charAt(index),index+1);
        generateCombinations(str, prefix,index+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        System.out.println("Combinations of given string is: ");
        printCombinations(str);
    }
}
