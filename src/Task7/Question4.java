package Task7;

import java.util.Scanner;

public class Question4 {
    public static int findNoOfWordsInString(String str){
        if(str==null || str.isEmpty()){
            return 0;
        }
        String[] result=str.trim().split("\\s+");
        return result.length;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        int noOfWords=findNoOfWordsInString(str);
        System.out.println("No of words in given string is: "+noOfWords );
    }
}
