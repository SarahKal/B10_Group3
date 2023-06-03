
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sarahkalfoot
 */
public class MainTest {
    
    public MainTest() {
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

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateReport method, of class Main.
     */
    @Test
    public void testGenerateReport() throws Exception {
        System.out.println("generateReport");
        ArrayList<Service> Services = null;
        ArrayList<Order> Orders = null;
        Main.generateReport(Services, Orders);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of placeOrder method, of class Main.
     */
    @Test
    public void testPlaceOrder() {
        System.out.println("placeOrder");
        Scanner read = null;
        ArrayList<Order> Orders = null;
        ArrayList<Service> Services = null;
        Main.placeOrder(read, Orders, Services);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of postServiceAnnouncement method, of class Main.
     */
    @Test
    public void testPostServiceAnnouncement() {
        ArrayList<Service> services = new ArrayList<Service>();
        Scanner scanner = new Scanner("Test Service\n1\n");
        postServiceAnnouncement(scanner,services);
        assertEquals(1, services.size());
        assertEquals("Test Service", services.get(0).getServiceName());
        assertEquals("1", services.get(0).getServiceCategory());
    }

    /**
     * Test of Review method, of class Main.
     */
    @Test
    public void testReview() {
        System.out.println("Review");
        Scanner read = null;
        Main.Review(read);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
