package com.kofax.mobile.sdk.capture.bill;

import android.os.Bundle;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.capture.ExtractActivity;
import p040o.HmlPinActivity;

public class BillExtractActivity extends ExtractActivity<BillExtractorResponse> {
    @HmlPinActivity

    /* renamed from: Zw */
    BillExtractor f4590Zw;

    public void onCreate(Bundle bundle) {
        Injector.getInjector(this).inject(this);
        super.onCreate(bundle);
        this.f4590Zw.setParameters(getParameters(bundle).getExtractionParameters());
        setExtract(this.f4590Zw);
    }
}
