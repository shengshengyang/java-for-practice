package org.dean.demo.factory;

import org.dean.demo.factory.adapter.Style;
import org.dean.demo.factory.style.ClassicStyle;

public class ClassicFurnitureFactory extends AbstractFurnitureFactory {
    @Override
    protected Style createStyle() {
        return new ClassicStyle();
    }
}
