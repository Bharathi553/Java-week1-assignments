package Task7;

import java.util.*;

public class Question10 {
    public static void sortHashMapByKeys(HashMap<String,Integer> hashMap){
        TreeMap<String,Integer> sortedMap=new TreeMap<>(hashMap);

        System.out.println("Sorted HashMap by using Keys:");
        for(Map.Entry<String,Integer> entry: sortedMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

    public static void sortHashMapByValues(HashMap<String,Integer> hashMap){
        List<Map.Entry<String,Integer>> list=new ArrayList<>(hashMap.entrySet());
        list.sort(Map.Entry.comparingByValue());

        LinkedHashMap<String, Integer> sortedMap= new LinkedHashMap<>();

        for(Map.Entry<String,Integer> entry:list){
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Sorted Hashmap by using values: ");
        for(Map.Entry<String,Integer> entry:sortedMap.entrySet()){
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
    }

    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();

        hashMap.put("apple",5);
        hashMap.put("orange",2);
        hashMap.put("banana",10);
        hashMap.put("grape",3);
        sortHashMapByKeys(hashMap);
        sortHashMapByValues(hashMap);
    }
}
