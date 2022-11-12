package Burlak.IO;

import Burlak.*;

import java.io.*;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InputDataCourier {
    public static List<Courier> getData(Reader in) throws IOException, URISyntaxException {
        List<Courier> couriers = new ArrayList<>();

            BufferedReader reader = new BufferedReader(in);

            String str = reader.readLine();

            while (str != null) {

                String[] strings = str.split(" ");

                couriers.add(new Courier(strings[0], Integer.parseInt(strings[1]), Double.parseDouble(strings[2]), new Point(Double.parseDouble(strings[3]), Double.parseDouble(strings[4]))));
                str = reader.readLine();
            }

        return couriers;
    }
}
