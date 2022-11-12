package Burlak;

import java.util.LinkedList;
import java.util.List;

public class Schedule {
    List<Assignment> assignments = new LinkedList<>();

    public Schedule() {
    }

    public Schedule(List<Assignment> assignments) {
        this.assignments = assignments;
        assignments.get(0).getCourier().setSchedule(this);
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Schedule[\n");
        for (Assignment assignment:
             this.assignments) {
            str.append(assignment).append(", \n");
        }
        return str + "]";
    }

    public void addAssignment(Assignment assignment){
        this.assignments.add(assignment);
    }

    public void removeAssignment(int index){
        this.assignments.remove(index);
    }

    public Assignment getAssignment(int index){
        return this.assignments.get(index);
    }

    public int countAssignments(){
        return this.assignments.size();
    }

    public double totalLength(){
        double length = 0;

        for (Assignment assignment:
             assignments) {
            length += assignment.getLength();
        }

        return length;
    }

    public int totalTime(){
        int time = 0;

        for (Assignment assignment:
             assignments) {
            time += assignment.getInterval().duration();
        }

        return time;
    }
}
