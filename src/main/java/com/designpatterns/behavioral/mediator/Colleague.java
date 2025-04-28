package com.designpatterns.behavioral.mediator;

public interface Colleague {

    String getName();
    void receiveNotification(String message);

    void placeBid(float amount);
}
