import java.util.Arrays;

public class DividePlayersIntoTeamsofEqualSkill {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int i = 0, j = skill.length - 1;
        long x = 0L + skill[i] + skill[j];
        long res = 0L;
        ;
        while (i < j) {
            if (skill[i] + skill[j] != x) {
                return -1L;
            }
            res += 1L * skill[i++] * skill[j--];
        }
        return res;
    }
}
