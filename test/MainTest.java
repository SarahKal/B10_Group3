
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author sarahkalfoot
 */
public class MainTest {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
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
        Main.postServiceAnnouncement(scanner,services);
        assertEquals(1, services.size());
        assertEquals("Test Service", services.get(0).getServiceName());
        assertEquals("1", services.get(0).getServiceCategory());
    }

    /**
     * Test of Review method, of class Main.
     */
    @Test
    public void testReview() {
        String input = "3\n";
        String expectedOutput =  "Rate the service (1-5):\n" +"Star rating: ★★★";        
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        Main.Review(scanner);
        String actualOutput = outputStream.toString().trim();
        assertEquals(expectedOutput, actualOutput);
    }

    
}
