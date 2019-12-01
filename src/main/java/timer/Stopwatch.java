package timer;

public class Stopwatch {
    private long startTime;
    public void Start() {
        startTime = System.currentTimeMillis();
    }

    public long Stop() {
        return System.currentTimeMillis() - startTime;
    }
}
