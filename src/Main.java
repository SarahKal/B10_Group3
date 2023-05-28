import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.PrintWriter;
public class Main {

  
        public static void main(String[] args) throws FileNotFoundException {
            
        
        //Declare scanner
        Scanner read = new Scanner(System.in); 
            
        
        //---------------------------------------------------------------
        
         //Print welcome message
        System.out.println("	Welcome to SANAD " );  
        
        //Renad code

       int selectin;
       // Display the menu options to the user
       System.out.println("1 Custmer\n 2 Freelancer\n 3 Admin");
       selectin= read.nextInt();
       switch(selectin){
         //--------------------------------------------------------------- AS a Custmer
           case 1:
               System.out.println('\n'+"     Select Options:");
               System.out.println("1 Place order\n 2 Review");

               if (selectin == 1){
                System.out.println(); 
               }
               
              else if (selectin == 2){
                System.out.println();
              }
              
              else {
               System.out.println("Wrong input");
              }
               break;
               
         //--------------------------------------------------------------- AS a Freelancer
           case 2:
                System.out.println('\n'+"     Select Options:");
                System.out.println("1 Place order\n 2 Review\n 3 Post announcement ");
                
                  if (selectin == 1){
                System.out.println();
               }
                  
              else if (selectin == 2){
                System.out.println();
              }
              
               else if (selectin == 3){
               System.out.println();
              }
               
              else {
               System.out.println("Wrong input");
              }
                break;
                
          //--------------------------------------------------------------- AS an Administrator
           case 3: 
                System.out.println('\n'+"     Select Options:");
                System.out.println("1 Generate report ");
                
                 if (selectin == 1){
                System.out.println();
                 }
                 
                 else {
               System.out.println("Wrong input");
               }
              
               break;            
               
           default:
              System.out.println("Error");
               break; 
       
       
       
       
       
       
       }
            
        
        
        
        
        
      
        
        
          

       
    }
          
          public void generateReport(Customer customer,Freelancer freelancer,Order order,Service service,Payment payment ) throws FileNotFoundException {
  
        File outputfile=new File("AdminReport.txt");
        PrintWriter report= new PrintWriter(outputfile);
        report.println("-----------ADMIN REPORT-----------");
        report.println("--ORDER DATA--");
        report.println("ORDER NUMBER : "+order.OrderNumber);
        report.println("ORDER STATUS : "+order.OrderStatus);
        report.println();// for order date 
        report.println("--SERVICE DATA--");
        report.println("SERVICE NAME : "+service.ServiceName);
        report.println("--CUSTOMER DATA--");
        report.println("CUSTOMER NAME : "+customer.customerName);
        report.println("CUSTOMER ID : "+customer.customerID);
        report.println("CUSTOMER EMAIL : "+customer.customerEmail);
        report.println("--FREELANCER DATA--");
        report.println("FREELANCER NAME : "+freelancer.FreelancerName);
        report.println("FREELANCER ID : "+freelancer.FreelancerID);
        report.println("FREELANCER EMAIL : "+freelancer.FreelancerEmail);
        report.println("--PAYMENT DATA--");
        report.println();
        //i want to add somthing telling the price of the service 
        report.println("----------END OF THE REPORT----------");
        report.close();
   
   System.out.println("Report generated successfully.");
}
          
          public static void placeOrder (Scanner read) throws FileNotFoundException{
        System.out.println("              Hello dear Customer , Welcome to Sanad!                 ");
        System.out.println("     From here you can choose whatever services you wish to order     ");
        System.out.println("**********************************************************************"+'\n');
        //------------------------------------------------------------------------------------------------------------------ displaying menu
        // Display the menu options to the user
        System.out.println(" - Services menu Options:");
        System.out.println("1 Programming\n 2 Photography\n 3 Music\n 4 Audio\n 5 Video\n 6 Animation\n 7 Writing\n 8 Translation\n 9 Graphics");

        //--------------------------------------------------------------------------------------------------------------------- selection
        // Prompt the user to select an item from the menu
        System.out.print('\n'+"  - Please enter your selection: ");
        String userSelection = read.nextLine();
        
         // if statement for the selection   
            
            
        
        //--------------------------------------------------------------------------------------------------------------------- payment
        System.out.print("     Great choice, Would you like to proceed to checkout? [ Yes or No] ");

        String userPaymentApproval = read.next(); 
        if ( userPaymentApproval.equalsIgnoreCase("Yes") && userPaymentApproval.equalsIgnoreCase("yes") )
        {   
            // Display the payment options to the user
            System.out.println('\n'+"     Payment Options:");
            System.out.println("1 ApplePay\n 2  credit cards");
            // Prompt the user to select a payment method
            System.out.print('\n'+"    Please enter your payment method: ");
            String paymentMethod = read.next();
            //--------------------------------------------------------------------------------------------------------------- closing with payment
// Display order summary to the user
System.out.println('\n'+"********************* Thank you for your order! *********************");
System.out.println("*********************************************************************");
System.out.println("   - You ordered option " + userSelection);
System.out.println("   - Your payment method is " + paymentMethod);

//--------------------------------------------------------------------------------------------------------------- end
        }else if ( userPaymentApproval.equalsIgnoreCase("No") && userPaymentApproval.equalsIgnoreCase("no")){
            System.out.println("************ Thank you for visiting Sanad Website *****************");
            System.out.println("************ we hope that you enjoyed your experience<3 *************");
        }else System.out.println("Wrong input");
        }
          
          
          
          public static Service postServiceAnnouncement(Scanner read){
              System.out.println("Enter the Service Name:");
              String Sname = read.next();
              System.out.println("Enter the number of the service category:");
              System.out.println("1 Programming\n 2 Photography\n 3 Music\n 4 Audio\n 5 Video\n 6 Animation\n 7 Writing\n 8 Translation\n 9 Graphics");
              String Scategory = read.next();
              Service s = new Service(Sname,Scategory);
            return null;
              
          }
          
          
              public static void Review (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Rate the service (1-5):");
        int rating = scanner.nextInt();

        if (rating >= 1 && rating <= 5) {
            System.out.print("Star rating: ");
            for (int i = 0; i < rating; i++) {
                System.out.print("★");
            }
        } else {
            System.out.println("Invalid rating. Please enter a number between 1 and 5.");
        }

        scanner.close();
    }
}
          
          
       

