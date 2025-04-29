package com.designpatterns.behavioral.chainOfResponsibility.handlers;

import com.designpatterns.behavioral.chainOfResponsibility.models.WithDrawlRequest;
import com.designpatterns.behavioral.chainOfResponsibility.models.WithDrawlResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WithDrawlRequestHandlerFor500Notes extends WithDrawlRequestHandler{

    @Override
    public WithDrawlRequestHandler getNextHandler() {
        return new WithDrawlRequestHandlerFor100Notes();
    }
    @Override
    public void handleRequest(WithDrawlRequest request, WithDrawlResponse response) {
        log.info("Inside handleRequest method");
        if (request.getRemainingAmountToWithDraw() >= 500) {
            response.setNoOf500Notes(request.getRemainingAmountToWithDraw() / 500);
            request.setRemainingAmountToWithDraw(request.getRemainingAmountToWithDraw() % 500);
        }
        if(request.getRemainingAmountToWithDraw() > 0) {
            log.info("Skipping the calling of super.handleRequest");
            super.handleRequest(request, response);
        }
    }
}
