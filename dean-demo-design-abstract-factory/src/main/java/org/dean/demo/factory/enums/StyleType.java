package org.dean.demo.factory.enums;

public enum StyleType {
    MODERN("現代"),
    CLASSIC("古典"),
    INDUSTRIAL("工業");

    private final String name;

    StyleType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
