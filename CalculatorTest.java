
package assigment.pkg1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testAdd() {
        int x = 0;
        int y = 0;
        Calculator test1 = new Calculator();
        int real=0;
        int result=test1.add(x, y);
        assertEquals(real,result);
    }
@Test
    public void testAdd2() {
        int x = -3;
        int y = 2;
        Calculator test2 = new Calculator();
        int real=-1;
        int result=test2.add(x, y);
        assertEquals(real,result);
    }

    @Test
    public void testDivide() {
     Calculator test2 = new Calculator();
        float real=(float) 0.0;
        float result=test2.divide(1, 0);
        assertEquals(real,result,0.0);
    }
   
     @Test
    public void testDivide3() {
     Calculator test4 = new Calculator();
        float real=(float) 1;
        float result=test4.divide(-9, -9);
        assertEquals(real,result,0.0);
    }
     @Test
    public void testDivide4() {
     Calculator test4 = new Calculator();
        float real=(float) 0;
        float result=test4.divide(0, 0);
        assertEquals(real,result,0.0);
    }
    
    
}
