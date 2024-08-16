public class reversearray {
    

    public static void reverse(int[] arr,int start ,int end){
        while(start<end){
            int temp=arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int [] arr ={1,2,3,4,5,6,7,8,9};
        printarr(arr);
        reverse(arr, 0, arr.length-1);
        printarr(arr);
        
    }
}
