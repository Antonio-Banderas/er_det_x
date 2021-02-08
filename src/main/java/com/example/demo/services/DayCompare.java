package com.example.demo.services;

public class DayCompare {

    public String compareDay (String actualDay, String userDay){

        String message;
        
        if (actualDay.equalsIgnoreCase(userDay)){
            message = "Ja, det ER " + userDay + "! \uD83D\uDE0E";
        } else {
            message = "Nej, det er " + actualDay + " i dag ☹️";
        }
        return message;
    }
}
