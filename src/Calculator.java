import inter.Operation;
import operation.Addition;
import operation.Division;
import operation.Multiplication;
import operation.Substraction;
import java.util.*;


public class Calculator {
    public static void main(String args[]){
        Operation op;
        Scanner in=new Scanner(System.in);
        int choice,x,y;
        char c;
        do{
        System.out.println("Which inter.Operation Do you want to perform:");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Substraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for 4Division");
        System.out.println("Press 5 for Exit");
        choice=in.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Enter x and y");
                x = in.nextInt();
                y = in.nextInt();
                op = new Addition(x, y);
                op.performOperation();
                break;
            case 2:
                System.out.println("Enter x and y");
                x = in.nextInt();
                y = in.nextInt();
                op = new Substraction(x, y);
                op.performOperation();
                break;
            case 3:
                System.out.println("Enter x and y");
                x = in.nextInt();
                y = in.nextInt();
                op = new Multiplication(x, y);
                op.performOperation();
                break;
            case 4:
                System.out.println("Enter x and y");
                x = in.nextInt();
                y = in.nextInt();
                op = new Division(x, y);
                op.performOperation();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Invalid Request");
        }
                System.out.println("Do you want to continue ? Press Y for continue . . .");
                c = in.next().charAt(0);
        }while(c=='Y');


    }

}

