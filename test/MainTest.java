
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
    String input = "0\nYes\n2\n";
    ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
    Scanner scanner = new Scanner(inputStream);
    ArrayList<Order> orders = new ArrayList<>();
    ArrayList<Service> services = new ArrayList<>();
    Service service = new Service("Test Service", "1");
    services.add(service);
    Main.placeOrder(scanner, orders, services);
    assertEquals(1, orders.size());
    assertEquals("Test Service", orders.get(0).getOrderName());
    assertEquals("2", orders.get(0).getPaymentMethod());
    
    }

    /**
     * Test of postServiceAnnouncement method, of class Main.
     */
    @Test
    public void testPostServiceAnnouncement() {
    ArrayList<Service> services = new ArrayList<Service>();
    ByteArrayInputStream inputStream = new ByteArrayInputStream("Test Service\n1\n".getBytes());
    Scanner scanner = new Scanner(inputStream);
    Main.postServiceAnnouncement(scanner,services);
    System.out.println("services size: " + services.size());
System.out.println("services: " + services.toString());
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
