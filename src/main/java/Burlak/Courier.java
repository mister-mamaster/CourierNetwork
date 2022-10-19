package Burlak;

public class Courier {
    private String fio;
    private int id;
    private double speed;
    private Point startPoint;
    private Schedule schedule;


    public Courier() {
        fio = "Ivanov Ivan Ivanich";
        id = 0;
        speed = 0;
        startPoint = new Point();
        schedule = new Schedule();
    }

    public Courier(String fio, int id, double speed, Point startPoint, Schedule schedule) {
        this.fio = fio;
        this.id = id;
        this.speed = speed;
        this.startPoint = startPoint;
        this.schedule = schedule;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "fio='" + fio + '\'' +
                ", id=" + id +
                ", speed=" + speed +
                ", startPoint=" + startPoint +
                ", schedule=" + schedule +
                '}';
    }
}
