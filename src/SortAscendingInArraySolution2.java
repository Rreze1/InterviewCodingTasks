public class SortAscendingInArraySolution2 {
    public static void main(String[] args) {
        int [] arr = {5,4,1,2};

        int temp=0;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if (arr[j]>arr[i]){
                    temp = arr[j];
                    arr[j]= arr[i];
                    arr[i]= temp;
                }
            }
        }
        for(int arr1: arr){
            System.out.println(arr1);
        }

    }


}
