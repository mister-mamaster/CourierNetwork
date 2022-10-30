package Burlak;

public class Order {
    private int id;
    private Point startPoint, finishPoint;
    private Interval exInter;
    private Assignment assignment;

    public Order() {
        this.id = 0;
        this.startPoint = new Point();
        this.finishPoint = new Point();
        this.exInter = new Interval();
        this.assignment = null;
    }

    public Order(int id, Point startPoint, Point finishPoint, Interval exInter, Assignment assignment) {
        this.id = id;
        this.startPoint = startPoint;
        this.finishPoint = finishPoint;
        this.exInter = exInter;
        this.assignment = assignment;
        assignment.setOrder(this);
    }

    public Order(int id, Point startPoint, Point finishPoint, Interval exInter) {
        this.id = id;
        this.startPoint = startPoint;
        this.finishPoint = finishPoint;
        this.exInter = exInter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getFinishPoint() {
        return finishPoint;
    }

    public void setFinishPoint(Point finishPoint) {
        this.finishPoint = finishPoint;
    }

    public Interval getExInter() {
        return exInter;
    }

    public void setExInter(Interval exInter) {
        this.exInter = exInter;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", startPoint=" + startPoint +
                ", finishPoint=" + finishPoint +
                ", exInter=" + exInter +
                ", assignment=" + assignment +
                '}';
    }
    
    public boolean haveAssignment(){
        return this.assignment != null;
    }
}
