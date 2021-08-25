
import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        /*************rubbish******************

         int n = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = i; j < g.length; j++) {
                if (s[i] >= g[j]) {
                    n++;
                }
            }
        }
        return n;
         ***********************/
        int i = 0;
        for(int j=0;i<g.length && j<s.length;j++) {
            if(g[i]<=s[j]) i++;
        }
        return i;
    }
}
