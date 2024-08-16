public class arrayUtil {
    
    //method for printing elements of an array
    public void printArray(int [] arr){
        int n = arr.length;
        for(int i =0 ;i<n;i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }


    public void arrayDemo(){
        int [] myArray = new int[5];
        myArray[0]=1;
        myArray[1]=10;
        myArray[2]=100;
        myArray[3]=1000;
        myArray[4]=10000;

        printArray(myArray);
    }

    public static void main(String[] args) {
        arrayUtil arrutil =new arrayUtil();
        arrutil.arrayDemo();
        
    }
}
