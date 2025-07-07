//package clock;

public class Clock {
	String time;
	Function hour;
	Function minute;
	Function second;
	String m;
	
	public Clock(int hour, int minute, int second) {
		this.hour=new Function(hour, 14);
		this.minute=new Function(minute, 60);
		this.second=new Function(second, 60);
		time=this.hour+":"+this.minute+":"+this.second;
	}
	
	public void AP(int choose) {
		if(choose==1)
			m=" AM";
		if(choose==2)
			m=" PM";
	}
	
	public void tick() {
		second.increment();
		
		if(second.getValue()==0) {
			minute.increment();
			
			if(minute.getValue()==0) {
				hour.increment();
				
				if(hour.getValue()==12) {
					if(m==" AM")
						m=" PM";
					else if(m==" PM")
						m=" AM";
				}
				if(hour.getValue()==13)
					hour.setValue(1);
				
				
				//play( h,  mint,  s,  choose);
			}
		}
		time=hour.display()+":"+minute.display()+":"+second.display()+m;
	}
	
	public boolean play(int h, int mint, int s, int choose) {
		String n="";
		if(choose==1)
			n=" AM";
		else if(choose==2)
			n=" PM";
		if(hour.getValue()==h && minute.getValue()==mint && second.getValue()==s && n==m) {
			return true;
		}
		return false;
	}
	
	public void Display() {
		System.out.println(time);
	}
}