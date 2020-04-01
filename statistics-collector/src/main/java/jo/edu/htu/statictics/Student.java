package jo.edu.htu.statictics;

import java.time.Year;

public class Student {
    private final String studentId;
    private final String studentName;
    private final Year studentGraduationYear;
    private final  String studentUniversity;
    private final String studentMajor;
    private final Gender studentGender;

    private Student(Builder builder) {
        this.studentId = builder.studentId;
        this.studentName = builder.studentName;
        this.studentGraduationYear = builder.studentGraduationYear;
        this.studentUniversity = builder.studentUniversity;
        this.studentMajor = builder.studentMajor;
        this.studentGender = builder.studentGender;
    }

    public static Builder builder() {

        return new Builder();
    }

    public String getId() {
        return studentId;
    }

    public String getName() {
        return studentName;
    }

    public Year getGraduationYear() {
        return studentGraduationYear;
    }

    public String getUniversity() {
        return studentUniversity;
    }

    public String getMajor() {
        return studentMajor;
    }

    public Gender getGender() {
        return studentGender;
    }

    public static class Builder {
        String studentId;
        String studentName;
        Year studentGraduationYear;
        String studentUniversity;
        String studentMajor;
        Gender studentGender;

        public Builder setId(String id) {
            this.studentId = id;
            return this;
        }

        public Builder setName(String name) {
            this.studentName = name;
            return this;
        }

        public Builder setGraduationYear(Year graduationYear) {
            this.studentGraduationYear = graduationYear;
            return this;
        }

        public Builder setUniversity(String university) {
            this.studentUniversity = university;
            return this;
        }


        public Builder setMajor(String major) {
            this.studentMajor = major;
            return this;
        }

        public Builder setGender(Gender gender) {
            this.studentGender = gender;
            return this;
        }

        public Student build() {


            return new Student(this);
        }
    }
}
