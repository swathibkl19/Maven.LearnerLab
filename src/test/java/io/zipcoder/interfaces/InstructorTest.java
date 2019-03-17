package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    Instructor instructor = new Instructor();

    @Test
    public void teach() {
    }

    @Test
    public void lecture() {
    }

    @Test
    public void testImplementation(){
  Instructor instructor = new Instructor();
        Assert.assertTrue(instructor instanceof Teacher );
    }
    @Test
    public void testInheritance(){
        Instructor instructor =new Instructor();
        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void testTeach(){
     Student student =new Student();
      double beforeAddingHours  =student.getTotalStudyTime();
      double expected =beforeAddingHours + 5.0;
        instructor.teach(student,5.0);
        double actual =student.getTotalStudyTime();

        Assert.assertEquals(actual,expected,0.01);

    }
    @Test
    public void testLecture(){
     Student student[] = new Student[4];
     for( int i =0; i<student.length; i++) {
      student[i] = new Student();
     }
        instructor.lecture(student,4.0 );
     double totalHours =0;
        for (int i = 0; i <student.length ; i++) {

            totalHours += student[i].getTotalStudyTime();

        }
        Assert.assertEquals(totalHours,4,0.00);
    }

}