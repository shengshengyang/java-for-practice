package org.dean.demo.test;

import org.dean.demo.design.factory.Logistics;
import org.dean.demo.design.factory.LogisticsFactory;
import org.dean.demo.design.LogisticsService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class    ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    /**
     * 測試重構前的物流運送功能（使用 if-else 寫法）
     */
    @Test
    public void test_logisticsDelivery_ifElse() {
        logger.info("開始測試【重構前】物流運送功能");

        LogisticsService logisticsService = new LogisticsService();

        // 測試快遞物流
        logisticsService.deliverPackage("express", "PKG12345", "台北市");
        logger.info("【重構前】快遞物流測試完成，包裹編號：PKG12345，目的地：台北市");

        // 測試貨運物流
        logisticsService.deliverPackage("freight", "PKG67890", "高雄市");
        logger.info("【重構前】貨運物流測試完成，包裹編號：PKG67890，目的地：高雄市");

        // 測試無人機物流
        logisticsService.deliverPackage("drone", "PKG11223", "新竹市");
        logger.info("【重構前】無人機物流測試完成，包裹編號：PKG11223，目的地：新竹市");

        logger.info("完成【重構前】物流運送功能測試");
    }

    /**
     * 測試重構後的物流運送功能（使用工廠模式和抽象介面）
     */
    @Test
    public void test_logisticsDelivery_factoryPattern() {
        logger.info("開始測試【重構後】物流運送功能");

        // 測試快遞物流
        Logistics expressLogistics = LogisticsFactory.getLogisticsService("express");
        expressLogistics.deliver("PKG12345", "台北市");
        logger.info("【重構後】快遞物流測試完成，包裹編號：PKG12345，目的地：台北市");

        // 測試貨運物流
        Logistics freightLogistics = LogisticsFactory.getLogisticsService("freight");
        freightLogistics.deliver("PKG67890", "高雄市");
        logger.info("【重構後】貨運物流測試完成，包裹編號：PKG67890，目的地：高雄市");

        // 測試無人機物流
        Logistics droneLogistics = LogisticsFactory.getLogisticsService("drone");
        droneLogistics.deliver("PKG11223", "新竹市");
        logger.info("【重構後】無人機物流測試完成，包裹編號：PKG11223，目的地：新竹市");

        logger.info("完成【重構後】物流運送功能測試");
    }
}
