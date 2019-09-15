public class Stopwatch {
	private long startTime;
	private long endTime;
	
	Stopwatch() {
		startTime = System.currentTimeMillis();
	}
	
	void start() {
		startTime = System.currentTimeMillis();
	}
	
	void stop() {
		endTime = System.currentTimeMillis();
	}
	
	long getStartTime() {
		return startTime;
	}
	
	long getEndTime() {
		return endTime;
	}
	
	long getElapsedTime() {
		return endTime - startTime;
	}
}
