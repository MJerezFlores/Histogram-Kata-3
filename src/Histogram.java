import java.util.HashMap;

public class Histogram{
    private final static int[] vector = {2, 2, 11, 4, 2, 6, 11, 2, 3, 5, 11, 5};
    static HashMap<Integer, Integer> histogramMap = new HashMap<>();

    public static void main(String[] args) {
        for (int number : vector) {
            histogramMap.put(number, getFrequency(histogramMap, number)+1);
        }

        for (Integer number : histogramMap.keySet()) {
            System.out.println(number +"->"+histogramMap.get(number));
        }
    }

    private static Integer getFrequency(HashMap<Integer, Integer> histogramMap, int number) {
        return histogramMap.containsKey(number) ? histogramMap.get(number) : 0;
    }
}
