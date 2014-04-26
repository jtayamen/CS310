//John Tayamen
//CS 310 Assignment 4

public class Tourist {
	private int timeOfArrival;
	private boolean infected;
	private int timeRemaining;
	private int testResult;

	// Constructor
	public Tourist(int timeOfArrival, boolean infected, int timeRemaining,
			int testResult) {
		this.infected = infected;
		this.testResult = testResult;
		this.timeOfArrival = timeOfArrival;
		this.timeRemaining = timeRemaining;
	}

	// Getters and Setters
	public int getTimeOfArrival() {
		return timeOfArrival;
	}

	public void setTimeOfArrival(int timeOfArrival) {
		this.timeOfArrival = timeOfArrival;
	}

	public boolean isInfected() {
		return infected;
	}

	public void setInfected(boolean infected) {
		this.infected = infected;
	}

	public int timeRemaining() {
		return timeRemaining;
	}

	public void timeRemaining(int timeRemaining) {
		this.timeRemaining = timeRemaining;
	}
}
