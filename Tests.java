import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    public void Test1() {
        String testOutput = Main.calc(1,3,3);
        System.out.println(testOutput);
        System.out.println("-------------------------------------------------------------------------------------");
        Assertions.assertEquals("0.33", testOutput);
    }
}
