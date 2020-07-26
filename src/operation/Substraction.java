package operation;
import inter.Operation;

public class Substraction implements Operation{
    int x,y;
    public Substraction(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void performOperation(){
        System.out.println("operation.Substraction of X and Y : " + (x-y));
    }
}
