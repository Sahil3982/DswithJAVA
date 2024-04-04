import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "Priyanka";
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        Iterator it = set.iterator();
        while(it.hasnext())
        {
            char c = str.next();
            if (!set.contains(c)) {
                set.add(c);
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
