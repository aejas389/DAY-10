 class fibonacciseries {
    public static int fib(int n)
    {
        if(n==0  || n==1)
        {
            return 1;
        }
        return fib(n-1)+fib(n-2);

    }

    public static void main(String[] args) {
        int res = fib(5);
        System.out.println(res);
    }
    
}