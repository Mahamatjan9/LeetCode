public class Main {
    public static void main(String[] args) {




    }
    class Solution {
        public int climbStairs(int n) {
            if (n==1)
                return 1;
            if (n==2)
                return 2;


            int current = 0;
            int step1 = 2;
            int step2 = 1;

            for(int i = 3; i<=n; i++){
                current = step1 + step2;
                step2 = step1;

                step1 = current;
            }
            return current;



        }
    }




}