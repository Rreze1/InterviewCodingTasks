import java.util.ArrayList;
import java.util.Arrays;

public class SortAscendingInArraySolution1 {
    /*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
int[] arr = {10, 9, 8, 7};
arr = Sort(arr);         ==>{ 7, 8, 9, 10};
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Sort(new int[] {7,20,3,4,5})));
    }
    public static int[] Sort(int[] a) {

        ArrayList<Integer> list=new ArrayList<Integer>();

        for(int each: a)

            list.add(each);



        for(int i=0; i < a.length; i++) {

            a[i] = findMin(list);

            list.remove(Integer.valueOf(a[i]));

        }

        return a;

    }

    public static int findMin(ArrayList<Integer> a) {

        int min =Integer.MAX_VALUE;

        for(int each: a)

            min = Math.min(min, each);

        return min;

    }
}
