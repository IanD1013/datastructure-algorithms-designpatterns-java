package designpattern.creational.factory_method.exercise;

import java.util.Date;

public class ArabianCalendar implements Calendar {
    @Override
    public void addEvent(Event event, Date date) {
        System.out.println("Adding an event to the Arabian calendar.");
    }
}
