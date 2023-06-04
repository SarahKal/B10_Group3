public class Service {
    String ServiceName;
    private String ServiceCategory;

    public Service(String ServiceName, String ServiceCategory) {
        this.ServiceName = ServiceName;
        this.ServiceCategory = ServiceCategory;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    public String getServiceCategory() {
        return ServiceCategory;
    }

    public void setServiceCategory(String ServiceCategory) {
        this.ServiceCategory = ServiceCategory;
    }
}