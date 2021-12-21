import java.util.*;

public class SortMapByValues {
    public static void main(String[] args) {

        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1,"Hello");
        hashmap.put(2,"Airplane");
        hashmap.put(3, "Gjoka");
        System.out.println(sortMap(hashmap));

        System.out.println(uniqueChars("accabbcd"));

    }
    public static Map sortMap(Map map){



        ArrayList<Object> array=new ArrayList<>(map.keySet());


        TreeMap<Object, Object> result1=new TreeMap();
        for (int i = 0; i < array.size(); i++) {

            result1.put(map.get(array.get(i)), array.get(i));

            // e kom abstraktu, e ka perdor interfacin kryesor t mapit, edhe mundem me perdor tulifar map
//i kom marr krejt vlerat e mapit edhe i kom qit ne ni arraylist
            //kom iteru neper krejt elementet
            //edhepse puti e ka kay edhe value une e kom invertu e n format t key e kom paraqit value edhe mandej
            //vjen key, kshtuqe i sorton nbaze te value.

        }


        return result1;

    }
    public static String uniqueChars (String str){
        List<String> arr = new ArrayList<>();

        for (int i =0; i<str.length();i++)
            arr.add("" + str.charAt(i));

        LinkedHashSet<String> result = new LinkedHashSet<>(arr);// it cares for the insertion order as well (lifo)


        return result.toString();



    }
}

