package practice.test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer {
    int i = 0;
    int max = 4;

    public synchronized boolean  retry(ITestResult result) {
        return i++<max;
    }
}