class Solution {
    public static int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int n : nums) min = Math.min(min, n);
        int moves = 0;
        for (int n : nums) moves += n - min;
        return moves;
    }
}
public class lc453{
  public static void main(String[]args){
    System.out.println(Solution.minMoves(new int[]{1,2,3,4,5}));
  }
}
