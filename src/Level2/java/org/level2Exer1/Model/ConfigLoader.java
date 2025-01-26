package org.level2Exer1.Model;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {

    private Properties properties;

    public ConfigLoader(String configFilePath) throws IOException {

        properties = new Properties();

        try (FileInputStream input = new FileInputStream(configFilePath)) {
            properties.load(input);
        }
    }

    public String getProperty(String key) {

        return properties.getProperty(key);

    }

}
