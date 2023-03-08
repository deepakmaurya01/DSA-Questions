public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;
        int[] freq = new int[26];
        for (char x : magazine.toCharArray()) {
            freq[x - 'a']++;
        }
        for (char x : ransomNote.toCharArray()) {
            if (freq[x - 'a'] == 0)
                return false;
            freq[x - 'a']--;
        }
        return true;
    }
}
