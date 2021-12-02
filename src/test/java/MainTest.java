import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void squartest(){
        assertEquals(4.0, Main.square(2.0)); //Smoke Test
    }
    @Test
    void addtest(){
        assertEquals(6,Main.add(2,4));
    }
    @Test
    void groesserhunderttest(){
        assertEquals(true, Main.groesserhundert(100));
        assertEquals(true, Main.groesserhundert(101));
        assertEquals(false, Main.groesserhundert(99));
    }
}
