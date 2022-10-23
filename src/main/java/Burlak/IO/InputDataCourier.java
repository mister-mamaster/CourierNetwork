package Burlak.IO;

import Burlak.*;

import java.io.*;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InputDataCourier {
    private final InputStream input = getClass().getClassLoader().getResourceAsStream("Couriers");

    public InputStream getInput() {
        return input;
    }

    public List<Courier> getData(Schedule schedule) throws IOException, URISyntaxException {
        List<Courier> couriers = new ArrayList<>();

        try {
            File file = new File(Objects.requireNonNull(getClass().getClassLoader().getResource("Couriers.txt")).toURI());
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String str = reader.readLine();

            while (str != null) {

                String[] strings = str.split(" ");

                couriers.add(new Courier(strings[0], Integer.parseInt(strings[1]), Double.parseDouble(strings[2]), new Point(Double.parseDouble(strings[3]), Double.parseDouble(strings[4])), schedule));
                str = reader.readLine();
            }

        } catch (IOException e){
            e.printStackTrace();
        }



        return couriers;
    }
}
