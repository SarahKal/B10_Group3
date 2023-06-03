
import java.util.ArrayList;
import java.util.Scanner;


public class Service {
  String  ServiceName;
  String ServiceCategory; 


 public String getServiceName() {
        return ServiceName;
    } 
 
  public void setServiceName(String FreelancerID) {
        this.ServiceName = ServiceName;
    }
 
  public String getServiceCategory() {
        return  ServiceCategory;
    } 
 
  public void setServiceCategory(String FreelancerID) {
        this.ServiceCategory =  ServiceCategory;  
    }
  
   public Service(String ServiceName, String ServiceCategory) {
        this.ServiceName = ServiceName;
        this.ServiceCategory = ServiceCategory;
    }
            public static void postServiceAnnouncement(Scanner read, ArrayList<Service> Services){
            System.out.println("Enter the Service Name:");
            String Sname = read.next();
            System.out.println("Enter the number of the service category:");
            System.out.println("1 Programming\n 2 Photography\n 3 Music\n 4 Audio\n 5 Video\n 6 Animation\n 7 Writing\n 8 Translation\n 9 Graphics");
            String Scategory = read.next();
            Services.add(new Service(Sname, Scategory));           
          }
}
