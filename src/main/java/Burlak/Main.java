package Burlak;

import Burlak.IO.InputDataOrder;
import Burlak.IO.InputDataCourier;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        InputDataOrder inputDataOrder = new InputDataOrder();
        InputDataCourier inputDataCourier = new InputDataCourier();

        System.out.println(inputDataOrder.getData());

        System.out.println(inputDataCourier.getData(new Schedule()));
    }
}
