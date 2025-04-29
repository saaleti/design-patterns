package com.designpatterns.behavioral.chainOfResponsibility.handlers;

import com.designpatterns.behavioral.chainOfResponsibility.models.WithDrawlRequest;
import com.designpatterns.behavioral.chainOfResponsibility.models.WithDrawlResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WithDrawlRequestHandlerFor2000Notes extends WithDrawlRequestHandler {

    @Override
    public WithDrawlRequestHandler getNextHandler() {
        return new WithDrawlRequestHandlerFor1000Notes();
    }

    @Override
    public void handleRequest(WithDrawlRequest request, WithDrawlResponse response) {
        log.info("Inside handleRequest method");
        if (request.getRemainingAmountToWithDraw() >= 2000) {
            response.setNoOf2000Notes(request.getRemainingAmountToWithDraw() / 2000);
            request.setRemainingAmountToWithDraw(request.getRemainingAmountToWithDraw() % 2000);
        }
        if(request.getRemainingAmountToWithDraw() > 0) {
            log.info("Skipping the calling of super.handleRequest");
            super.handleRequest(request, response);
        }
    }
}
