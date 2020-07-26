package operation;
import inter.Operation;

public class Multiplication implements Operation{
    int x,y;
    public Multiplication(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void performOperation(){
        System.out.println("operation.Multiplication of X and Y : "+ x*y);
    }
}

