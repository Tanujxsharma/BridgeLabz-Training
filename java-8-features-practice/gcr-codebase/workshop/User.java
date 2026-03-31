package workshop;

public class User {

    String userName;
    String from;
    String to;
    String serviceType;

    public User(String userName, String from, String to, String serviceType) {
        this.userName = userName;
        this.from = from;
        this.to = to;
        this.serviceType = serviceType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
}
