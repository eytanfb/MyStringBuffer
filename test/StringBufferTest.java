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
    
    @Test
    public void testAddMultipleContentWithinCapacity()
    {
    	preconditions();
    	buffer.addContent("Eytan");
    	assertEquals("Eytan", buffer.getContent());
    	assertTrue(buffer.contentCapacity() == 10);
    	assertEquals(5, buffer.contentLength());
    	buffer.addContent("Anjel");
    	assertEquals("EytanAnjel", buffer.getContent());
    	assertTrue(buffer.contentCapacity() == 10);
    	assertEquals(10, buffer.contentLength());
    }
    
    @Test
    public void testAddMultipleContentOverCapacity()
    {
    	preconditions();
    	buffer.addContent("Eytan");
    	assertEquals("Eytan", buffer.getContent());
    	assertTrue(buffer.contentCapacity() == 10);
    	assertEquals(5, buffer.contentLength());
    	buffer.addContent("Anjel Pro");
    	assertEquals("EytanAnjel Pro", buffer.getContent());
    	assertTrue(buffer.contentCapacity() == 20);
    	assertEquals(14, buffer.contentLength());
    }
    
    @Test
    public void testAddMultipleContentWithSecondContentMoreThanTheCapacity()
    {
    	preconditions();
    	buffer.addContent("Eytan");
    	assertEquals("Eytan", buffer.getContent());
    	assertTrue(buffer.contentCapacity() == 10);
    	assertEquals(5, buffer.contentLength());
    	buffer.addContent("Anjel is a TDD practicing Programmer");
    	assertEquals("EytanAnjel is a TDD practicing Programmer", buffer.getContent());
    	assertTrue(buffer.contentCapacity() == 80);
    	assertEquals(41, buffer.contentLength());
    }

}
