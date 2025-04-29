package com.designpatterns.behavioral.chainOfResponsibility.models;

import lombok.Data;

@Data
public class WithDrawlRequest {
    private int totalAmountToWithDraw;
    private int remainingAmountToWithDraw;
    public WithDrawlRequest(int totalAmountToWithDraw){
        this.totalAmountToWithDraw = totalAmountToWithDraw;
    }
}
