class sumOfNaturalNumbers {
    public static void printSum(int i, int n,int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);
        System.out.println(i); //5 wont be printed because of the return statement in if loop  
    }

    public static void main(String args[]) {
        printSum(1, 5, 0);
    }
}