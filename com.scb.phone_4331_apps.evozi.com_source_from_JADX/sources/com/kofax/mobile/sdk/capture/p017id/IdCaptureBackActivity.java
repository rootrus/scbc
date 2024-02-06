package com.kofax.mobile.sdk.capture.p017id;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kui.uicontrols.BarCodeCaptureView;
import com.kofax.kmc.kui.uicontrols.BarCodeFoundEvent;
import com.kofax.kmc.kui.uicontrols.BarCodeFoundListener;
import com.kofax.kmc.kui.uicontrols.data.GuidingLine;
import com.kofax.kmc.kui.uicontrols.data.Symbology;
import com.kofax.mobile.sdk._internal.C7898e;
import com.kofax.mobile.sdk._internal.C7921h;
import com.kofax.mobile.sdk._internal.camera.C0500f;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.capture.CaptureActivity;
import com.kofax.mobile.sdk.capture.IImageStorage;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureBackActivity */
public class IdCaptureBackActivity extends CaptureActivity {
    @HmlPinActivity

    /* renamed from: Yw */
    IImageStorage f4733Yw = null;
    @HmlPinActivity

    /* renamed from: Yx */
    C7898e f4734Yx = null;
    @HmlPinActivity

    /* renamed from: Yz */
    C7921h f4735Yz = null;
    private IdParameters acp;

    public void setupButtonBarView(LinearLayout linearLayout) {
    }

    public void onCreate(Bundle bundle) {
        Injector.getInjector(this).inject(this);
        super.onCreate(bundle);
        this.acp = (IdParameters) getParameters(bundle);
    }

    public C0500f getCameraView() {
        BarCodeCaptureView barCodeCaptureView = Injector.getInjector(this).getBarCodeCaptureView();
        barCodeCaptureView.setSymbologies(new Symbology[]{Symbology.PDF417});
        barCodeCaptureView.setGuidingLine(GuidingLine.LANDSCAPE);
        barCodeCaptureView.addBarCodeFoundEventListener(new BarCodeFoundListener() {
            public void barCodeFound(BarCodeFoundEvent barCodeFoundEvent) {
                IdCaptureBackActivity.this.m4721a(barCodeFoundEvent);
            }
        });
        barCodeCaptureView.readBarcode();
        return barCodeCaptureView;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4721a(BarCodeFoundEvent barCodeFoundEvent) {
        Image image = barCodeFoundEvent.getImage();
        Bundle bundle = new Bundle();
        bundle.putSerializable(IdWorkflowActivity.ID_BARCODE_RESULTS, barCodeFoundEvent.getBarCode());
        super.saveResultAndFinish(image, bundle);
    }

    public void setupCameraView(ViewGroup viewGroup) {
        viewGroup.addView(getCameraView().getViewGroup());
    }
}
