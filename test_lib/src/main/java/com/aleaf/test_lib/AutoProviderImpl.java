package com.aleaf.test_lib;

import android.support.annotation.Keep;

import com.aleaf.autoservice.AutoService;

@Keep
@AutoService(IProvider.class)
public class AutoProviderImpl implements IProvider {
    @Override
    public String provide() {
        return "this is AutoProviderImpl";
    }
}
