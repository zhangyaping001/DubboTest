package com.test.dubbo.api;

/**
 * Created by zhangyaping on 17/9/23.
 */
public interface CallbackService {

    void addListener(String key, CallbackListener listener);

}
