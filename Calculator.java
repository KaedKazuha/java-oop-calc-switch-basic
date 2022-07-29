import java.util.Scanner;

class Calculator {



    public static void main(String[] args) {
        Body body=new Body();
        Scanner sc= new Scanner(System.in);

        {
            System.out.print("Enter first number- ");
        }
        int x =sc.nextInt();

        {System.out.print("Enter first number- ");}


        {
            System.out.print("Enter second number- ");
        }

        int y =sc.nextInt();

        System.out.print("Enter Choice\n" +
                " addition-1 \n subtraction-2\n Division-3\n Multiplication-4\n even or odd-5\n");
        int choice=sc.nextInt();
        calculation(choice,body,x,y);



    }
    static void calculation(int choice,Body body,int x,int y){
        switch(choice){
            case 1:

                body.sum(x,y);
                int z=body.sum(x,y);
                System.out.print("Sum is"+" "+z);
                break;
            case 2:
                body.sub(x,y);
                break;
            case 3:
                body.div(x,y);
                break;
            case 4:
                body.mul(x,y);

                break;
            case 5:
                body.eod(x,y);
                break;
            default:
                System.out.println("You have entered wrong operator");
                return;

        }
    }
}