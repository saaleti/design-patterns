package com.designpatterns.behavioral.mediator;

public class MediatorPattenTestDrive {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new Auction();
        Bidder bidder1 = new Bidder("Swaroop", auctionMediator);
        Bidder bidder2 = new Bidder("Suji", auctionMediator);
        auctionMediator.addBidder(bidder1);
        auctionMediator.addBidder(bidder2);
        bidder1.placeBid(100.f);
        bidder2.placeBid(110.f);
    }
}
