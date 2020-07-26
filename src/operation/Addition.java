package operation;
import inter.Operation;

public class Addition implements Operation{
    int x,y;

    public Addition(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void performOperation(){
        System.out.println("operation.Addition of X and Y : "+ (x+y));
    }
}
