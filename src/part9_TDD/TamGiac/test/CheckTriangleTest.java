import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckTriangleTest {

    @Test
    void testCheckTriangle1() {
        CheckTriangle checkTriangle =new CheckTriangle(2,2,2);
        String result =checkTriangle.checkTriangle();
        String expected="1";
        assertEquals(expected,result);
    }
    @Test
    void testCheckTriangle2() {
        CheckTriangle checkTriangle =new CheckTriangle(2,2,3);
        String result =checkTriangle.checkTriangle();
        String expected="2";
        assertEquals(expected,result);
    }
    @Test
    void testCheckTriangle3() {
        CheckTriangle checkTriangle =new CheckTriangle(3,4,5);
        String result =checkTriangle.checkTriangle();
        String expected="3";
        assertEquals(expected,result);
    }
    @Test
    void testCheckTriangle0() {
        CheckTriangle checkTriangle =new CheckTriangle(0,1,1);
        String result =checkTriangle.checkTriangle();
        String expected="0";
        assertEquals(expected,result);
    }
    @Test
    void testCheckTriangle01() {
        CheckTriangle checkTriangle =new CheckTriangle(-1,2,1);
        String result =checkTriangle.checkTriangle();
        String expected="0";
        assertEquals(expected,result);
    }
    @Test
    void testCheckTriangle03() {
        CheckTriangle checkTriangle =new CheckTriangle(8,2,3);
        String result =checkTriangle.checkTriangle();
        String expected="0";
        assertEquals(expected,result);
    }
}