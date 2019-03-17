package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People <E extends Person>{

    protected List<E> personList;

    public People(){

        this.personList=new ArrayList<>();
    }

    public void add(E person){

        personList.add(person);

    }
    public E findById(long id){
        E personFound = null;
        for (E person : personList) {
            if(person.getId() == id){
                personFound = person;
                return personFound;
            }
        }
        return null;
    }
    public void remove(E person){

        personList.remove(person);
//        Iterator<E> it = personList.iterator();//Can do using Iterates also.
//        while (it.hasNext()) {
//            E person1 = it.next();
//            if(person1.getName().equals(person.name)) {
//                it.remove();
//            }
//        }
    }
    public void remove(Long id){
        for (E person2 : personList) {
            if(person2.getId() == id){
                personList.remove(person2);
            }

        }
    }
    public Integer getCount(){
        return personList.size();
    }

//    public E[] getArray(){
//        return personList.toArray(new E[personList.size()]);
//
//    }

    abstract  public E[] getArray();

    public void removeAll(){
        personList.clear();
    }

    public int size(){
        return personList.size();
    }
    public Boolean contains(E p){
        return  personList.contains(p);
    }
}
