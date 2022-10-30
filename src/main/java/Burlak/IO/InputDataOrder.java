package Burlak.IO;

import Burlak.Interval;
import Burlak.Order;
import Burlak.Point;

import java.io.*;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class InputDataOrder {
    public static List<Order> getData() throws IOException, URISyntaxException {
        List<Order> orders = new ArrayList<>();

        try {
            File file = new File(Objects.requireNonNull(InputDataOrder.class.getClassLoader().getResource("Orders.txt")).toURI());
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String str = reader.readLine();

            while (str != null) {

                String[] strings = str.split(" ");

                orders.add(new Order(Integer.parseInt(strings[0]), new Point(Double.parseDouble(strings[1]), Double.parseDouble(strings[2])), new Point(Double.parseDouble(strings[3]), Double.parseDouble(strings[4])), new Interval(Integer.parseInt(strings[5]), Integer.parseInt(strings[6]))));
                str = reader.readLine();
            }

        } catch (IOException e){
            e.printStackTrace();
        }



        return orders;
    }
}
