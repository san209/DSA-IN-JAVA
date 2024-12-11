class printFactorial {
    public static int calcfactorial(int n) {
        //base case can be n = 0 or n = 1
        //0! = 1
        if(n == 1 || n == 0) {
            return 1;
        }
        int fact_nm1 = calcfactorial(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }
    
    public static void main(String args[]) {
        int n = 5;
        int ans = calcfactorial(n);
        System.out.println(ans);
    }
}