public class FindMinimum {
    public static void main(String[] args) {
        int arr[] = {3,6,1,7,10,9,12,4,32};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
    public static int minValue(int[] arr){
        int index = 0 ;
        for(int i = 0 ; i< arr.length; i++){
            if(arr[i]<arr[index]){
                index = i;
            }
        }
        return index;
    }
}
