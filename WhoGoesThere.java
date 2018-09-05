public class WhoGoesThere
{
	public static void (String arg[])
	{
		String FirstName;
		String LastName;
		int age;
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("User what is your First name?");
		FirstName = inputDevice.nextLine();
		System.out.println("User what is your Last name?");
		LastName=inputDevice.nextLine();
		System.out.println("User what is your age?");
		age = inputDevice.nextLine();
		age = age - 10;
		System.out.println("As long as your age is more than" +  age ); 
		System.out.println("The you dear " + firstname + " " + lastname + " may pass");
	}
}