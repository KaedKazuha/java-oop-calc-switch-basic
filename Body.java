class Body implements Functions {
    public void eod(int x, int y){
        int z1=x%2;
        int z2=y%2;
        if (z1==0){
            System.out.println("x is even");}

        else{
            System.out.print("x is odd");
        }
        if (z2==0){
            System.out.println(" and y is even");}

        else{
            System.out.println("y is odd");}
    }
    public int mul(int x, int y) {
        return x * y;

        //System.out.println("result of Multiplication is " + z);
    }
    public void div(int x, int y){
        int z=x/y;

        System.out.println("result of division is "+z);
    }
    public void sub(int x, int y){
        int z=x-y;

        System.out.println("result of subtraction is "+z);
    }
    public int sum(int x, int y){
        return x+y;

        //System.out.println(z);
    }



}
