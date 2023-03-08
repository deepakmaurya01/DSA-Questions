public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        int n = s.length();
        int numCols = (int) Math.ceil(n / (numRows * 2 - 2.0)) * (numRows - 1);
        char c[][] = new char[numRows][numCols];
        int k = 0, i = 0, j = 0;
        while (k < n) {
            while (i < numRows && k < n) {
                c[i++][j] = s.charAt(k++);
            }
            i -= 2;
            j++;
            while (i > 0 && k < n) {
                c[i--][j++] = s.charAt(k++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < numRows; i++) {
            for (j = 0; j < numCols; j++) {
                if (c[i][j] != '\0') {
                    sb.append(c[i][j]);
                }
            }
        }
        return sb.toString();
    }
}
