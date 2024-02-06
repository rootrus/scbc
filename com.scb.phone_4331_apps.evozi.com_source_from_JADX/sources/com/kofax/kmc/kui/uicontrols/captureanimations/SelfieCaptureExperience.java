package com.kofax.kmc.kui.uicontrols.captureanimations;

import com.google.android.gms.common.GoogleApiAvailability;
import com.kofax.kmc.kui.uicontrols.ImageCaptureView;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.detection.IFaceDetector;
import p040o.HmlPinActivity;

public class SelfieCaptureExperience extends SelfieBaseCaptureExperience {
    private static final String TAG = SelfieCaptureExperience.class.getSimpleName();
    @HmlPinActivity

    /* renamed from: np */
    IFaceDetector f3585np;

    public SelfieCaptureExperience(ImageCaptureView imageCaptureView) {
        this(imageCaptureView, m3797a((SelfieCaptureExperienceCriteriaHolder) null));
    }

    public SelfieCaptureExperience(ImageCaptureView imageCaptureView, SelfieCaptureExperienceCriteriaHolder selfieCaptureExperienceCriteriaHolder) {
        super(imageCaptureView, selfieCaptureExperienceCriteriaHolder);
        Injector.getInjector(this._ctx.getApplicationContext()).injectMembers(this);
        this.f3581nn.mo54228a(this.f3585np);
        initBase(imageCaptureView, selfieCaptureExperienceCriteriaHolder);
        m3798aF();
    }

    public void setCaptureCriteria(SelfieCaptureExperienceCriteriaHolder selfieCaptureExperienceCriteriaHolder) {
        super.setCaptureCriteria(selfieCaptureExperienceCriteriaHolder);
    }

    /* renamed from: a */
    private static SelfieCaptureExperienceCriteriaHolder m3797a(SelfieCaptureExperienceCriteriaHolder selfieCaptureExperienceCriteriaHolder) {
        return selfieCaptureExperienceCriteriaHolder != null ? selfieCaptureExperienceCriteriaHolder : new SelfieCaptureExperienceCriteriaHolder();
    }

    /* renamed from: aF */
    private void m3798aF() {
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this._ctx) != 0) {
            throw new KmcRuntimeException(ErrorInfo.KMC_UT_GOOGLE_PLAY_SERVICES_REPAIRABLE);
        }
    }
}
