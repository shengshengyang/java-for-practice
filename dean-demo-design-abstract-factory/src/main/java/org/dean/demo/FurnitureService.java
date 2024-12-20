package org.dean.demo;

public class FurnitureService {

    public void createFurniture(String furnitureType, String style) {
        if ("chair".equalsIgnoreCase(furnitureType)) {
            if ("modern".equalsIgnoreCase(style)) {
                System.out.println("創建現代風格椅子，功能：坐");
            } else if ("classic".equalsIgnoreCase(style)) {
                System.out.println("創建古典風格椅子，功能：坐");
            } else if ("industrial".equalsIgnoreCase(style)) {
                System.out.println("創建工業風格椅子，功能：坐");
            } else {
                throw new RuntimeException("未知的椅子風格：" + style);
            }
        } else if ("sofa".equalsIgnoreCase(furnitureType)) {
            if ("modern".equalsIgnoreCase(style)) {
                System.out.println("創建現代風格沙發，功能：坐");
            } else if ("classic".equalsIgnoreCase(style)) {
                System.out.println("創建古典風格沙發，功能：躺");
            } else if ("industrial".equalsIgnoreCase(style)) {
                System.out.println("創建工業風格沙發，功能：坐");
            } else {
                throw new RuntimeException("未知的沙發風格：" + style);
            }
        } else if ("coffeetable".equalsIgnoreCase(furnitureType)) {
            if ("modern".equalsIgnoreCase(style)) {
                System.out.println("創建現代風格咖啡桌，功能：放置咖啡");
            } else if ("classic".equalsIgnoreCase(style)) {
                System.out.println("創建古典風格咖啡桌，功能：放置咖啡");
            } else if ("industrial".equalsIgnoreCase(style)) {
                System.out.println("創建工業風格咖啡桌，功能：放置咖啡");
            } else {
                throw new RuntimeException("未知的咖啡桌風格：" + style);
            }
        } else {
            throw new RuntimeException("未知的家具類型：" + furnitureType);
        }
    }
}
