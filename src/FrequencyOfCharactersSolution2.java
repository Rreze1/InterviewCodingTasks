public class FrequencyOfCharactersSolution2 {
    public static void main(String[] args) {
        System.out.println(FrequencyOfChars("BBCCCFFFDD"));
    }
    public  static  String  FrequencyOfChars(String str) {

        String expectedResult = "";

        int j=0;

        while( j < str.length()) {

            int count = 0;

            for(int i=0; i < str.length(); i++) {

                if(str.charAt(i) == str.charAt(j)) {

                    count++;

                }

            }

            expectedResult +=str.charAt(j)+"" + count;

            str = str.replace(""+str.charAt(j) ,  "" );

        }

        return expectedResult;

    }
}
