package org.dean.demo.factory.adapter;

import org.dean.demo.factory.Furniture;
import org.dean.demo.factory.enums.FunctionalityType;
import org.dean.demo.factory.enums.FurnitureType;

import java.util.List;
import java.util.stream.Collectors;

public class FurnitureAdapter implements Furniture {
    private Style style;
    private FurnitureType furnitureType;

    public FurnitureAdapter(FurnitureType furnitureType, Style style) {
        this.furnitureType = furnitureType;
        this.style = style;
    }

    @Override
    public void describe() {
        System.out.print("創建" + style.getStyleName() + "風格的" + furnitureType.getName() + "，功能：");
        List<FunctionalityType> functionalities = furnitureType.getFunctionalities();
        System.out.println(functionalities.stream()
                .map(FunctionalityType::getAction)
                .collect(Collectors.joining("、")));
    }
}
