package org.dean.demo.factory;

import org.dean.demo.factory.adapter.Style;
import org.dean.demo.factory.style.IndustrialStyle;

public class IndustrialFurnitureFactory extends AbstractFurnitureFactory {
    @Override
    protected Style createStyle() {
        return new IndustrialStyle();
    }
}
