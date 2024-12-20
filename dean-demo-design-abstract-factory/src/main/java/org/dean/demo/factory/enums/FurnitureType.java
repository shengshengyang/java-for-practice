package org.dean.demo.factory.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum FurnitureType {
    CHAIR("椅子", Collections.singletonList(FunctionalityType.SIT)),
    SOFA("沙發", Arrays.asList(FunctionalityType.SIT, FunctionalityType.LIE_DOWN)),
    COFFEE_TABLE("咖啡桌", Collections.singletonList(FunctionalityType.PLACE_COFFEE));

    private final String name;
    private final List<FunctionalityType> functionalities;

    FurnitureType(String name, List<FunctionalityType> functionalities) {
        this.name = name;
        this.functionalities = functionalities;
    }

    public String getName() {
        return name;
    }

    public List<FunctionalityType> getFunctionalities() {
        return functionalities;
    }
}
