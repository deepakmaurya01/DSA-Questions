public class PassthePillow {
    public int passThePillow(int n, int time) {
        int res = 1;
        boolean flag = false;
        while (time > 0) {
            if (!flag && res < n) {
                res++;
            } else {
                res--;
                flag = true;
                if (res == 1) {
                    flag = false;
                    // res=1;
                }
            }
            time--;
        }
        return res;
    }
}
