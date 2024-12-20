package org.dean.demo.factory;

import org.dean.demo.factory.adapter.Style;
import org.dean.demo.factory.style.ModernStyle;

// filepath: /factory/ModernFurnitureFactory.java
public class ModernFurnitureFactory extends AbstractFurnitureFactory {
    @Override
    protected Style createStyle() {
        return new ModernStyle();
    }
}
