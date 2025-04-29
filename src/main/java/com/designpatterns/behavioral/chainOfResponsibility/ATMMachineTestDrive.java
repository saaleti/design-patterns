package com.designpatterns.behavioral.chainOfResponsibility;

import com.designpatterns.behavioral.chainOfResponsibility.models.WithDrawlRequest;
import com.designpatterns.behavioral.chainOfResponsibility.models.WithDrawlResponse;

public class ATMMachineTestDrive {
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine();
        WithDrawlRequest withDrawlRequest = new WithDrawlRequest(2500);
        WithDrawlResponse withDrawlResponse = atmMachine.withDraw(withDrawlRequest);
        System.out.println(withDrawlResponse);
    }
}
