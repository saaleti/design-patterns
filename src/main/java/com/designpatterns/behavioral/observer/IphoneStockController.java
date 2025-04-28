package com.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockController implements Subject{
    private Integer noOfUnits;

    List<Observer> observerList = new ArrayList<>();

    public IphoneStockController(int noOfUnits){
        this.noOfUnits = noOfUnits;
    }

    protected void setNoOfUnits(Integer noOfUnits) {
        this.noOfUnits = noOfUnits;
        notifyObservers();
    }

    public Integer getNoOfUnits(){
        return this.noOfUnits;
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers(){
        observerList.stream().forEach(observer -> observer.update(this));
    }

}
