//addong or updating elements in array 

public class add {

    public void arrayDemo(){
        int [] myArray =new int[6];
        myArray[0] = 1;
        myArray[1] = 10;
        myArray[2] = 100;
        myArray[3] = 1000;
        myArray[4] = 10000;
        myArray[5] = 1000;

        System.out.println(myArray.length);
    }
    public static void main(String[] args) {
        
        add ad = new add();
        ad.arrayDemo();
    }
}
