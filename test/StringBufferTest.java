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
    	assertEquals(10, buffer.contentCapacity());
    }
    
    @Test
    public void testAddContentWithinCapacity()
    {
    	preconditions();
    	buffer.addContent("Eytan");
    	assertEquals("Eytan", buffer.getContent());
    	assertEquals(10, buffer.contentCapacity());
    	assertEquals(5, buffer.contentLength());
    }
    
    @Test
    public void testAddContentOverCapacity()
    {
    	preconditions();
    	buffer.addContent("Eytan Anjel");
    	assertEquals(20, buffer.contentCapacity());
    	assertEquals("Eytan Anjel", buffer.getContent());
    	assertEquals(buffer.contentLength(), 11);
    }
    
    @Test
    public void testAddMultipleContentWithinCapacity()
    {
    	preconditions();
    	buffer.addContent("Eytan");
    	assertEquals("Eytan", buffer.getContent());
    	assertEquals(10, buffer.contentCapacity());
    	assertEquals(5, buffer.contentLength());
    	buffer.addContent("Anjel");
    	assertEquals("EytanAnjel", buffer.getContent());
    	assertEquals(10, buffer.contentCapacity());
    	assertEquals(10, buffer.contentLength());
    }
    
    @Test
    public void testAddMultipleContentOverCapacity()
    {
    	preconditions();
    	buffer.addContent("Eytan");
    	assertEquals("Eytan", buffer.getContent());
    	assertEquals(10, buffer.contentCapacity());
    	assertEquals(5, buffer.contentLength());
    	buffer.addContent("Anjel Pro");
    	assertEquals("EytanAnjel Pro", buffer.getContent());
    	assertEquals(20, buffer.contentCapacity());
    	assertEquals(14, buffer.contentLength());
    }
    
    @Test
    public void testAddMultipleContentWithSecondContentMoreThanTheCapacity()
    {
    	preconditions();
    	buffer.addContent("Eytan");
    	assertEquals("Eytan", buffer.getContent());
    	assertEquals(10, buffer.contentCapacity());
    	assertEquals(5, buffer.contentLength());
    	buffer.addContent("Anjel is a TDD practicing Programmer");
    	assertEquals("EytanAnjel is a TDD practicing Programmer", buffer.getContent());
    	assertEquals(80, buffer.contentCapacity());
    	assertEquals(41, buffer.contentLength());
    }

}
