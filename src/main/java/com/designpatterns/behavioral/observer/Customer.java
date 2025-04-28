package com.designpatterns.behavioral.observer;

public class Customer implements  Observer{

    private String name;

    public Customer(String name){
       this.name = name;
    }

    @Override
    public void update(Subject subject) {
        if(subject instanceof  IphoneStockController iphoneStockController){
            System.out.println("To Customer : "+this.name + ", No Of IPhones available are : " +iphoneStockController.getNoOfUnits());
        }
    }
}
