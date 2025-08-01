class Solution {
    static final int MOD = 1000000007;
    public int countGoodNumbers(long n) {
        long ec=(n+1)/2;
        long oc=n/2;
        long even=modPow(5,ec);
        long odd=modPow(4,oc); 
        return (int)(even *odd % MOD);
    }
    long modPow(long base,long power){
        long result=1;
        base%=MOD;
        while(power > 0){
            if(power%2==1){
                result=(result*base)%MOD;
            }
            base=(base*base)%MOD;
            power/=2;       
            }
        return result;
    }
    
}