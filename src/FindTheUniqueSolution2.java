import java.util.Arrays;
import java.util.Collections;

public class FindTheUniqueSolution2 {
    public static void main(String[] args) {
        System.out.println(Unique("AAABBBCCCDEF"));
    }
    public static String Unique(String str) {

        String result ="";

        for(String each : str.split(""))

            result +=(  (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";



        return result;

    }
}
