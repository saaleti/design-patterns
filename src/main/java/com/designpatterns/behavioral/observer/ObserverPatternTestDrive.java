package com.designpatterns.behavioral.observer;

public class ObserverPatternTestDrive {
    public static void main(String[] args) {
        IphoneStockController iphoneStockController = new IphoneStockController(0);
        Observer observer1 = new Customer("Swaroop");
        Observer observer2 = new Customer("Suji");
        Observer observer3 = new Customer("Sanjay");
        iphoneStockController.addObserver(observer1);
        iphoneStockController.addObserver(observer2);
        iphoneStockController.addObserver(observer3);
        iphoneStockController.setNoOfUnits(10);
        iphoneStockController.removeObserver(observer1);
        iphoneStockController.setNoOfUnits(20);
        iphoneStockController.removeObserver(observer2);
        iphoneStockController.setNoOfUnits(30);
    }
}
