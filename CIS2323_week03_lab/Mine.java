import mystuff.*;
import Lab2.*;
public class Mine {
	public static void main (String[] args)
	{
		Lamp myLamp= new Lamp();
		System.out.println("This is my lamp. MINE!");
		myLamp.setColor("Whiteish");
		myLamp.setwatts(45);
		myLamp.turnOn();
		
		System.out.println("Lamp is " + myLamp.IsOn()
		+ "the color is " + myLamp.getColor()
		+ "the watts are " + myLamp.getWatts());
		
		Lamp yourLamp= new Lamp();
		Yours.print();
		System.out.println("This is your lamp. YOURS!");
		
		Lamp otherLamp= new Lamp();
		Others.print();
		System.out.println("This is their lamp. THEIRS!");
		
	}
}