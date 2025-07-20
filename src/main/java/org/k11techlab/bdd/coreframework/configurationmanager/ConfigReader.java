/******************************************************************************
 * Copyright 2025, K11 Software Solutions. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Author: Kavita Jadhav (kavita.jadhav.sdet@gmail.com)
 ******************************************************************************/

package org.k11techlab.bdd.coreframework.configurationmanager;

import lombok.Getter;

import java.io.IOException;
import java.util.Properties;

/**
 * Utility class to read configuration properties.
 * It loads properties from files: config.properties, android-config.properties, ios-config.properties.
 * Provides methods to access specific properties.
 *
 */
@SuppressWarnings("unused")
public class ConfigReader {

    @Getter
    static Properties properties, androidProperties, iosProperties, webAppProperties;

    static {
        properties = new Properties();
        androidProperties = new Properties();
        iosProperties = new Properties();
        webAppProperties= new Properties();
        try {
            properties.load(ConfigReader.class.getClassLoader().getResourceAsStream("config.properties"));
            androidProperties.load(ConfigReader.class.getClassLoader().getResourceAsStream("android-config.properties"));
            iosProperties.load(ConfigReader.class.getClassLoader().getResourceAsStream("ios-config.properties"));
            webAppProperties.load(ConfigReader.class.getClassLoader().getResourceAsStream("test-config.properties"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get the value of a property from a specified configuration file.
     *
     * @param configFileName The name of the configuration file.
     * @param propertyName   The name of the property.
     * @return The value of the property.
     */
    public static String getProperty(String configFileName, String propertyName) {
        Properties properties = new Properties();
        try {
            properties.load(ConfigReader.class.getClassLoader().getResourceAsStream(configFileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties.getProperty(propertyName);
    }
}
