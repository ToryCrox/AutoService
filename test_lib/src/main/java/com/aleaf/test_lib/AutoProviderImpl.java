package com.aleaf.test_lib;

import com.aleaf.autoservice.AutoService;

@AutoService(IProvider.class)
public class AutoProviderImpl implements IProvider {
    @Override
    public String provide() {
        return "this is AutoProviderImpl";
    }
}
