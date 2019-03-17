package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){

        Student student = new Student();

        Assert.assertTrue(student instanceof Learner);

    }
    @Test
    public void testInheritance(){

        Student student =new Student();

        Assert.assertTrue(student instanceof Person);

    }
    @Test
    public void testLearn(){

        //Given

        double numberOfHours =2;
        //Then
     double expectedNoOfHours = 2;

        Student student =new Student();

        student.learn(numberOfHours);

        double actualNoOfHours = student.getTotalStudyTime();

   Assert.assertEquals(expectedNoOfHours, actualNoOfHours,0.0);
    }
    }

