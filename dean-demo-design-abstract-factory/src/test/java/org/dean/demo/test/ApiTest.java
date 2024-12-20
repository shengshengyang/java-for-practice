package org.dean.demo.test;

import org.dean.demo.factory.Furniture;
import org.dean.demo.factory.adapter.FurnitureAdapter;
import org.dean.demo.factory.adapter.Style;
import org.dean.demo.factory.enums.FunctionalityType;
import org.dean.demo.factory.enums.FurnitureType;
import org.dean.demo.factory.style.ClassicStyle;
import org.dean.demo.factory.style.IndustrialStyle;
import org.dean.demo.factory.style.ModernStyle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ApiTest {

    @Test
    public void testGetAction() {
        assertEquals("坐", FunctionalityType.SIT.getAction());
        assertEquals("躺", FunctionalityType.LIE_DOWN.getAction());
        assertEquals("放置咖啡", FunctionalityType.PLACE_COFFEE.getAction());
    }
    @Test
    public void testModernStyle() {
        Style style = new ModernStyle();
        assertEquals("現代", style.getStyleName());
    }

    @Test
    public void testClassicStyle() {
        Style style = new ClassicStyle();
        assertEquals("古典", style.getStyleName());
    }

    @Test
    public void testIndustrialStyle() {
        Style style = new IndustrialStyle();
        assertEquals("工業", style.getStyleName());
    }

    @Test
    public void testFurnitureAdapter() {
        Style style = new ModernStyle();
        FurnitureType furnitureType = FurnitureType.CHAIR;
        Furniture furniture = new FurnitureAdapter(furnitureType, style);
        furniture.describe();

        style = new ClassicStyle();
        furnitureType = FurnitureType.SOFA;
        furniture = new FurnitureAdapter(furnitureType, style);
        furniture.describe();

        style = new IndustrialStyle();
        furnitureType = FurnitureType.COFFEE_TABLE;
        furniture = new FurnitureAdapter(furnitureType, style);
        furniture.describe();
    }

}
