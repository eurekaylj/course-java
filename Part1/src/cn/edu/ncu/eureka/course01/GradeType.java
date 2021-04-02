package cn.edu.ncu.eureka.course01;

public enum GradeType {
    A("优"),
    B("良"),
    C("中等"),
    D("及格"),
    E("不及格");
    private final String grade;

    private GradeType(String grade){

        this.grade = grade;
    }
    public String getGrade() {
        return grade;
    }
}
