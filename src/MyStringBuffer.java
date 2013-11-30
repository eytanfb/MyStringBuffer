
public class MyStringBuffer
{
	private char[] content;
	
	public MyStringBuffer()
	{
		content = new char[10];	
	}
	
	public String getContent()
	{
		return String.valueOf(content).trim();
	}
	
	public int contentCapacity()
	{
		return content.length;
	}

	public void addContent(String contentToAdd)
	{
		char[] newContent = contentToAdd.toCharArray();
		for(int i = 0; i < newContent.length; i++)
		{
			content[i] = newContent[i];
		}
	}

	public int getContentLength()
	{
		return getContent().length();
	}
}
