package jo.edu.htu.statictics;

public class MyStatistics implements Statistic {
    String name;
    Integer matched;
    MyStatistics(String name,Integer matched){
        this.name=name;
        this.matched=matched;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public Integer matchedCases() {
        return this.matched;
    }

    @Override
    public int compareTo(Statistic o) {
        return 0;
    }
}
