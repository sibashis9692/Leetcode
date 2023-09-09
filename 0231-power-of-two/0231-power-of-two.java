class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1){
            return true;
        }
        if(n == 2147483647){
            return false;
        }
        int num = 1;
        int check = 0;
        do{
            check = (int)Math.pow(2, num);
            num+=1;
            System.out.println(num);
        }while(check < n);

        if(check == n){
            return true;
        }
        return false;
    }
}