package com.crossasyst.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void shouldReturnHello() {
        Person person = new Person();
        assertEquals("hello", person.helloword());
    }

    @Test
    public void shouldReturnPerson1() {
        Person person1 = new Person();
        assertEquals("hello word", person1.hello("word"));
    }

    @Test
    public void shouldReturnNumberofPerson() {
        Person person1 = new Person();
        Person person2 = new Person();
        Person myperson = new Person();
        assertEquals(2, myperson.numberofperson());
    }

    @Test
    public void shouldReturnNumberOfPersonUsingStatic() {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        assertEquals(4, Person.NumberOfPerson());

    }

    @Test
    public void demoBollean() {
        int i = 4;
        int j = 3;
        boolean monday = true;
        boolean raining = true;
        if (shouldDrinkBeer(i, j, monday, raining)) {
            drinkBeer();
        }
        if (i == j) {
            raining = true;
        }
        if (monday || raining) {
            i = 87;
            j = 94;
            i = i + j;
            drinkBeer();
        } else if (j > i) {
            i++;
            i = 56;
        } else if (i != j) {
            i = 8;
        } else {
            j--;
        }
    }

    private void drinkBeer() {
    }

    private boolean shouldDrinkBeer(int i, int j, boolean monday, boolean raining) {
        return  i < j || ((monday && !raining ) || j > 3);
    }
    @Test
    public void shouldReturnNumberOfPersonInLoop(){
        Person person1;
        for (int i = 0; i < 4 ; i++){
             person1 = new Person();
        }
        assertEquals(4, Person.NumberOfPerson());

    }
    @Test
    public void  demoArray(){
        Person[] persons = new Person[4];
        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = new Person();
        persons[3] = new Person();

        for ( int i = 0; i < persons.length; i++){
            persons[i] = new Person();
        }
        for ( Person person : persons){
            person.helloword();
        }


    }
}


