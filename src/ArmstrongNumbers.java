public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println(ArmStrongNumber(153));
    }
    public static boolean ArmStrongNumber (int num){
        int a=0, b=0, c=num;
        while (num>0){
            a = num%10;
            num=num /10;
            b=b+(a*a*a);
        }
        if (c==b){
            return true;
        }
        return false;
    }
}
