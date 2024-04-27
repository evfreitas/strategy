package com.tech.strategy.service;

import com.tech.strategy.service.strategy.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class NotificationService {

    private final Map<String, NotificationStrategy> mapStrategy = Map.of(
            "discord", new DiscordNotificationStrategy(),
            "email", new EmailNotificationStrategy(),
            "instagram", new InstagramNotificationStrategy(),
            "twitter", new TwitterNotificationStrategy(),
            "whatsapp", new WhatsappNotificationStrategy()
    );

    private final Logger logger = LoggerFactory.getLogger(NotificationService.class);

    public void notify (String channel, String destination, String messagee){

        mapStrategy.get(channel).sendNotification(destination, messagee);
    }
}
