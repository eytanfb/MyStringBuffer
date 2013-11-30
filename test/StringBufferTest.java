import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StringBufferTest
{

    private MyStringBuffer buffer;
    
    @Before
    public void setUp()
    {
        buffer = new MyStringBuffer();
    }
    
    @Test
    public void testReturnContentType()
    {
        assertTrue(buffer.getContent() instanceof String);
        assertEquals("", buffer.getContent());
    }
    
    @Test
    public void testAddContentWithinCapacity()
    {
    	assertEquals("", buffer.getContent());
    	assertTrue(buffer.contentCapacity() == 10);
    	buffer.addContent("Eytan");
    	assertEquals("Eytan", buffer.getContent());
    	assertTrue(buffer.contentCapacity() == 10);
    	assertEquals(5, buffer.getContentLength());
    }
    
    @Test
    public void testAddContentOverCapacity()
    {
    	assertEquals("", buffer.getContent());
    	assertTrue(buffer.contentCapacity() == 10);
    	buffer.addContent("Eytan Anjel");
    	assertTrue(buffer.contentCapacity() == 20);
    }

}
