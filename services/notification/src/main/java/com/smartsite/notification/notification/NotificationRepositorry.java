package com.smartsite.notification.notification;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepositorry extends JpaRepository<Notification,Long> {
    
}
