


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

    Object getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

    Object getCategory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
