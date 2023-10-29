package org.example.notifications.impl;

import org.example.notifications.Notification;

public class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending Email Notification");
    }
}
