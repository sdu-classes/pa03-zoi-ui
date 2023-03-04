import java.util.*;
public class Calculat0r {
    public static void main(String[] args) {


        while (true){
            try {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the values: ");
                int a = s.nextInt();
                int b = s.nextInt();
                Calculator obj = new Calculator(a,b);
                System.out.println("Choose option: ");
                System.out.println("1 add");
                System.out.println("2 subtract");
                System.out.println("3 multiply");
                System.out.println("4 divide");
                System.out.println("0 exit");
                int choice = s.nextInt();
                if(choice == 0){
                    break;
                }
                switch (choice){
                    case 1: obj.Add();
                    break;
                    case 2: obj.Subtract();
                    break;
                    case 3: obj.Multiplication();
                    break;
                    case 4: obj.Division();
                    default:
                        System.out.println("invalid input ");
                }


            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }catch (InputMismatchException e ){
                System.out.println("wrong input , only integers allowed");

            }
        }
    }
}
class Calculator{
    int a;
    int b;

    Calculator(int a , int b){
        this.a = a;
        this.b = b;
    }

    void Add() throws ArithmeticException{
        if(a< 0 || b < 0)
            throw new ArithmeticException("One og the value is negative , enter only positive integers");
        System.out.println(a+b);
    }
    void Subtract() throws ArithmeticException{
        if(a < 0 || b < 0)
            throw  new ArithmeticException("One og the value is negative , enter only positive integers");
        System.out.println(a-b);
    }
    void Multiplication() throws ArithmeticException{
        if ( a== 0 || b ==0)
            throw  new ArithmeticException("0 -  not allowed ");
        System.out.println(a*b);
    }
    void Division() throws  ArithmeticException{
        if (a == 0 || b ==0)
            throw new ArithmeticException("0 - not allowed ");
        System.out.println(a/b);
    }
}
