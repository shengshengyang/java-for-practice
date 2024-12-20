package org.dean.demo.factory.style;

import org.dean.demo.factory.adapter.Style;
import org.dean.demo.factory.enums.StyleType;

public class ClassicStyle implements Style {
    @Override
    public String getStyleName() {
        return StyleType.CLASSIC.getName();
    }
}
