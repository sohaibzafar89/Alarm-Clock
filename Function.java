//package clock;

public class Function {
	private int value;
	private int limit;
	
	public Function(int value, int limit) {
		this.value=value;
		this.limit=limit;
	}
	
	public void setValue(int value) {
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void increment() {
		value=(value+1)%limit;
	}
	
	public void check() {
		if(value>=limit)
			value=0;
	}
	
	public String display() {
		if(value<10)
			return ("0"+value);
		else
			return(""+value);
	}
}
