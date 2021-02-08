package com.example.demo.services;
import java.util.Calendar;

public class DayOfWeek {

    public String getDayOfWeek() {

        Calendar date = Calendar.getInstance();
        int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);

        String dag = "placeholder";

        switch (dayOfWeek) {
            case 1:
                dag = "Søndag";
                break;
            case 2:
                dag = "Mandag";
                break;
            case 3:
                dag = "Tirsdag";
                break;
            case 4:
                dag = "Onsdag";
                break;
            case 5:
                dag = "Torsdag";
                break;
            case 6:
                dag = "Fredag";
                break;
            case 7:
                dag = "Lørdag";
                break;
        }
        return dag;
    }
}
