public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int min = 200;
        for (String x : strs) {
            min = Math.min(min, x.length());
        }
        String res = "";
        for (int i = 0; i < min; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c)
                    return res;
            }
            res += c;
        }
        return res;
    }
}
