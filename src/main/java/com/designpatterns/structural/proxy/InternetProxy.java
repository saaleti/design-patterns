package com.designpatterns.structural.proxy;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class InternetProxy implements Internet {

    private Internet internet;

    private List<String> blockedSites = new ArrayList<>();

    public InternetProxy(Internet internet) {
        this.internet = internet;
        blockedSites.add("blocked1.com");
        blockedSites.add("blocked2.com");
    }

    @Override
    public void connect(String url) {
        if (blockedSites.contains(url)) {
            throw new RuntimeException("Not allowed to Visit Site");
        }
        log.info("Proxy check passed");
        internet.connect(url);
    }
}
