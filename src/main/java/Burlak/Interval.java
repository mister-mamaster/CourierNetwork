package Burlak;

public class Interval {
    private int begin, end;

    public Interval() {
        this.begin = 0;
        this.end = 0;
    }

    public Interval(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return begin + " - " + end;
    }

    public int duration(){
        return end - begin;
    }
}
