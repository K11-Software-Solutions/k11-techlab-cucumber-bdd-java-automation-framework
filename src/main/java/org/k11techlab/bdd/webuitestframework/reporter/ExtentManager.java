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

package org.k11techlab.bdd.webuitestframework.reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
    private static ExtentReports extent;

    // Singleton method to get an instance of ExtentReports
    public static ExtentReports getInstance() {
        if (extent == null) {
            createInstance("test-output/extent.html");
        }
        return extent;
    }

    // Method to create an instance of ExtentReports
    public static ExtentReports createInstance(String fileName) {
        // Create and configure an instance of ExtentSparkReporter
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(fileName);
        sparkReporter.config().setTheme(Theme.STANDARD);
        sparkReporter.config().setDocumentTitle(fileName);
        sparkReporter.config().setReportName(fileName);
        sparkReporter.config().setEncoding("utf-8");

        // The configuration for 'protocol' as 'https' might be necessary depending on your project setup.
        sparkReporter.config().setProtocol(com.aventstack.extentreports.reporter.configuration.Protocol.HTTPS);

        // Create an instance of ExtentReports and attach the configured reporter
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        return extent;
    }
}
