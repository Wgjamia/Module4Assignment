package Q3Exception;

public class Q3Excp {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60};

        try {

            for (int i = 0 ; i<=6 ; i++){
                System.out.println("The values of Array is :"+arr[i]);
            }

        }catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("the index out of range in Array (arr["+exc.getMessage()+"]): "+exc.toString());
        }
    }
}
