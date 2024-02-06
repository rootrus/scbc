package com.kofax.mobile.sdk.capture.passport;

import android.os.Bundle;
import com.kofax.kmc.ken.engines.data.PassportDetectionSettings;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.view.IOverlayView;
import com.kofax.mobile.sdk.capture.CaptureActivity;
import com.kofax.mobile.sdk.p024l.C8430i;
import p040o.HmlPinActivity;

public class PassportCaptureActivity extends CaptureActivity {
    @HmlPinActivity

    /* renamed from: Zo */
    IOverlayView f4803Zo;
    private final PassportDetectionSettings adt = new PassportDetectionSettings();
    @HmlPinActivity

    /* renamed from: nj */
    C8430i f4804nj;

    public void onCreate(Bundle bundle) {
        Injector.getInjector(this).inject(this);
        super.onCreate(bundle);
        initController(this.f4803Zo, this.f4804nj);
        this.f4804nj.mo12370c(this.adt);
    }
}
