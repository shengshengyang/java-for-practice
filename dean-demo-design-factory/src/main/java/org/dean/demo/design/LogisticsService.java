package org.dean.demo.design;

public class LogisticsService {

    public void deliverPackage(String logisticsType, String packageId, String destination) {
        if ("express".equalsIgnoreCase(logisticsType)) {
            System.out.println("使用快遞物流運送，包裹編號：" + packageId + "，目的地：" + destination);
        } else if ("freight".equalsIgnoreCase(logisticsType)) {
            System.out.println("使用貨運物流運送，包裹編號：" + packageId + "，目的地：" + destination);
        } else if ("drone".equalsIgnoreCase(logisticsType)) {
            System.out.println("使用無人機物流運送，包裹編號：" + packageId + "，目的地：" + destination);
        } else {
            throw new RuntimeException("未知的物流類型：" + logisticsType);
        }
    }
}
