package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}
    

    public static List<Integer> task6(List<Integer> list_1) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0, i < list_1.size()) {
            if (i % 100 == 0) {
                result.add(i); }
            else {
                int rounded = ((i / 100) + 1) * 100;
                result.add(rounded);
            } }
        return result;
    }
}
