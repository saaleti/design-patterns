package com.designpatterns.behavioral.mediator;

public class Bidder implements Colleague{

    private String name;
    private AuctionMediator mediator;

    public Bidder(String name, AuctionMediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println(message);
    }

    @Override
    public void placeBid(float amount) {
        mediator.placeBid(this, amount);
    }
}
