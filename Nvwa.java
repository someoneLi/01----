package lijingrong;

public class Nvwa {
	public static People makepeople(String sex)
	{
	if(sex.equalsIgnoreCase("男人"))
	{
	return new Man();
	}
	if(sex.equalsIgnoreCase("女人"))
	{
	return new Woman();
	}
	if(sex.equalsIgnoreCase("机器人"))
	{
	return new Robot();
	}
	else
	{
	return null;
	}
	}
}
