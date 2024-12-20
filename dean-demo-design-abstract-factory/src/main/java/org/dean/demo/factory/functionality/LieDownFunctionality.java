package org.dean.demo.factory.functionality;

import org.dean.demo.factory.adapter.Functionality;
import org.dean.demo.factory.enums.FunctionalityType;

public class LieDownFunctionality implements Functionality {
    @Override
    public String getFunctionality() {
        return FunctionalityType.LIE_DOWN.getAction();
    }
}
