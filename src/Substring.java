import java.util.*;
import java.util.stream.Collectors;

public class Substring {
    public List<String> stringMatching(String[] words) {
        List l = new ArrayList<String>();
        for (String word : words) {
            Iterable collect = Arrays.stream(words)
                    .filter(i -> (word.contains(i) && !i.matches(word)))
                    .collect(Collectors.toSet());

            if (collect.iterator().hasNext()) {
                collect.forEach(a ->
                {
                    if (!l.contains(a)){
                        l.add(a);
                    }
                }
                );


//                l.addAll((Collection) collect);
            }
        }
        return l;
    }
}
