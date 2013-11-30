
public class MyStringBuffer
{
	private char[] content;
	private int capacity;
	
	public MyStringBuffer()
	{
		content = new char[10];
		capacity = 10;
	}
	
	public String getContent()
	{
		return String.valueOf(content).trim();
	}
	
	public int contentCapacity()
	{
		return capacity;
	}

	public void addContent(String contentToAdd)
	{
		if(contentToAdd.length() > capacity)
		{
			content = new char[capacity*2];
			capacity *= 2;
		}
		char[] newContent = contentToAdd.toCharArray();
		for(int i = 0; i < newContent.length; i++)
		{
			content[i] = newContent[i];
		}
	}

	public int contentLength()
	{
		return getContent().length();
	}
}
