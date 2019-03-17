package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private double totalStudyTime =0;

    public Student() {
    }

    public Student(Long id) {
        super(id);
    }
    public Student(Long id, String name ){
        super(id,name);
    }


    public void learn(double numberOfHours) {

        totalStudyTime = totalStudyTime +numberOfHours;

    }

    public double getTotalStudyTime() {

        return totalStudyTime;
    }

}
