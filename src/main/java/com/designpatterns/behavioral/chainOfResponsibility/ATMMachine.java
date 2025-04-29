package com.designpatterns.behavioral.chainOfResponsibility;

import com.designpatterns.behavioral.chainOfResponsibility.handlers.WithDrawlRequestHandlerFor2000Notes;
import com.designpatterns.behavioral.chainOfResponsibility.models.WithDrawlRequest;
import com.designpatterns.behavioral.chainOfResponsibility.models.WithDrawlResponse;

public class ATMMachine {


    public WithDrawlResponse withDraw(WithDrawlRequest withDrawlRequest) {
        withDrawlRequest.setRemainingAmountToWithDraw(withDrawlRequest.getTotalAmountToWithDraw());
        WithDrawlResponse withDrawlresponse = new WithDrawlResponse();
        WithDrawlRequestHandlerFor2000Notes handler = new WithDrawlRequestHandlerFor2000Notes();
        handler.handleRequest(withDrawlRequest, withDrawlresponse);
        return withDrawlresponse;

    }
}
