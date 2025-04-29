package com.designpatterns.structural.proxy;

public class ProxyPatternTestDrive {
    public static void main(String[] args) {
        Internet internet = new RealInternet();
        Internet proxy = new InternetProxy(internet);
        proxy.connect("google.com");
    }
}
