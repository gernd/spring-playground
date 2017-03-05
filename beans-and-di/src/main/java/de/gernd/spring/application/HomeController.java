package de.gernd.spring.application;

import de.gernd.spring.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private SessionInfo sessionInfo;

    @RequestMapping("/")
    public void home() {
        System.out.println(sessionInfo);

        notificationService.notify("Tom", "controller has been invoked");
    }
}
