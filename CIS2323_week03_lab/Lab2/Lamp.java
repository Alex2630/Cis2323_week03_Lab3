package Lab2;


public class Lamp {
	public boolean IsOn=false;
	String color;
	int watts;
	public String isOn()
	{
		if (isOn) {
			System.out.println(" on");
		} else {System.out.println(" off");}
	}
	public void turnOn(){
		isOn = true;
	}
	public void turnOff(){
		isOn = false;
	}
	public void setColor(String c){
		color = c;
	}
	public getColor(){
		return color;
	}
	public void setWatts(int watts){
		watts = w;
	}
	public getWatts(){
		return watts;
	}
}