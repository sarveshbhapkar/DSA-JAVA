package Arrays;
public class minValue {
    
    public int minVal(int [] arr){

        int min=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        return min;
    }
    public static void main(String[] args) {
        int [] arr ={12,23,2,445,55,66,778,89};
        
        minValue m =new minValue();
       System.err.println(m.minVal(arr));

    }
}
