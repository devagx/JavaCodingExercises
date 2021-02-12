package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.util.List;
import java.util.*;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        if (word == null)
            throw new IllegalArgumentException("You can not supply a null parameter");
        if (word.length() == 0)
            throw new IllegalArgumentException("Word must contain at least one character.");

        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        if (firstName == null)
            throw new IllegalArgumentException("You can not supply a null parameter");
        if (firstName.length() == 0)
            throw new IllegalArgumentException("firstName must contain at least one character.");
        if (lastName == null)
            throw new IllegalArgumentException("You can not supply a null parameter");
        if (lastName.length() == 0)
            throw new IllegalArgumentException("lastName must contain at least one character.");

        return firstName.substring(0, 1) + "." + lastName.substring(0, 1);
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        double vatSum = (originalPrice * vatRate) / 100;
        double grossSum = vatSum + originalPrice;

        return Double.parseDouble(new DecimalFormat("#.##").format(grossSum));
    }

    public String reverse(String sentence) {
        // Add your code here
        StringBuilder output = new StringBuilder(sentence).reverse();
        return output.toString();
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
         return (int) users.stream().filter(user->user.getType().toUpperCase().equals("LINUX")).count();
    }
}
