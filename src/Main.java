
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.PrintWriter;
import java.util.ArrayList;
public class Main {

    
    
        public static void main(String[] args) throws FileNotFoundException{
            
        
        //Declare scanner
        Scanner read = new Scanner(System.in); 
            
        
        //---------------------------------------------------------------
        ArrayList<Service> Services = new ArrayList<>();
        ArrayList<Order> Orders = new ArrayList<>();

     
         //Print welcome message
       System.out.println("              Welcome to SANAD " );  
       int selectin;
       // Display the menu options to the user
            
       while (true) {                
        System.out.println(" \n    Select one of the following options ");
                System.out.println(" 1 Custmer\n 2 Freelancer\n 3 Admin\n 4 Exit");
                selectin= read.nextInt();
       
       switch(selectin){
         //AS a Custmer
           case 1:
               System.out.println('\n'+"   Custmer Menu:");
               System.out.println("1 Place order\n 2 Review");
               selectin= read.nextInt();

               if (selectin == 1){
                placeOrder(read,Orders,Services);
                System.out.println(); 
               }
               
              else if (selectin == 2){
                  Review(read);
                System.out.println();
              }
              
              else {
               System.out.println("Wrong input");
              }
               break;
               
         // AS a Freelancer
           case 2:
                System.out.println('\n'+"     Freelancer Menu:");
                System.out.println("1 Place order\n 2 Review\n 3 Post announcement ");
               selectin= read.nextInt();

                  if (selectin == 1){
                placeOrder(read,Orders,Services);
                System.out.println();
               }
                  
              else if (selectin == 2){
                Review(read);
                System.out.println();
              }
              
               else if (selectin == 3){
               postServiceAnnouncement(read,Services);
               System.out.println();
              }
               
              else {
               System.out.println("Wrong input");
              }
                break;
                
          // AS an Administrator
           case 3: 
                System.out.println('\n'+"     Admin Menu:");
                System.out.println("1 Generate report ");
               selectin= read.nextInt();
                 if (selectin == 1){
                generateReport(Services,Orders);
                  System.out.println();

                 }
                 
                 else {
               System.out.println("Wrong input");
               }
              
               break;
               
               case 4:
                System.out.println("Exiting program...");
                System.exit(0);
                break;
               default:
                    System.out.println("Invalid choice. Please try again.");       
       }
       
        }
        }
        
          
        public static void generateReport( ArrayList<Service> Services,ArrayList<Order> Orders ) throws FileNotFoundException {
  
        File outputfile=new File("AdminReport.txt");
        PrintWriter report= new PrintWriter(outputfile);
        report.println("-----------ADMIN REPORT-----------");
        for(Order order: Orders){
        report.println("--ORDER DATA--");
        report.println("ORDER NUMBER : "+order.OrderNumber);
        report.println("ORDER STATUS : "+order.OrderStatus);
        report.println("ORDER DATE : "+order.OrderDate);// for order date    
        }
        for (Service service:Services){
           report.println("--SERVICE DATA--");
        report.println("SERVICE NAME : "+service.ServiceName); 
        }
        report.println("----------END OF THE REPORT----------");
        report.close();
   
   System.out.println("Report generated successfully.");

}
        
        //------------------------------------------------------------------------------------------------------------------ displaying menu

          
        public static void placeOrder (Scanner read,ArrayList<Order> Orders,ArrayList<Service> Services){
        System.out.println("              Hello dear Customer , Welcome to Sanad!                 ");
        System.out.println("     From here you can choose the services you wish to order     ");
        System.out.println("**********************************************************************"+'\n');
        //------------------------------------------------------------------------------------------------------------------ displaying menu
        // Display the menu options to the user
        System.out.println(" - Services menu Options:");
        //Checking if there are no Services avilble first
        if(Services.isEmpty()){
             System.out.println(" - Sorry there are no Services avalible right now please check later");
             System.exit(0);
        }
        else{
        for (Service element : Services) {
            System.out.println(element.getServiceName());
        }
        //--------------------------------------------------------------------------------------------------------------------- selection
        // Prompt the user to select an item from the menu
        System.out.print('\n'+"  - Please enter your selection: ");
        int userSelection = read.nextInt();
        Service selectedObject = Services.get(userSelection);
        //--------------------------------------------------------------------------------------------------------------------- payment
        System.out.print("    Great choice, Would you like to proceed to checkout? [ Yes or No] ");

        String userPaymentApproval = read.next(); 
        if ( userPaymentApproval.equalsIgnoreCase("Yes"))
        {   
            // Display the payment options to the user
            System.out.println('\n'+"     Payment Options:");
            System.out.println(" 1 ApplePay\n 2 credit cards");
            // Prompt the user to select a payment method
            System.out.print('\n'+"    Please enter your payment method: ");
            String paymentMethod = read.next();
            Orders.add(new Order(Services.get(userSelection).getServiceName(),paymentMethod));
            //--------------------------------------------------------------------------------------------------------------- closing with payment
// Display order summary to the user
System.out.println('\n'+"********************* Thank you for your order! *********************");
System.out.println("*********************************************************************");
System.out.println("   - You ordered " + selectedObject.getServiceName());
System.out.println("   - Your payment method is " + paymentMethod);

//--------------------------------------------------------------------------------------------------------------- end
        }else if ( userPaymentApproval.equalsIgnoreCase("No")){
            System.out.println("************ Thank you for visiting Sanad Website *****************");
            System.out.println("************ we hope that you enjoyed your experience<3 *************");
        }else System.out.println("Wrong input");
        }
          }  
        
        //------------------------------------------------------------------------------------------------------------------ displaying menu

        
           public static void postServiceAnnouncement(Scanner read, ArrayList<Service> Services) {
    System.out.println("Enter Service Name:");
    String Sname = read.next();
    System.out.println("Enter the number of the service category:");
    System.out.println("1 Programming\n 2 Photography\n 3 Music\n 4 Audio\n 5 Video\n 6 Animation\n 7 Writing\n 8 Translation\n 9 Graphics");
    int ScategoryCode = read.nextInt(); // Read the category code as an integer
    String Scategory = getCategoryName(ScategoryCode); // Map the category code to the category name
    Services.add(new Service(Sname, Scategory)); 
    System.out.println('\n'+"********************* Thank you for your choosing SANAD! *********************");
    System.out.println("************ Your service announcement has been posted!  *************");
}

public static String getCategoryName(int categoryCode) {
    switch (categoryCode) {
        case 1:
            return "Programming";
        case 2:
            return "Photography";
        case 3:
            return "Music";
        case 4:
            return "Audio";
        case 5:
            return "Video";
        case 6:
            return "Animation";
        case 7:
            return "Writing";
        case 8:
            return "Translation";
        case 9:
            return "Graphics";
        default:
            return "";
    }
}
        //------------------------------------------------------------------------------------------------------------------ displaying menu

        public static void Review (Scanner read) {

        System.out.println("Rate the service (1-5):");
        int rating = read.nextInt();

        if (rating >= 1 && rating <= 5) {
            System.out.print("Star rating: ");
            for (int i = 0; i < rating; i++) {
                System.out.print("★");
                
            }
            System.out.println('\n'+"********************* Thank you for your Rating SANAD services! *********************");
            
        } else {
            System.out.println("Invalid rating. Please enter a number between 1 and 5.");
        }

   
    }
}
          
          
       

