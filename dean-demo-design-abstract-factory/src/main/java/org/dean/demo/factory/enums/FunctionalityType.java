package org.dean.demo.factory.enums;

public enum FunctionalityType {
    SIT("坐"),
    LIE_DOWN("躺"),
    PLACE_COFFEE("放置咖啡");

    private final String action;

    FunctionalityType(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
