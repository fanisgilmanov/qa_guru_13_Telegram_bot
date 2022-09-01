package test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class PositiveTest {
    @Test
    void tes01(){
        assertTrue(5 > 2);
    }

    @Test
    void tes02(){
        assertTrue(10 > 7);
    }
    @Test
    void tes03(){
        assertTrue(12 > 7);
    }
    @Test
    void tes04(){
        assertTrue(13 > 7);
    }
    @Test
    void tes05(){
        assertTrue(15 > 7);
    }
}
