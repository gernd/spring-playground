package de.gernd.spring.services;

import org.springframework.stereotype.Service;

@Service("My Notification Service")
public class NotificationService {

    public void notify(String user, String message) {
        System.out.println("Notification for user " + user + ": " + message);
    }
}
