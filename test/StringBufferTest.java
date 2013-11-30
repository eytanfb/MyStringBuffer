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
    
    public void preconditions()
    {
    	assertEquals("", buffer.getContent());
    	assertTrue(buffer.contentCapacity() == 10);
    }
    
    @Test
    public void testAddContentWithinCapacity()
    {
    	preconditions();
    	buffer.addContent("Eytan");
    	assertEquals("Eytan", buffer.getContent());
    	assertTrue(buffer.contentCapacity() == 10);
    	assertEquals(5, buffer.contentLength());
    }
    
    @Test
    public void testAddContentOverCapacity()
    {
    	preconditions();
    	buffer.addContent("Eytan Anjel");
    	assertTrue(buffer.contentCapacity() == 20);
    	assertEquals("Eytan Anjel", buffer.getContent());
    	assertTrue(buffer.contentLength() == 11);
    }

}
