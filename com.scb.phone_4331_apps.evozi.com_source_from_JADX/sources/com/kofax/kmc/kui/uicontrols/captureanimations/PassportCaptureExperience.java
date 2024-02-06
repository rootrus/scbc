package com.kofax.kmc.kui.uicontrols.captureanimations;

import android.content.Context;
import android.graphics.Bitmap;
import com.kofax.kmc.kui.uicontrols.ImageCaptureView;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.p015ak.C0859c;
import com.kofax.mobile.sdk.p015ak.C0860e;
import com.kofax.mobile.sdk.p024l.C8430i;
import p040o.HmlPinActivity;

public class PassportCaptureExperience extends DocumentBaseCaptureExperience {
    private static final String TAG = PassportCaptureExperience.class.getSimpleName();
    @HmlPinActivity

    /* renamed from: nj */
    C8430i f3574nj;

    /* renamed from: nk */
    private PassportCaptureExperienceCriteriaHolder f3575nk;

    public PassportCaptureExperience(ImageCaptureView imageCaptureView) {
        this(imageCaptureView, m3794a((PassportCaptureExperienceCriteriaHolder) null), false);
    }

    public PassportCaptureExperience(ImageCaptureView imageCaptureView, PassportCaptureExperienceCriteriaHolder passportCaptureExperienceCriteriaHolder) {
        this(imageCaptureView, m3794a(passportCaptureExperienceCriteriaHolder), true);
    }

    private PassportCaptureExperience(ImageCaptureView imageCaptureView, PassportCaptureExperienceCriteriaHolder passportCaptureExperienceCriteriaHolder, boolean z) {
        super(imageCaptureView, passportCaptureExperienceCriteriaHolder);
        Injector.getInjector(this._ctx.getApplicationContext()).injectMembers(this);
        initBase(imageCaptureView, this.f3574nj, passportCaptureExperienceCriteriaHolder);
        m3795a(passportCaptureExperienceCriteriaHolder, z);
        this._captureController.setUserInstructionMessage(C0860e.m2232b(imageCaptureView.getContext(), "cap_guide_fill_with_passport"));
        this._captureController.setCenterMessage(C0860e.m2232b(imageCaptureView.getContext(), "cap_guide_center_passport"));
    }

    /* renamed from: c */
    private void m3796c(Context context) {
        setDocumentSampleImage(C0859c.m2231a(context, "passport_sample"));
    }

    /* renamed from: a */
    private static PassportCaptureExperienceCriteriaHolder m3794a(PassportCaptureExperienceCriteriaHolder passportCaptureExperienceCriteriaHolder) {
        return passportCaptureExperienceCriteriaHolder != null ? passportCaptureExperienceCriteriaHolder : new PassportCaptureExperienceCriteriaHolder();
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

    public Bitmap getPassportSampleImage() {
        return super.getDocumentSampleImage();
    }

    public void setPassportSampleImage(Bitmap bitmap) {
        super.setDocumentSampleImage(bitmap);
    }

    public void setCaptureCriteria(PassportCaptureExperienceCriteriaHolder passportCaptureExperienceCriteriaHolder) {
        m3795a(passportCaptureExperienceCriteriaHolder, true);
    }

    /* renamed from: a */
    private void m3795a(PassportCaptureExperienceCriteriaHolder passportCaptureExperienceCriteriaHolder, boolean z) {
        if (passportCaptureExperienceCriteriaHolder != null) {
            PassportCaptureExperienceCriteriaHolder passportCaptureExperienceCriteriaHolder2 = new PassportCaptureExperienceCriteriaHolder(passportCaptureExperienceCriteriaHolder);
            this.f3575nk = passportCaptureExperienceCriteriaHolder2;
            super.mo10747a(passportCaptureExperienceCriteriaHolder2);
            this.f3574nj.mo12370c(this.f3575nk.getPassportDetectionSettings());
            if (!this._captureController.hasDocumentSampleImage() && z) {
                m3796c(this._ctx);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("criteria is null");
    }

    public PassportCaptureExperienceCriteriaHolder getCaptureCriteria() {
        return new PassportCaptureExperienceCriteriaHolder(this.f3575nk);
    }
}
