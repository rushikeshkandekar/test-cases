package com.crossasyst.test;

import javax.lang.model.element.Name;

public class Person {
    private Name personname;
    private static  int personCounter;

    public Person(Name personname){
        this.personname=personname;
    }
    public Person(){
           personCounter=personCounter+1;
    }

    public String helloword(){
        return "hello";
    }
    public Name name(){
        return personname;
    }

    public String hello(String name) {
          return "hello "+name;
    }

    public int numberofperson() {
        return  2;
    }
    public static int NumberOfPerson() {
        return personCounter;
    }
}
