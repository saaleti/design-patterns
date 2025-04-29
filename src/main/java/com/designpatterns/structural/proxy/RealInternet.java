package com.designpatterns.structural.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealInternet implements Internet {
    @Override
    public void connect(String url) {
        log.info("Connecting to {}", url);
    }
}
