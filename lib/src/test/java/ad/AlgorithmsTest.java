package ad;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {
    @Test void someAlgorithmsMethodReturnsTrue() {
        Algorithms classUnderTest = new Algorithms();
        assertTrue(classUnderTest.someAlgorithmsMethod(), "someLibraryMethod should return 'true'");
    }
}
