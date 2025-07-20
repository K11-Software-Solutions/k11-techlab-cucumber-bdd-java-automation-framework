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

package org.k11techlab.bdd.webuitestframework.baseclasses;

import org.k11techlab.bdd.coreframework.logging.Log;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public interface BaseTestCase {

    /**
     * Sets the environment properties.
     */
    @BeforeSuite
    default void beforeSuite() {
        //EnvironmentSetup.environmentSetup();
    }

    /**
     * Before class method to log the class name.
     *
     * @param context The test context
     */
    @BeforeClass
    default void beforeClass(ITestContext context) {
        Log.LOGGER.info("Running the test class: "
                + this.getClass().getCanonicalName());
    }

    /**
     * Method executes after each test. Removes the driver.
     */
    @AfterTest()
    default void afterTest() {
        Log.LOGGER.info("Finished Test Method");
    }
}
