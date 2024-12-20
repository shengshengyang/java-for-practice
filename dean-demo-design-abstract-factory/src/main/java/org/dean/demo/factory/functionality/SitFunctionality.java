package org.dean.demo.factory.functionality;

import org.dean.demo.factory.adapter.Functionality;
import org.dean.demo.factory.enums.FunctionalityType;

public class SitFunctionality implements Functionality {
    @Override
    public String getFunctionality() {
        return FunctionalityType.SIT.getAction();
    }
}

