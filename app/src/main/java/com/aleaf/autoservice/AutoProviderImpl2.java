package com.aleaf.autoservice;

import android.support.annotation.Keep;

import com.aleaf.test_lib.IProvider;

@Keep
//@AutoService(IProvider.class)
public class AutoProviderImpl2 implements IProvider {
    @Override
    public String provide() {
        return "this is AutoProviderImpl2";
    }
}
