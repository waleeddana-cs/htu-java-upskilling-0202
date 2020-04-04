package jo.edu.htu.statictics;

import java.util.ArrayList;
import java.util.List;

public class StudentsCollector implements StatisticsCollector<Student> {
    List<Statistic> list = new ArrayList<>(6);
    String[] keys = {"CIS major", "Computer Science major", "graduation year <= 2016", "graduation year > 2016", "Males", "Females"};
    int[] numbers = new int[6];

    @Override
    public Iterable<Statistic> collect(Iterable<Student> cases) {
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

    private void computeNumbers(Iterable<Student> cases) {
        for (Student aCase : cases) {
            if (aCase.getMajor().equals("CIS"))
                numbers[0]++;
            else
                numbers[1]++;
            if (aCase.getGraduationYear().getValue() <= 2016)
                numbers[2]++;
            else
                numbers[3]++;
            if (aCase.getGender().equals(Gender.MALE))
                numbers[4]++;
            else
                numbers[5]++;
        }
    }
}
