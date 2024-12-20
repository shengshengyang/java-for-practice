package org.dean.demo.factory.style;

import org.dean.demo.factory.adapter.Style;
import org.dean.demo.factory.enums.StyleType;

public class ModernStyle implements Style {
    @Override
    public String getStyleName() {
        return StyleType.MODERN.getName();
    }
}
