package org.dean.demo.design.factory;

public class ExpressLogistics implements Logistics {
    @Override
    public void deliver(String packageId, String destination) {
        System.out.println("使用快遞物流運送，包裹編號：" + packageId + "，目的地：" + destination);
    }
}
