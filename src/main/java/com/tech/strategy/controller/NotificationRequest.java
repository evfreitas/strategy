package com.tech.strategy.controller;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;

@Data
public class NotificationRequest {

    @NotBlank
    private String channel;

    @NotBlank
    private String destination;

    @NotBlank
    private String message;

}
