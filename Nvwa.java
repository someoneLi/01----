package lijingrong;

public class Nvwa {
	public static People makepeople(String sex)
	{
	if(sex.equalsIgnoreCase("����"))
	{
	return new Man();
	}
	if(sex.equalsIgnoreCase("Ů��"))
	{
	return new Woman();
	}
	if(sex.equalsIgnoreCase("������"))
	{
	return new Robot();
	}
	else
	{
	return null;
	}
	}
}
