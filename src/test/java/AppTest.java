

import com.jenkins.App;
import com.jenkins.App2;

import junit.framework.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
   
    /**
     * Rigourous Test :-)
     */
	@org.junit.Test
    public void testApp() {
        App app = new App();
        app.max(5, 4);
    }
	@org.junit.Test
    public void testApp2() {
        App2 app2 = new App2();
        app2.max(5, 4);
    }
	@org.junit.Test
    public void testApp3() {
        App2 app2 = new App2();
        app2.max(5, 4);
    }
	@org.junit.Test
    public void testApp4() {
        App2 app2 = new App2();
        app2.max(5, 4);
        app2.max(4, 5);
        app2.min(4, 5);
        app2.max(5, 4);
    }
	@org.junit.Test
    public void testApp5() {
       // assertTrue( true );
        App2 app2 = new App2();
        app2.max(5, 4);
        app2.max(4, 5);
        app2.min(4, 5);
        app2.min(5, 4);
        App app = new App();
        app2.max(5, 4);
        app2.max(4, 5);
        app2.min(4, 5);
        app2.min(5, 4);
        
    }
}
