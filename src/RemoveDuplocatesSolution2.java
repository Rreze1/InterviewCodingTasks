import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplocatesSolution2 {
    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCCDDDEEFF"));
    }
    public static String removeDup(String str) {

        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();

        str = str.replace(", " ,  "" ).replace("[","").replace("]","");

        return  str;

    }
}
