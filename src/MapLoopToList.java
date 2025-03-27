import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapLoopToList {

    public static void main(String[] args) {

        List<List<String>> li = new ArrayList<>();

        HashMap<String, Integer> mapp = new HashMap<>();
        mapp.put("key1", 1);
        mapp.put("key2", 2);
        mapp.put("key3", 3);
        mapp.put("key4", 4);

        for (Map.Entry <String, Integer> entry : mapp.entrySet()) {
            System.out.println("entry.getKey() : " + entry.getKey());
            System.out.println("entry.getValue() : " + entry.getValue());
            List<String> lii = new ArrayList<>();
            lii.add(entry.getKey());
            lii.add(String.valueOf(entry.getValue()));
            li.add(lii);
        }

        System.out.println("li : " + li);

    }



}
