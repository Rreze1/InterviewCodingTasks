import java.util.Arrays;

public class FindMaxInArraySolution2 {
    public static void main(String[] args) {
        int [] nums = {7,20,4,5,6,8};
        System.out.println(maxValue(nums));

    }
    public static int maxValue( int[]  n ) {

        Arrays.sort( n );

        return  n [ n.length-1 ];

    }
}
