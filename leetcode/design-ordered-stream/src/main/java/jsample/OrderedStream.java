package jsample;

import java.util.ArrayList;
import java.util.List;

public class OrderedStream {

    private String[] values;

    private int ptr;

    public OrderedStream(int n) {
        ptr = 1;
        values = new String[n + 1];
    }

    public List<String> insert(int id, String value) {
        values[id] = value;
        List<String> list = new ArrayList<>();
        if (id == ptr) {
            while (ptr != values.length && values[ptr] != null) {
                list.add(values[ptr]);
                ptr++;
            }
        }
        return list;
    }
}