package jo.edu.htu.statictics;

import java.util.ArrayList;
import java.util.List;

public class StringsCollector implements StatisticsCollector<String> {
    List<Statistic> list = new ArrayList<>(4);
    String[] keys = {"upper case letters", "lower case letters", "spaces count", "non-word characters"};
    int[] numbers = new int[4];

    @Override
    public Iterable<Statistic> collect(Iterable<String> cases) {
        computeNumbers(cases);
        for (int i = 0; i < keys.length; i++) {
            int finalI = i;
            list.add(new Statistic() {
                @Override
                public String name() {
                    return keys[finalI];
                }

                @Override
                public Integer matchedCases() {
                    return numbers[finalI];
                }

                @Override
                public int compareTo(Statistic statistic) {
                    return 0;
                }
            });
        }
        return list;
    }

    private void computeNumbers(Iterable<String> cases) {
        for (String aCase : cases) {
            for (int i = 0; i < aCase.length(); i++) {
                if (Character.isUpperCase(aCase.charAt(i)))
                    numbers[0]++;
                else if (Character.isLowerCase(aCase.charAt(i)))
                    numbers[1]++;
                else if (aCase.charAt(i) == ' ')
                    numbers[2]++;
                else if (!Character.isDigit(aCase.charAt(i)))
                    numbers[3]++;
            }
        }
    }


}
