package Task7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question6 {
    public static Map<Character, Integer> countCharacterOccurrences(String str){
        Map<Character, Integer> charCountMap=new HashMap<>();

        for(char c : str.toCharArray()){
              if(charCountMap.containsKey(c)){
                  charCountMap.put(c, charCountMap.get(c)+1);
              }
              else {
                  charCountMap.put(c,1);
              }
        }
        return charCountMap;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        Map<Character,Integer> charCountMap=countCharacterOccurrences(str);

        for(Map.Entry<Character, Integer> entry: charCountMap.entrySet()){
            System.out.println("Character: "+ entry.getKey()+" occurs: "+ entry.getValue());
        }
    }
}
