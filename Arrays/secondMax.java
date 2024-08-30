package Arrays;
import java.util.Arrays;
public class secondMax {

public  int secondMax(int [] arr){

    int max = Integer.MAX_VALUE;
    int secondmax = Integer.MAX_VALUE;

    for(int i=0;i<arr.length;i++){
        if(arr[i] > max){
            secondmax = max ;
            max = arr[i];
        }else if(arr[i] >secondmax && arr[i] != max){
            secondmax = arr[i];
        }
    }
    return secondmax;

}
    public static void main(String[] args) {
        int [] arr= {12,23,34,3354,56,67,78,89};
        secondMax sm =new secondMax();
        sm.secondMax(arr);
    }

}