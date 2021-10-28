public class DivideWithoutOperator {
    public static void main(String[] args) {
        int x=6;
        int y=3;
        System.out.println(devides(x,y));
    }
    public static boolean devides(int num1, int num2) {

        if(num2==0) {

            System.out.println("Invalid Number");

            return false;

        }

        System.out.print(num1 +" devid by "+num2 +" is: ");

        int count =0;

        while(num1 >= num2) {

            num1 -= num2;

            count++;

        }

        System.out.println(count+" and remainder is "+num1);

        return true;
    }
}
