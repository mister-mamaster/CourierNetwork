package Burlak.IO;

import Burlak.Schedule;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.Objects;

public class OutputDataSchedule {

    public void writeSchedule(Schedule schedule) throws URISyntaxException, IOException {
        File file = new File("./src/main/resources/Schedule.txt");
        if(!file.exists())
        file.createNewFile();

        FileWriter fw = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(fw);

        StringBuilder str = new StringBuilder(schedule.toString());

        str.delete(0, 10);
        str.deleteCharAt(str.length() - 1);

        String[] strings = Arrays.toString((str.toString().split("\n"))).split(", ");

        strings[0] = new StringBuilder(strings[0]).deleteCharAt(0).toString();


        for(int i = 0; i * 3 < strings.length; i++){
            int j = 0, count = 0;
            for(; j < 3; j++){
                if (i * 3 + j < strings.length - 1) {
                    if (!strings[i * 3 + j].equals("")) {
                        writer.write(strings[i * 3 + j] + " ");
                        count++;
                    }
                }
                if(count == 3) writer.write("\n");
            }
            count = 0;
            j = 0;
        }

        writer.close();
        fw.close();
    }

}
