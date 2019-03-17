package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPeople {

    People people =Students.getINSTANCE();
    @Before
    public void setup(){
        people.removeAll();
    }
//    People people;
//    @Before
//    public void setUp() {
//        people = new People();
//        Person person = new Person(5L);
//        Person person1 = new Person(1L);
//        Person person2 = new Person(2L);
//        Person person3 = new Person(3L);
//
//        people.add(person);
//        people.add(person1);
//        people.add(person2);
//        people.add(person3);
//    }
    @Test
    public void testAdd() {
        //given
        //People people = new People();
        Person person = new Person();
        Assert.assertFalse(people.contains(person));
       // Integer expectedValue = 1;
        //when
        people.add(person);
        //Integer actualValue = people.getCount();
        //Then
        Assert.assertTrue(people.contains(person));
    }

    @Test
    public void testRemove() {
        //Given
        //People people = new People();

        String name = "abbc";
        Person person = new Person(5L);
        person.name = name;

        people.add(person);

        //when
        people.remove(person);
        Person actualPerson = people.findById(person.id);

        // then
        Assert.assertNull(actualPerson);
    }
    @Test
    public void testFindById(){
        //Given
     //People people  = new People();
     Person person = new Person(5L);
        Long expectedId =5L;


        //When
          people.add(person);
          person = people.findById(expectedId);
          Long actualId = person.getId();

      //Then
        Assert.assertEquals(expectedId, actualId);
    }
@Test
    public void testCount(){
        //Given
       // People people = new People();
        int expected =10;

        for(int i =0;i<expected;i++){
            people.add(new Person());
        }
        int actual = people.getCount();
        Assert.assertEquals(expected,actual);

        //when


    //Then
   // Assert.assertEquals("",people.getCount());
}

//  }
}
