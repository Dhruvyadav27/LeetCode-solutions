class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        
        int ans = 0;
        for (String cmd : commands) {
            if (cmd.equals("RIGHT")) {
                ans += 1;
            } else if (cmd.equals("LEFT")) {
                ans -= 1;
            } else if (cmd.equals("DOWN")) {
                ans += n;
            } else if (cmd.equals("UP")) {
                ans -= n;
            }
        }
        return ans;
    

    }
}