package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    Person person;

    @Test
    public void testConstructor(){
        //Given
        String name ="";
        long id=10L;
        person =  new Person(id);


        //When
       long actual =   person.getId();

       //Then
        Assert.assertEquals(id, actual);

    }

    @Test
    public void testSetName(){
        //Given
        long id=10L;
        String name ="Priyanka";

        //When
         person =new Person();
         person.setName(name);
         //Verifying the "setName" with "GetName
         String expectedName = person.getName();

         //Then
         Assert.assertEquals(name,expectedName);

    }
}
