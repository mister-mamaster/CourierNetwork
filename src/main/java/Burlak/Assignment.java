package Burlak;

public class Assignment {
    private Courier courier;
    private Order order;
    private Point start;
    private Interval interval;
    private double length;

    public Assignment() {
        this.length = 0;
    }

    public Assignment(Courier courier, Order order, Point start, Interval interval, double length) {
        this.courier = courier;
        this.order = order;
        order.setAssignment(this);
        this.start = start;
        this.interval = interval;
        this.length = length;
    }


    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Interval getInterval() {
        return interval;
    }

    public void setInterval(Interval interval) {
        this.interval = interval;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                this.courier.getFio() + ", " +
                this.order.getId() + ", " +
                this.interval.duration() +
                '}';
    }
}
