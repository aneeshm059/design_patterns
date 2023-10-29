package org.example.notifications.impl;

import org.example.notifications.Notification;

public class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending SMS Notification");
    }
}
