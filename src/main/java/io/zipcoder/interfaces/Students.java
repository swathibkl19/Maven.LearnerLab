package io.zipcoder.interfaces;

import java.util.List;

public final class Students  extends People<Student> {

    private static final Students INSTANCE = new Students();

    private Students() {
       String[] names ={"student_1","student_2","student_3"};
       for(Integer i = 0; i < names.length ; i++){
           String name = names[i];
           Student student = new Student(i.longValue(), name);
           super.add(student);

       }
    }

    @Override
    public Student[] getArray() {
        return super.personList.toArray(new Student[personList.size()]);
    }

    public static Students getINSTANCE() {
        return INSTANCE;
    }
}
