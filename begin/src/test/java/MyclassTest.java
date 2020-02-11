import org.junit.Test;

import static org.junit.Assert.*;

public class MyclassTest {
    @Test
    public void testLink(){
        Myclass <Integer> listInstance=new Myclass();
//        assertEquals(null,listInstance.popFromEnd());
        listInstance.insertNodeatEnd(1);
        listInstance.insertNodeatEnd(2);
        assertEquals("1=2",listInstance.showList());
    }
    @Test
    public void testEmpty(){
        Myclass <Integer> listInstance=new Myclass();
        assertEquals(null,listInstance.popFromEnd());
    }
}