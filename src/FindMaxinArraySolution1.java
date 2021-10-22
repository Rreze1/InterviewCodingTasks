import java.util.Arrays;

public class FindMaxinArraySolution1 {
    /*
    Array -- Find Maximum
Write a method that can find the maximum number from an int Array
     */
    public static void main(String[] args) {
         int []nums = {10,2,3,5,6};
        System.out.println(maxValue(nums));

    }
    public static int maxValue( int[]  n ) {

        int max = Integer.MIN_VALUE;

        for(int each: n)

            if(each > max)

                max = each;



        return max;

    }
}
