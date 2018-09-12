package com.aleaf.autoservice;

import com.aleaf.test_lib.IProvider;

//@AutoService(IProvider.class)
public class AutoProviderImpl2 implements IProvider {
    @Override
    public String provide() {
        return "this is AutoProviderImpl2";
    }
}
