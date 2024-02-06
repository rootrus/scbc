package com.kofax.mobile.sdk.capture.bill;

import android.os.Bundle;
import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.view.IOverlayView;
import com.kofax.mobile.sdk.capture.CaptureActivity;
import com.kofax.mobile.sdk.p024l.C0967f;
import p040o.HmlPinActivity;

public class BillCaptureActivity extends CaptureActivity {

    /* renamed from: Zn */
    private final DocumentDetectionSettings f4549Zn = new DocumentDetectionSettings();
    @HmlPinActivity

    /* renamed from: Zo */
    IOverlayView f4550Zo;
    @HmlPinActivity

    /* renamed from: ne */
    C0967f f4551ne;

    public void onCreate(Bundle bundle) {
        Injector.getInjector(this).inject(this);
        super.onCreate(bundle);
        this.f4551ne.mo12370c(this.f4549Zn);
        initController(this.f4550Zo, this.f4551ne);
    }
}
