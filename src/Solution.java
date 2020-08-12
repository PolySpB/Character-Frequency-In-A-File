import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        ArrayList<Character> list = new ArrayList<>();
        TreeMap<Character, Integer> map = new TreeMap<>();

        while (inputStream.available() > 0) {
            char data = (char) inputStream.read();
            list.add(data);
        }

        inputStream.close();

        for (int i=0; i<list.size(); i++) {
            int count = Collections.frequency(list, list.get(i));
            map.put(list.get(i), count);
        }

        for (Map.Entry entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
