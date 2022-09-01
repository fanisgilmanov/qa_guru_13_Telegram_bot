package test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class FailedTest {
    @Test
    void tes01(){
        assertFalse(5 >  2);
    }

    @Test
    void tes02(){
        assertFalse(10 >  7);
    }
    @Test
    void tes03(){
        assertFalse(12 >  7);
    }
    @Test
    void tes04(){
        assertFalse(13 > 7);
    }
}
