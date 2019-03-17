package io.zipcoder.interfaces;

import java.util.Arrays;

public class Instructor extends Person implements Teacher {
    //Student student = new Student();


    public Instructor() {
    }

    public void teach(Learner learner, double numberOfHours) {

        learner.learn(numberOfHours);

    }

    public Instructor(Long id) {
        super(id);
    }

    public Instructor(Long id, String name) {
        super(id, name);
    }

    public void lecture(Learner[] learners, double numberOfHours) {

        double numberOfHoursPerLearner = numberOfHours/learners.length;
        Arrays.stream(learners)
                .forEach(learner->learner.learn(numberOfHoursPerLearner));
    }


        }

