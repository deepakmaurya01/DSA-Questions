public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        for (int x[] : accounts) {
            int sum = 0;
            for (int y : x) {
                sum += y;
            }
            res = Math.max(res, sum);
        }
        return res;
    }
}
