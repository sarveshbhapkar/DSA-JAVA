public class missingNum {
    
    public static int missing(int [] arr){

        int n = arr.length+1;

        int sum = n* (n+1)/2;

        for(int num :arr){
            sum = sum - num;

        }
        return sum;

    }

    public void arrayDemo(){
        int [] arr = {2,4,6,7,8,1,5};
        System.out.println(missing(arr));

    }
    public static void main(String[] args) {
        
        missingNum m =new missingNum();
       m.arrayDemo();
        
    }
}
