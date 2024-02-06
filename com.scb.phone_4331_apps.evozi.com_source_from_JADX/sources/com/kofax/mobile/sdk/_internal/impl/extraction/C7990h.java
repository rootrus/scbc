package com.kofax.mobile.sdk._internal.impl.extraction;

import com.kofax.android.abc.configuration.Configuration;
import com.kofax.android.abc.validation.MultiValidationEngine;
import com.kofax.mobile.sdk._internal.extraction.C7904g;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.h */
public class C7990h implements C7904g {
    /* renamed from: b */
    public MultiValidationEngine mo54275b(Configuration configuration, String str) {
        MultiValidationEngine multiValidationEngine = new MultiValidationEngine();
        multiValidationEngine.initialize(configuration, str);
        return multiValidationEngine;
    }
}
