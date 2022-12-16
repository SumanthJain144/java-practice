package com.sumanth.interview;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class BaseConfigElement {
    void m1() {
    }
}

class ConfigElement extends BaseConfigElement {
    @Override
    void m1() {
    }
}

class DynamicConfigElement extends BaseConfigElement {
    @Override
    void m1() {
    }
}

class ConfigCreator {
    /**
     * Generics example
     *
     * @param args
     */
    public static void main(String[] args) {
        ConfigCreator configCreator = new ConfigCreator();
        List<ConfigElement> configElements = new ArrayList<>();
        List<DynamicConfigElement> dynamicConfigElements = new ArrayList<>();
        ArrayList<ConfigElement> arrayListConfigElements = new ArrayList<>();
        List<Object> objects = new ArrayList<>();
        ArrayList<Object> arrayListObjects = new ArrayList<>();
        List<BaseConfigElement> baseConfigElements = new ArrayList<>();

        configCreator.createConfig(configElements);
        configCreator.createConfig(arrayListConfigElements);
        // configCreator.createConfig(dynamicConfigElements);
        // configCreator.createConfig(objects);
        // configCreator.createConfig(arrayListObjects);
        // configCreator.createConfig(baseConfigElements);

    }

    OutputStream createConfig(List<? extends ConfigElement> elements) {
        return null;
    }
}



