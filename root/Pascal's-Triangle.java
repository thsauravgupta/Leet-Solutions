class Solution {
    public static int nCr(int n,int r){
         if (r > n - r){
             r = n - r;
         }
        long result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return (int)result;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row =new ArrayList<>();
            for(int j=0;j<=i;j++){
                row.add(nCr(i,j));
            }
            triangle.add(row);
        }
        return triangle;
    }
}