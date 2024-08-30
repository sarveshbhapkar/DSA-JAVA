package Arrays;
/**
 * removeEven
 */
public class removeEven {

    public static int[] removEven(int [] arr){
        int oddCount =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] %2 !=0){
                oddCount++;
            }
        }

        int [] result = new int[oddCount];

        int idx =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] %2 !=0){
                result[idx] =arr[i];
                idx++;
            }
        }
       return result;
    }
    
    public static void main(String[] args) {
        int arr [] = {12,23,34,45,56,67,78,89,90};
        int [] result = removEven(arr);
        System.out.println(result);
    }
}