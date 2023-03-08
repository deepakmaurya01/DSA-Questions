public class CircularSentence {
    public boolean isCircularSentence(String sentence) {
        String s[] = sentence.split(" ");
        if (s.length == 1) {
            return s[0].charAt(0) == s[0].charAt(s[0].length() - 1);
        }
        for (int i = 0; i < s.length - 1; i++) {
            int s1 = s[i].length() - 1;
            if (s[i].charAt(s1) != s[i + 1].charAt(0))
                return false;
        }
        int n = s.length - 1;
        return s[0].charAt(0) == s[n].charAt(s[n].length() - 1);
    }
}
