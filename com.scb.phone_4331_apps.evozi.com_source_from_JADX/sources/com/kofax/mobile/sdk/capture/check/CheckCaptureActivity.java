package com.kofax.mobile.sdk.capture.check;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.kofax.kmc.ken.engines.data.CheckDetectionSettings;
import com.kofax.kmc.ken.engines.data.CheckSide;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.view.IOverlayView;
import com.kofax.mobile.sdk.capture.CaptureActivity;
import com.kofax.mobile.sdk.capture.IImageStorage;
import com.kofax.mobile.sdk.p015ak.C0859c;
import com.kofax.mobile.sdk.p015ak.C0860e;
import com.kofax.mobile.sdk.p024l.C8424a;
import p040o.HmlPinActivity;

public class CheckCaptureActivity extends CaptureActivity {
    @HmlPinActivity

    /* renamed from: Yw */
    IImageStorage f4641Yw = null;
    @HmlPinActivity

    /* renamed from: Zo */
    IOverlayView f4642Zo = null;
    private final CheckDetectionSettings aai = new CheckDetectionSettings();
    private CheckParameters aaj = null;
    @HmlPinActivity

    /* renamed from: mO */
    C8424a f4643mO;

    public void onCreate(Bundle bundle) {
        Injector.getInjector(this).inject(this);
        super.onCreate(bundle);
        this.aaj = (CheckParameters) getParameters(bundle);
        this.f4642Zo.setUserInstructionMessage(C0860e.m2232b(getApplication(), "cap_guide_fill_with_check"));
        this.f4642Zo.setUserInstructionMessageTextSize(32);
        this.f4642Zo.setCenterMessage(C0860e.m2232b(getApplication(), "cap_guide_center_check"));
        CheckParameters checkParameters = (CheckParameters) getParameters(bundle);
        this.aai.setSide(checkParameters.side);
        if (!(!CheckSide.BACK.equals(checkParameters.side) || checkParameters.reverseSideCheck == null || this.f4641Yw.getImage(checkParameters.reverseSideCheck.processedImageId) == null)) {
            Bitmap image = this.f4641Yw.getImage(checkParameters.reverseSideCheck.processedImageId);
            double width = ((double) image.getWidth()) / ((double) image.getHeight());
            CheckDetectionSettings checkDetectionSettings = this.aai;
            if (width <= 1.0d) {
                width = 1.0d / width;
            }
            checkDetectionSettings.setTargetFrameAspectRatio(width);
            this.aai.setAspectRatioFraction(0.1d);
        }
        initController(this.f4642Zo, this.f4643mO);
        this.f4643mO.mo12370c(this.aai);
        m4708tP();
        m4707tO();
    }

    /* renamed from: tO */
    private void m4707tO() {
        CheckParameters checkParameters = this.aaj;
        if (checkParameters != null && checkParameters.side.equals(CheckSide.FRONT)) {
            getCameraView().setUseVideoFrame(true);
        }
    }

    /* renamed from: tP */
    private void m4708tP() {
        if (CheckSide.BACK.equals(this.aai.getSide())) {
            this.f4642Zo.setDocumentSampleImage(C0859c.m2231a(this, "check_back_sample"));
        } else {
            this.f4642Zo.setDocumentSampleImage(C0859c.m2231a(this, "check_sample_rotated"));
        }
    }
}
