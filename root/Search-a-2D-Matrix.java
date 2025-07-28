class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int x=matrix.length;
        int y=matrix[0].length;
        int low =0;
        int high=x*y-1;
        while(low<=high){
            int mid=(high+low/2);
            int midval=matrix[mid/y][mid%y];
            if(midval==target) return true;
            if(midval<target) low=mid+1;
            if(midval>target) high=mid-1;
        }
        return false;
    }
}