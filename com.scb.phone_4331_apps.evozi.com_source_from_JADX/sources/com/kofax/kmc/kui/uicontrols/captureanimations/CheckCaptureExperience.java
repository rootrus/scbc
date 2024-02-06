package com.kofax.kmc.kui.uicontrols.captureanimations;

import android.content.Context;
import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.CheckSide;
import com.kofax.kmc.kui.uicontrols.ImageCaptureView;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.p015ak.C0859c;
import com.kofax.mobile.sdk.p015ak.C0860e;
import com.kofax.mobile.sdk.p024l.C8424a;
import p040o.HmlPinActivity;

public class CheckCaptureExperience extends DocumentBaseCaptureExperience {
    private static final String TAG = CheckCaptureExperience.class.getSimpleName();
    @HmlPinActivity

    /* renamed from: mO */
    C8424a f3540mO;

    /* renamed from: mP */
    private CheckCaptureExperienceCriteriaHolder f3541mP;

    public CheckCaptureExperience(ImageCaptureView imageCaptureView) {
        this(imageCaptureView, m3788a((CheckCaptureExperienceCriteriaHolder) null), false);
    }

    public CheckCaptureExperience(ImageCaptureView imageCaptureView, CheckCaptureExperienceCriteriaHolder checkCaptureExperienceCriteriaHolder) {
        this(imageCaptureView, m3788a(checkCaptureExperienceCriteriaHolder), true);
    }

    private CheckCaptureExperience(ImageCaptureView imageCaptureView, CheckCaptureExperienceCriteriaHolder checkCaptureExperienceCriteriaHolder, boolean z) {
        super(imageCaptureView, checkCaptureExperienceCriteriaHolder);
        Injector.getInjector(this._ctx.getApplicationContext()).injectMembers(this);
        initBase(imageCaptureView, this.f3540mO, checkCaptureExperienceCriteriaHolder);
        m3789a(checkCaptureExperienceCriteriaHolder, z);
        this._captureController.setUserInstructionMessage(C0860e.m2232b(imageCaptureView.getContext(), "cap_guide_fill_with_check"));
        this._captureController.setCenterMessage(C0860e.m2232b(imageCaptureView.getContext(), "cap_guide_center_check"));
    }

    /* renamed from: c */
    private void m3790c(Context context) {
        if (this.f3541mP.getCheckDetectionSettings().getSide() == CheckSide.BACK) {
            setDocumentSampleImage(C0859c.m2231a(context, "check_back_sample"));
        } else {
            setDocumentSampleImage(C0859c.m2231a(context, "check_sample_rotated"));
        }
    }

    /* renamed from: a */
    private static CheckCaptureExperienceCriteriaHolder m3788a(CheckCaptureExperienceCriteriaHolder checkCaptureExperienceCriteriaHolder) {
        return checkCaptureExperienceCriteriaHolder != null ? checkCaptureExperienceCriteriaHolder : new CheckCaptureExperienceCriteriaHolder();
    }

    public CaptureMessage getUserInstructionMessage() {
        return super.getUserInstructionMessage();
    }

    public void setUserInstructionMessage(CaptureMessage captureMessage) {
        super.setUserInstructionMessage(captureMessage);
    }

    public CaptureMessage getCenterMessage() {
        return super.getCenterMessage();
    }

    public void setCenterMessage(CaptureMessage captureMessage) {
        super.setCenterMessage(captureMessage);
    }

    public Bitmap getCheckSampleImage() {
        return super.getDocumentSampleImage();
    }

    public void setCheckSampleImage(Bitmap bitmap) {
        super.setDocumentSampleImage(bitmap);
    }

    public void setCaptureCriteria(CheckCaptureExperienceCriteriaHolder checkCaptureExperienceCriteriaHolder) {
        m3789a(checkCaptureExperienceCriteriaHolder, true);
    }

    /* renamed from: a */
    private void m3789a(CheckCaptureExperienceCriteriaHolder checkCaptureExperienceCriteriaHolder, boolean z) {
        if (checkCaptureExperienceCriteriaHolder != null) {
            CheckCaptureExperienceCriteriaHolder checkCaptureExperienceCriteriaHolder2 = new CheckCaptureExperienceCriteriaHolder(checkCaptureExperienceCriteriaHolder);
            this.f3541mP = checkCaptureExperienceCriteriaHolder2;
            super.mo10747a(checkCaptureExperienceCriteriaHolder2);
            this.f3540mO.mo12370c(this.f3541mP.getCheckDetectionSettings());
            if (!this._captureController.hasDocumentSampleImage() && z) {
                m3790c(this._ctx);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("criteria is null");
    }

    public CheckCaptureExperienceCriteriaHolder getCaptureCriteria() {
        return new CheckCaptureExperienceCriteriaHolder(this.f3541mP);
    }
}
