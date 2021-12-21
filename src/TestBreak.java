public class TestBreak {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number<20){
            number++;
            sum+=number;
            if (sum >=100)
                break;
        }
        System.out.println("The number is " +number);
        System.out.println("the sum is " +sum);

        for (int i=0; i<=2; i ++){
            for (int j = 0; j <=5; j++) {
                System.out.println("hello world");
            }
        }
    }
}
//1+2+3+4+5+6+7+8+9+10+11+12+13+14