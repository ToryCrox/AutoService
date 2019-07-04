package com.aleaf.test_lib;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;

@Keep
public interface IProvider {

    @NonNull
    String provide();
}
