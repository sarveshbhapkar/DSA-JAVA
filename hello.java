public class hello {

   
    public void printEle(int [] arr){

        int n =arr.length;

        for(int i=0;i<n;i++){
            System.out.println(arr[i]+ " ");
        }
    }


    //finding minimum element in the array
    public void findmin(int [] array){
        int min = array[0];

        for(int i =1;i<array.length;i++){
            if(array[i]< min){
                min = array[i];
            }
        }
        System.out.println(min);
    }

    //find second maximum element in the array

    public void secondMax(int [] arr){
        
        
    }

    public static void main(String[] args) {
       

        hello h =new hello();
       // h.printEle(new int[] {2,4,7,9,6,3});
        h.findmin(new int[] {12,45,67,4589,4});
    }
}
