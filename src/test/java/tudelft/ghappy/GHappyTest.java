package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    void testHappy() {
        GHappy gHappy = new GHappy();
        Assertions.assertTrue(gHappy.gHappy("xxggxx"));
        Assertions.assertFalse(gHappy.gHappy("xxgxx"));
        Assertions.assertFalse(gHappy.gHappy("xxggyygxx"));
        Assertions.assertFalse(gHappy.gHappy("g"));
    }
}
