package cn.edu.ncu.eureka.shapefamily.utils;

import cn.edu.ncu.eureka.shapefamily.entity.Drawable;
import javafx.scene.paint.Color;

import java.lang.reflect.Constructor;
import java.util.Properties;

public class PropertyHandler {
    private static PropertyHandler instance = null;

    public static PropertyHandler getInstance() {
        if (instance == null)
            instance = new PropertyHandler();
        return instance;
    }

    public Drawable getShape() throws Exception {
        Properties properties = new Properties();
        properties.load(getClass().getResourceAsStream("shape.properties"));
        String name = properties.getProperty("shape.name");
        double x = Double.parseDouble(properties.getProperty("shape.x"));
        double y = Double.parseDouble(properties.getProperty("shape.y"));
        double width = Double.parseDouble(properties.getProperty("shape.width"));
        double height = Double.parseDouble(properties.getProperty("shape.height"));
        Color color = Color.valueOf(properties.getProperty("shape.color"));
        Class<?> classType = Class.forName("cn.edu.ncu.eureka.shapefamily.entity." + name);
        Constructor<?> constructor = classType.getConstructor(double.class, double.class, double.class, double.class, Color.class);
        return (Drawable) constructor.newInstance(x, y, width, height, color);
    }
}