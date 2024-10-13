package com.Gestion_projets.presentation.controlleur;


import com.Gestion_projets.application.service.NotificationService;
import com.Gestion_projets.domain.model.Notification;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class NotificationController {
    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/notifications")
    public List<Notification> getAllNotifications() {
        return notificationService.getListNotification();
    }

    @GetMapping("/notification/{id}")
    public Notification getNotificationById(@PathVariable Long id) {
        return notificationService.getNotificationById(id);
    }

    @PostMapping("/addNotification")
    public Notification notifyProgress(@RequestBody Notification notification) {
        return notificationService.saveNotification(notification);
    }

    @DeleteMapping("/deleteNotification/{id}")
    public void deleteNotification(@PathVariable Long id) {
        notificationService.deleteNotificationById(id);
    }

}
