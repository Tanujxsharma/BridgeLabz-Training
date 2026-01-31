package streamApi;

import java.util.*;

public class WelcomeMessage {
    public static void main(String[] args) {

        List<String> attendees = Arrays.asList("Amit", "Neha", "Rohit","Shivam","Priya");

        attendees.forEach(name ->System.out.println("Welcome to BridgeLabz, " + name + "!"));
    }
}