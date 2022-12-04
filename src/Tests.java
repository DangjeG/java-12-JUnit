import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    public void testEmptyParam(){
        Assertions.assertThrows(NumberFormatException.class, () -> Integer.decode(""));
    }

    @Test
    public void testNegativeParam(){
        Assertions.assertEquals(-10 , Integer.decode("-10"));
    }
    @Test
    public void testPositiveParam(){
        Assertions.assertEquals(10 , Integer.decode("+10"));
    }

    @Test
    public void test0xParam(){
        Assertions.assertEquals(10 , Integer.decode("0xA"));
    }

    @Test
    public void testSharpParam(){
        Assertions.assertEquals(10 , Integer.decode("#A"));
    }
    @Test
    public void testZeroParam(){
        Assertions.assertEquals(10 , Integer.decode("012"));
    }
    @Test
    public void testIllegalPositionParam(){
        Assertions.assertThrows(NumberFormatException.class, () -> Integer.decode("#-1"));
    }
    @Test
    public void testIllegalParam(){
        Assertions.assertThrows(NumberFormatException.class, () -> Integer.decode("ten"));
    }
}
