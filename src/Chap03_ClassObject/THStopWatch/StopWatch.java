package Chap03_ClassObject.THStopWatch;

public class StopWatch {

    private long startTime;
    private long endTime;

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getEndTime() {
        return endTime;
    }

    //phuong thuc khoi tao
    public StopWatch() {
        this.startTime = System.currentTimeMillis();    //start la time cua he thong
    }

    //method start: reset start ve time he thong
    public long start(long startTime) {
        return System.currentTimeMillis();
    }

    //method stop: cai dat endTime ve time cua he thong
    public long stop(long endTime) {
        return System.currentTimeMillis();
    }

    //tra ve time vua troi qua
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
