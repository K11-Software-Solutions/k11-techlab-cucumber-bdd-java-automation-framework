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

package org.k11techlab.bdd.webuitestframework.configManager;

import org.apache.commons.configuration2.CombinedConfiguration;
import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.io.File;
import java.io.FilenameFilter;

public class ConfigurationLoader {

    public static CombinedConfiguration loadConfigurationsFromFolder(String folderPath) {
        File dir = new File(folderPath);
        FilenameFilter filter = (dir1, name) -> name.endsWith(".xml") || name.endsWith(".properties");

        File[] files = dir.listFiles(filter);
        if (files == null) {
            System.out.println("No configuration files found in the specified folder.");
            return null;
        }

        CombinedConfiguration combinedConfig = new CombinedConfiguration();
        Parameters params = new Parameters();

        for (File file : files) {
            try {
                FileBasedConfigurationBuilder<? extends Configuration> builder;
                if (file.getName().endsWith(".xml")) {
                    builder = new FileBasedConfigurationBuilder<>(XMLConfiguration.class)
                                .configure(params.xml().setFile(file));
                } else { // .properties
                    builder = new FileBasedConfigurationBuilder<>(PropertiesConfiguration.class)
                                .configure(params.properties().setFile(file));
                }

                Configuration config = builder.getConfiguration();
                combinedConfig.addConfiguration(config);
            } catch (ConfigurationException e) {
                System.err.println("Error loading configuration from file: " + file.getName());
                e.printStackTrace();
            }
        }

        return combinedConfig;
    }
}
