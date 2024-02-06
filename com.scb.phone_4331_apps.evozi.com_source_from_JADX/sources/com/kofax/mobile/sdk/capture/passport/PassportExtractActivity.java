package com.kofax.mobile.sdk.capture.passport;

import android.os.Bundle;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.capture.ExtractActivity;
import p040o.HmlPinActivity;

public class PassportExtractActivity extends ExtractActivity<PassportExtractorResponse> {
    public static final String PASSPORT_EXTRACT = "_passport_extract_";
    @HmlPinActivity
    PassportExtractor adz;

    public void onCreate(Bundle bundle) {
        Injector.getInjector(this).inject(this);
        super.onCreate(bundle);
        this.adz.setParameters(getParameters(bundle).getExtractionParameters());
        setExtract(this.adz);
    }
}
