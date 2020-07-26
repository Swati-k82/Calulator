package operation;
import inter.Operation;

public class Division implements Operation{
    int x,y;
    public Division(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void performOperation(){
        if(y!=0)
            System.out.println("operation.Multiplication of X and Y : "+ x/y);
        else
            System.out.println("ERROR:Divide by Zero Exception");
    }
}
