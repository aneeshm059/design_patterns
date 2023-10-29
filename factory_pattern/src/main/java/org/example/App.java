package org.example;

import org.example.notifications.Notification;
import org.example.notifications.factory.NotificationFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification_1 = notificationFactory.create("SMS");
        notification_1.notifyUser();
        Notification notification_2 = notificationFactory.create("PUSH");
        notification_2.notifyUser();
        Notification notification_3 = notificationFactory.create("EMAIL");
        notification_3.notifyUser();
    }
}
