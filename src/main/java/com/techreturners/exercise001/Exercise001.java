package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.util.List;
import java.util.*;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
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
        int countLinuxUser = 0;

        for (User user : users) {
            if (user.getType().toUpperCase().equals("LINUX")) {
                countLinuxUser += 1;
            }
        }

        return countLinuxUser;

        // Seems cant use lambda in this Java version, as I would have used the below
        // code if it was possible
        // return (int)
        // users.stream().filter(x->x.getType().toUpperCase().equals("LINUX")).count();
    }
}
