package Burlak.IO;

import Burlak.Assignment;
import Burlak.Schedule;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class OutputDataSchedule {

    public void writeSchedule(List<Assignment> assignments, Writer out) throws URISyntaxException, IOException {

        BufferedWriter writer = new BufferedWriter(out);

        StringBuilder str = new StringBuilder();

        for(Assignment assignment: assignments){
            str.append(String.valueOf(assignment.getOrder().getId()) + " " + String.valueOf(assignment.getCourier().getId()) + " " + String.valueOf(assignment.getCourier().getStartPoint().getX()) + " " + String.valueOf(assignment.getCourier().getStartPoint().getY()) + " " + String.valueOf(assignment.getInterval().getBegin()) + " " + String.valueOf(assignment.getInterval().getEnd()) + String.valueOf(assignment.getLength()) + "\n");
        }

        writer.write(str.toString());

        writer.close();
    }

}
