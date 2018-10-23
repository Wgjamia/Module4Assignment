package ly.edurek.pack2;
import co.edureka.pack1.*;

public class CallMeth {
    public static void main(String [] args){

        Calc eRefDig = new Calc();

        System.out.println("The Sumation is : "+eRefDig.sum(10,20));
        System.out.println("The subtract is : "+eRefDig.Subtract(30,5));
        System.out.println("The multiply is : "+eRefDig.multiply(7,13));
        System.out.println("The divide is : "+eRefDig.divide(150,10));
        System.out.println("The factorial is : "+eRefDig.fact(5));
        System.out.println("The reversing is : "+eRefDig.ReverseNumber(5698));


    }
}
