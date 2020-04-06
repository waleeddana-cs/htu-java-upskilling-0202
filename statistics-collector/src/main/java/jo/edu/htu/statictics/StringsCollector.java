package jo.edu.htu.statictics;

import java.util.ArrayList;
import java.util.Iterator;

public class StringsCollector implements StatisticsCollector<String> {
    int upperCaseCounter, lowerCaseCounter, spacesCounter, non_letterCounter;
    ArrayList<Statistic> statistics = new ArrayList<>();

    @Override
    public Iterable<Statistic> collect(Iterable<String> cases) {
        Iterable<Statistic> casesList;

        Iterator iterator = cases.iterator();
        while (iterator.hasNext()) {
            String eachString = (String) iterator.next();
            for (int i = 0; i < eachString.length(); i++) {
                if (eachString.charAt(i) >= 'A' && eachString.charAt(i) <= 'Z') {
                    upperCaseCounter++;
                    continue;
                }
                if (eachString.charAt(i) >= 'a' && eachString.charAt(i) <= 'z') {
                    lowerCaseCounter++;
                    continue;
                }
                if (eachString.charAt(i) == ' ') {
                    spacesCounter++;
                    continue;
                }
                if (eachString.charAt(i) >= 48 && eachString.charAt(i) <= 57) {
                    continue;
                }
                non_letterCounter++;
            }
        }
        fillStringStatistics("upper case letters", upperCaseCounter);
        fillStringStatistics("lower case letters", lowerCaseCounter);
        fillStringStatistics("spaces count", spacesCounter);
        fillStringStatistics("non-word characters", non_letterCounter);

        casesList = statistics;
        return casesList;
    }

    private void fillStringStatistics(String name, Integer matched) {
        Statistic statistic = new MyStatistics(name, matched);
        statistics.add(statistic);
    }


}
