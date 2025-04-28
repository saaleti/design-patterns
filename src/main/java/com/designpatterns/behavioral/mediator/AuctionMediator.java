package com.designpatterns.behavioral.mediator;

public interface AuctionMediator {
    void addBidder(Colleague colleague);
    void notifyOtherBidders(String message);
    void placeBid(Colleague colleague, float amount);
}
