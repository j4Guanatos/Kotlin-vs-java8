package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ResumeStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        addElementsToList(list);

        double total = list.stream()
                .mapToDouble(d -> d).sum();

        List<String> longNames = getLongNames();

        List<String> notUsefulNames = longNames
                .stream()
                .filter(String::isEmpty)
                .collect(Collectors.toList());
    }

    private static void addElementsToList(List<Double> list) {

    }

    public static List<String> getLongNames(){
        return Collections.emptyList();
    }
}
