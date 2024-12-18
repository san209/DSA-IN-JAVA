class fibonacci {
    public static void printFib(int a, int b, int n) {
        if(n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFib(b, c, n-1);
    }

    public static void main(String args[]) {
        int a=0, b=1;
        int n = 7;
        System.out.println(a);
        System.out.println(b);
        printFib(a, b, n-2); //as we have already printed two value s in main fxn we pass n-2 in printFib fxn
    }
}