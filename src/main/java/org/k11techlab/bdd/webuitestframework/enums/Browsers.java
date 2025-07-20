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

package org.k11techlab.bdd.webuitestframework.enums;

/**
 * Enum class for available browsers.
 */
public enum Browsers {

    CHROME,

    FIREFOX,

    IE,

    INTERNETEXPLORER;

    /**
     * Gets the browser.
     *
     * @param browser the browser value to get
     * @return the browser enum value
     * @throws IllegalArgumentException Throws exception if browser is not available
     */
    public static Browsers browserForName(String browser) {
        for (Browsers b : values()) {
            if (b.toString().equalsIgnoreCase(browser)) {
                return b;
            }
        }
        throw browserNotFound(browser);
    }

    /**
     * Throws new exception if browser is not found.
     *
     * @param outcome the outcome.
     * @return Return new IllegalArgumentException
     */
    private static IllegalArgumentException browserNotFound(String outcome) {
        return new IllegalArgumentException(("Invalid browser [" + outcome + "]"));
    }
}
