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

package org.k11techlab.bdd.webuitestframework.retryanalyzer;

import org.k11techlab.bdd.webuitestframework.enums.ApplicationProperties;
import org.testng.*;

import java.util.HashSet;
import java.util.Set;

public class RetryTestListenerAdapter extends TestListenerAdapter implements ITestListener{

    public void onTestFailure(ITestResult result) {
        if(!(ApplicationProperties.RETRY_CNT.getIntVal()==0)) {
            if (result.getMethod().getRetryAnalyzer() != null) {
                RetryAnalyzer retryAnalyzer = (RetryAnalyzer)result.getMethod().getRetryAnalyzer();
                if (retryAnalyzer.getRetryCount()>0) {
                    result.setStatus(ITestResult.SKIP);
                } else {
                    result.setStatus(ITestResult.FAILURE);
                }
                Reporter.setCurrentTestResult(result);
            }
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        Set<ITestResult> failedTests = context.getFailedTests().getAllResults();
        Set<ITestResult> testsToRemove = new HashSet<>();

        for (ITestResult temp : failedTests) {
            ITestNGMethod method = temp.getMethod();
            if (context.getFailedTests().getResults(method).size() > 1 || context.getPassedTests().getResults(method).size() > 0) {
                testsToRemove.add(temp);
            }
        }

        failedTests.removeAll(testsToRemove); // Safely remove all collected tests at once
    }



}
