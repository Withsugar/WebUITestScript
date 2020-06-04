package com.pku.base;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * 设置testng用例失败重试次数
 * Created by lmy on 2020/2/13.
 */
public class MyRetryAnalyzer implements IRetryAnalyzer {

    private int retryCount = 0;
    private final int MAX_RETRY_COUNT = 2;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (retryCount < MAX_RETRY_COUNT) {
            retryCount++;
            return true;
        }
        return false;
    }
}