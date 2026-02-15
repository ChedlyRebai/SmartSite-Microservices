package com.smartsite.notification.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void handleTTaskAssignment(TaskAssigneEvent event) {
        System.out.println("Received message: " + event.getTaskId() + " assigned to worker " + event.getWorkerId() + " for project " + event.getProjectId());
        
    }
}