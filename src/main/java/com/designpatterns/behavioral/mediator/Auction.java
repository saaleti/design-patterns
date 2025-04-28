package com.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Auction implements  AuctionMediator{

    private List<Colleague> bidders = new ArrayList<>();

    private List<Float> bidHistory = new ArrayList<>();

    @Override
    public void addBidder(Colleague colleague) {
        bidders.add(colleague);
    }

    @Override
    public void notifyOtherBidders(String message) {
         bidders.stream().forEach(b -> b.receiveNotification(message));
    }

    @Override
    public void placeBid(Colleague colleague, float amount) {
         bidHistory.add(amount);
         notifyOtherBidders(colleague.getName()+" has quoted amount "+amount);
    }
}
