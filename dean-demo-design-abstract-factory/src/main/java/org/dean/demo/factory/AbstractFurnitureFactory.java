package org.dean.demo.factory;

import org.dean.demo.factory.adapter.FurnitureAdapter;
import org.dean.demo.factory.adapter.Style;
import org.dean.demo.factory.enums.FurnitureType;

public abstract class AbstractFurnitureFactory {

    protected abstract Style createStyle();

    //將原本分散的 createStyle() 方法統一放在 AbstractFurnitureFactory 類別中
    public Furniture createFurniture(FurnitureType furnitureType) {
        Style style = createStyle();
        return new FurnitureAdapter(furnitureType, style);
    }
}
