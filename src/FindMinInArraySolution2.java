import java.util.Arrays;

public class FindMinInArraySolution2 {
    public static void main(String[] args) {
    int [] nums = {4,5,6,7,2,1};
        System.out.println(maxValue(nums));
    }
    public static int maxValue( int[]  n ) {

        Arrays.sort( n );

        return  n [ 0 ];

    }
}
