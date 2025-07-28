class Solution {
    public double myPow(double x, int n) {
        long nn=n;
        double ans=1.0;
        if(nn<0){
            x=1/x;
            nn= -nn;
        }
        while(nn>0){
            if(nn%2==1){
                ans*=x;
            }
            x*=x;
            nn/=2;
        }
        return ans;

    }
}