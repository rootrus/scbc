package com.kofax.mobile.sdk.capture.p017id;

import android.os.Bundle;
import com.kofax.kmc.ken.engines.data.FixedAspectRatioDetectionSettings;
import com.kofax.mobile.sdk._internal.capture.CaptureCriteria;
import com.kofax.mobile.sdk._internal.capture.CaptureMessage;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.view.IOverlayView;
import com.kofax.mobile.sdk.capture.CaptureActivity;
import com.kofax.mobile.sdk.p024l.C8426d;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureActivity */
public class IdCaptureActivity extends CaptureActivity {
    @HmlPinActivity

    /* renamed from: Zo */
    IOverlayView f4723Zo;
    private final FixedAspectRatioDetectionSettings aco = new FixedAspectRatioDetectionSettings();
    @HmlPinActivity

    /* renamed from: nh */
    C8426d f4724nh;

    public void onCreate(Bundle bundle) {
        Injector.getInjector(this).inject(this);
        super.onCreate(bundle);
        m4720a(this.f4723Zo);
        initController(this.f4723Zo, this.f4724nh);
        this.f4724nh.mo12370c(this.aco);
    }

    public void setCaptureCriteria(CaptureCriteria captureCriteria) {
        captureCriteria.setPitchThreshold(45);
        captureCriteria.setRollThreshold(45);
        super.setCaptureCriteria(captureCriteria);
    }

    /* renamed from: a */
    private void m4720a(IOverlayView iOverlayView) {
        CaptureMessage instructionMsg = iOverlayView.getInstructionMsg();
        instructionMsg.setOrientation(CaptureMessage.KUIMessageOrientation.REVERSEPORTRAIT);
        iOverlayView.setInstructionMsg(instructionMsg);
        CaptureMessage centerMsg = iOverlayView.getCenterMsg();
        centerMsg.setOrientation(CaptureMessage.KUIMessageOrientation.REVERSEPORTRAIT);
        iOverlayView.setCenterMsg(centerMsg);
        CaptureMessage zoomInMsg = iOverlayView.getZoomInMsg();
        zoomInMsg.setOrientation(CaptureMessage.KUIMessageOrientation.REVERSEPORTRAIT);
        iOverlayView.setZoomInMsg(zoomInMsg);
        CaptureMessage zoomOutMsg = iOverlayView.getZoomOutMsg();
        zoomOutMsg.setOrientation(CaptureMessage.KUIMessageOrientation.REVERSEPORTRAIT);
        iOverlayView.setZoomOutMsg(zoomOutMsg);
        CaptureMessage holdParallelMsg = iOverlayView.getHoldParallelMsg();
        holdParallelMsg.setOrientation(CaptureMessage.KUIMessageOrientation.REVERSEPORTRAIT);
        iOverlayView.setHoldParallelMsg(holdParallelMsg);
        CaptureMessage rotateMsg = iOverlayView.getRotateMsg();
        rotateMsg.setOrientation(CaptureMessage.KUIMessageOrientation.REVERSEPORTRAIT);
        iOverlayView.setRotateMsg(rotateMsg);
        CaptureMessage steadyMsg = iOverlayView.getSteadyMsg();
        steadyMsg.setOrientation(CaptureMessage.KUIMessageOrientation.REVERSEPORTRAIT);
        iOverlayView.setSteadyMsg(steadyMsg);
        CaptureMessage capturedMsg = iOverlayView.getCapturedMsg();
        capturedMsg.setOrientation(CaptureMessage.KUIMessageOrientation.REVERSEPORTRAIT);
        iOverlayView.setCapturedMsg(capturedMsg);
        CaptureMessage tutorialDismissMsg = iOverlayView.getTutorialDismissMsg();
        tutorialDismissMsg.setOrientation(CaptureMessage.KUIMessageOrientation.REVERSEPORTRAIT);
        iOverlayView.setTutorialDismissMsg(tutorialDismissMsg);
    }
}
