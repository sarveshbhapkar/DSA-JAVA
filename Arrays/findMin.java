package Arrays;
public class findMin {
    //for finding minimum number in the array
    public int findMinimum(int [] arr){


        if (arr.length == 0 || arr == null) {
            throw new IllegalArgumentException("invalid input");
        }

        int min=arr[0];

        for(int i =1;i<arr.length;i++){
            if(arr[i] < min){
                min =arr[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
        
        int [] arr = {12,3,44,55,667,8,99};

        findMin f =new findMin();
        System.out.println(f.findMinimum(arr));
    }
}
