import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea() {
        Rectangle r = new Rectangle(2,3);
        assertEquals(r.getArea(), 6.0, 0.1);
    }

    @Test
    void getDiagonal() {
        Rectangle s = new Rectangle(3,4);
        assertEquals(s.getDiagonal(), 5, 0.001);
    }

    @Test
    void getWidth() {
        Rectangle t = new Rectangle(5,6);
        assertEquals(t.getWidth(), 5);
    }

    @Test
    void getHeight() {
        Rectangle u = new Rectangle(7,8);
        assertEquals(u.getHeight(), 8);
    }
}