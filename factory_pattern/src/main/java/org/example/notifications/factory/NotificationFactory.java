package org.example.notifications.factory;

import org.example.notifications.Notification;
import org.example.notifications.impl.EmailNotification;
import org.example.notifications.impl.PushNotification;
import org.example.notifications.impl.SMSNotification;

public class NotificationFactory {
    public Notification create(String type){
        if(type == null)
            return null;
        else if(type.equals("SMS"))
            return new SMSNotification();
        else if(type.equals("PUSH"))
            return new PushNotification();
        else if(type.equals("EMAIL"))
            return new EmailNotification();
        else
            return null;
    }
}
