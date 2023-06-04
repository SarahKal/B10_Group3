
public class Freelancer {

    String FreelancerID;
    String FreelancerName;
    String FreelancerEmail;

    public String getFreelancerID() {
        return FreelancerID;
    }

    public void setFreelancerID(String FreelancerID) {
        this.FreelancerID = FreelancerID;
    }

    public String getFreelancerName() {
        return FreelancerName;
    }

    public void setFreelancerName(String FreelancerName) {
        this.FreelancerName = FreelancerName;
    }

    public String getFreelancerEmail() {
        return FreelancerEmail;
    }

    public void setFreelancerEmail(String FreelancerEmail) {
        this.FreelancerEmail = FreelancerEmail;
    }

    public Freelancer(String FreelancerID, String FreelancerName, String FreelancerEmail) {
        this.FreelancerID = FreelancerID;
        this.FreelancerName = FreelancerName;
        this.FreelancerEmail = FreelancerEmail;
    }

    public static void Register() {

    }

    public static void login() {

    }

    @Override
    public String toString() {
        return "Freelancer{" + "FreelancerID=" + FreelancerID + ", FreelancerName=" + FreelancerName + ", FreelancerEmail=" + FreelancerEmail + '}';
    }

}
