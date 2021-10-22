public class FindMinInArraySolution1 {
    /*
    Write a method that can find the maximum number from an int Array
     */
    public static void main(String[] args) {
    int [] nums = {1,3,4,5,0};
        System.out.println(maxValue(nums));
    }
    public static int maxValue( int[]  n ) {

        int min = Integer.MAX_VALUE;

        for(int each: n)

            if(each < min)

                min = each;



        return min;

    }
}
