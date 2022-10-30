package Burlak;

import Burlak.IO.OutputDataSchedule;

import java.io.IOException;
import java.net.URISyntaxException;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {

        Assignment assignment1 = new Assignment(new Courier(), new Order(), new Point(), new Interval(0, 111), 0);
        Assignment assignment2 = new Assignment(new Courier(), new Order(), new Point(), new Interval(), 12);
        ArrayList<Assignment> assignments = new ArrayList<>();
        assignments.add(assignment1);
        assignments.add(assignment2);
        Schedule schedule = new Schedule(assignments);

        OutputDataSchedule outputDataSchedule = new OutputDataSchedule();
        outputDataSchedule.writeSchedule(schedule);
    }
}
