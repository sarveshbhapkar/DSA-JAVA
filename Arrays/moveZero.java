package Arrays;
public class moveZero {
    
    //algorithm to move zeros to the end
    public void printArray(int [] arr){

        int n =arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public void demo(){
        int [] arr = {12,56,0,67,0,34,12,0};
        
        printArray(arr);

        move(arr);

        System.out.println();
        printArray(arr);
    }

    public void move(int [] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
            if(arr[j] !=0){
                j++;

            }
        }
    }

    public static void main(String[] args) {
        
        moveZero mz = new moveZero();
        mz.demo();
        
    }
}
