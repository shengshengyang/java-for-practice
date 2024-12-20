package org.dean.demo.design.factory;

public enum LogisticsEnum {
    EXPRESS("express", new ExpressLogistics()),
    FREIGHT("freight", new FreightLogistics()),
    DRONE("drone", new DroneLogistics());

    private final String type;
    private final Logistics logisticsService;

    LogisticsEnum(String type, Logistics logisticsService) {
        this.type = type;
        this.logisticsService = logisticsService;
    }

    public String getType() {
        return type;
    }

    public Logistics getLogisticsService() {
        return logisticsService;
    }

    public static Logistics getLogisticsByType(String logisticsType) {
        for (LogisticsEnum value : values()) {
            if (value.getType().equalsIgnoreCase(logisticsType)) {
                return value.getLogisticsService();
            }
        }
        throw new IllegalArgumentException("未知的物流類型：" + logisticsType);
    }
}
