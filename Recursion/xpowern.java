class xpowern {
    public static int calcPower(int x, int n) {
        if(n == 0) { //base case 1
            return 1;
        }
        else if(x == 0) { //base case 2
            return 0;
        }
        int xpownm1 = calcPower(x, n-1);
        int xpown = x * xpownm1;
        return xpown;
    }

    public static void main(String args[]) {
        int x = 5, n = 3;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}