import static org.junit.Assert.*;
import org.junit.*;
public class skilldemoTest {
    @Test
    public void testMulti(){
        assertEquals(6, skilldemo.multiply(3, 3)); // fail first
    }
}
