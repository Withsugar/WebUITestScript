package com.pku.base;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

/**
 * 添加重试监听器，如果测试方法中未添加重试分析器，则默认添加MyRetryAnalyzer作为重试分析器
 * Created by liminyi on 2020/2/13.
 */
public class MyRetryListener implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation iTestAnnotation, Class aClass, Constructor constructor, Method method) {
        IRetryAnalyzer retryAnalyzer = iTestAnnotation.getRetryAnalyzer();
        if (null == retryAnalyzer) {
            iTestAnnotation.setRetryAnalyzer(MyRetryAnalyzer.class);
        }
    }
}
