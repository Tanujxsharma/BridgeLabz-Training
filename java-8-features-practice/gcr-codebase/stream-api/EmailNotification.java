package streamApi;

import java.util.*;

public class EmailNotification {
    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
                "shivam@gmail.com",
                "amit@gmail.com",
                "pankaj@gmail.com",
                "pulkit@gmail.com",
                "priya@gmail.com"
        );

        emails.forEach(email -> sendNotification(email));
    }

    private static void sendNotification(String email) {
        System.out.println("Sending notification email to: " + email);
    }
}