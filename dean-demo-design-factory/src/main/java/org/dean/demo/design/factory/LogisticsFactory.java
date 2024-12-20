package org.dean.demo.design.factory;

import java.util.Arrays;

public class LogisticsFactory {

    /**
     * 根據物流類型返回對應的物流服務
     *
     * @param logisticsType 物流類型
     * @return Logistics 對應的物流服務實例
     */
    public static Logistics getLogisticsService(String logisticsType) {
        return Arrays.stream(LogisticsEnum.values())
                .filter(enumType -> enumType.getType().equalsIgnoreCase(logisticsType))
                .findFirst()
                .map(LogisticsEnum::getLogisticsService)
                .orElseThrow(() -> new IllegalArgumentException("未知的物流類型：" + logisticsType));
    }
}
