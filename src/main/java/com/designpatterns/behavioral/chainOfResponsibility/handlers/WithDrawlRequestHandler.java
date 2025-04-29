package com.designpatterns.behavioral.chainOfResponsibility.handlers;

import com.designpatterns.behavioral.chainOfResponsibility.models.WithDrawlRequest;
import com.designpatterns.behavioral.chainOfResponsibility.models.WithDrawlResponse;

public abstract class WithDrawlRequestHandler {

    public abstract WithDrawlRequestHandler getNextHandler();
    public void handleRequest(WithDrawlRequest request, WithDrawlResponse response){
        if(getNextHandler() != null) {
            getNextHandler().handleRequest(request, response);
        }
    }
}
