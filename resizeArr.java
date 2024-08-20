public class resizeArr {
    
    public void printarr(int [] original){
        
         int n =original.length;

        for(int i=0;i<n;i++){
            System.out.println(original[i] + " ");
        }

    }

    public int[] resize(int [] original,int capacity){
        int [] temp = new int[capacity];
        for(int i =0;i<original.length;i++){
            temp[i] = original[i];
        }
        original = temp;


        return original;
    }

    public static void main(String[] args) {
        resizeArr r =new resizeArr();

        int [] original ={12,34,56,78,89};

        System.out.println("size of original array - "+original.length);

        r.resize(original, 10);

        System.out.println("size of resized array - "+original.length);
       
    }
}
