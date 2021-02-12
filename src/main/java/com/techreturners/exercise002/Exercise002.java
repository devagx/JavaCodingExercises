package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        // Add your code here
        return person.getCity().toUpperCase().equals("MANCHESTER");
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        // Add your code here
        if (person.getAge() >= ageLimit) {
            return true;
        } else {
            return false;
        }

    }

}
