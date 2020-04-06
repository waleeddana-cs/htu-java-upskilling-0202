package jo.edu.htu.statictics;

import java.time.Year;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentsCollector implements StatisticsCollector<Student> {
    int csMajor, cisMajor, gradLess2016, gradHigh2016, female, male;
    ArrayList<Statistic> statistics = new ArrayList<>();
    @Override
    public Iterable<Statistic> collect(Iterable<Student> cases) {
        Iterable<Statistic> studentStatistics;


        Iterator<Student> students = cases.iterator();
        while (students.hasNext()) {
            Student student = students.next();

            if (student.getMajor().equals("CIS")) {
                cisMajor++;

            }
            if (student.getMajor().equals("Computer Science")) {
                csMajor++;
            }
            if ((student.getGraduationYear().compareTo(Year.of(2016))) <=0) {

                gradLess2016++;

            }
            if ((student.getGraduationYear().compareTo(Year.of(2016))) >0) {
                gradHigh2016++;

            }
            if (student.getGender().equals(Gender.FEMALE)) {
                female++;
            }
            if (student.getGender().equals(Gender.MALE)) {
                male++;
            }

        }
        fillStatistics("CIS major",cisMajor);
        fillStatistics("Computer Science major",csMajor);
        fillStatistics("graduation year <= 2016",gradLess2016);
        fillStatistics("graduation year > 2016",gradHigh2016);
        fillStatistics("Males",male);
        fillStatistics("Females",female);

        studentStatistics = statistics;

        return studentStatistics;
    }

    private void fillStatistics(String name,Integer matched) {
        Statistic statistic = new MyStatistics(name, matched);
        statistics.add(statistic);

    }
}
