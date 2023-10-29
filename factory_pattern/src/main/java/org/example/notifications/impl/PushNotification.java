package org.example.notifications.impl;

import org.example.notifications.Notification;

public class PushNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending Push Notification");
    }
}
