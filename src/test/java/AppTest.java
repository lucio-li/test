

import com.jenkins.App;
import com.jenkins.App2;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName ) {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
	    public void testApp() {
	        assertTrue( true );
	        App app = new App();
	        app.max(5, 4);
	    }
	    public void testApp2() {
	        assertTrue( true );
	        App2 app2 = new App2();
	        app2.max(5, 4);
	    }
	    public void testApp3() {
	        assertTrue( true );
	        App2 app2 = new App2();
	        app2.max(5, 4);
	    }
	    public void testApp4() {
	        assertTrue( true );
	        App2 app2 = new App2();
	        app2.max(5, 4);
	        app2.max(4, 5);
	        app2.min(4, 5);
	        app2.max(5, 4);
	    }
    public void testApp5() {
        assertTrue( true );
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
