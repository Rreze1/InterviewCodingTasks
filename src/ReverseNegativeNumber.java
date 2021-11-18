public class ReverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println(reverseNum(1234));
    }
    public static int reverseNum(int num){
        String str = new StringBuffer(""+num).reverse().toString();
        if (num<0){
            str = "-"+str.substring(0, str.length()-1);
        }
        return (Integer.valueOf(str));
    }


}
