import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharactersSolution3 {
    public static void main(String[] args) {
        System.out.println(frequency("AAABBBCCCDDDEFG"));
    }
    public static String frequency(String str) {

        String nonDup="", result="";

        for(int i=0; i < str.length(); i++)

            if(! nonDup.contains(""+str.charAt(i)))

                nonDup += ""+str.charAt(i);



        for(int i=0; i < nonDup.length(); i++) {

            int num = Collections.frequency( Arrays.asList(str.split("") ) ,    ""+nonDup.charAt( i ) );

            result += ""+nonDup.charAt(i) + num;

        }



        return result;

    }
}
