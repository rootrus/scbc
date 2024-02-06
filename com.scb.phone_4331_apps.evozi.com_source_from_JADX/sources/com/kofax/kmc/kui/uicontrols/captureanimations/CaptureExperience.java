package com.kofax.kmc.kui.uicontrols.captureanimations;

import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import com.kofax.kmc.ken.engines.data.DetectionResult;
import com.kofax.kmc.kui.uicontrols.AutoFocusResultEvent;
import com.kofax.kmc.kui.uicontrols.AutoFocusResultListener;
import com.kofax.kmc.kui.uicontrols.ImageCaptureView;
import com.kofax.kmc.kui.uicontrols.ImageCapturedEvent;
import com.kofax.kmc.kui.uicontrols.ImageCapturedListener;
import com.kofax.kmc.kui.uicontrols.LevelnessEvent;
import com.kofax.kmc.kui.uicontrols.LevelnessListener;
import com.kofax.kmc.kui.uicontrols.StabilityDelayEvent;
import com.kofax.kmc.kui.uicontrols.StabilityDelayListener;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class CaptureExperience implements AutoFocusResultListener, ImageCapturedListener, LevelnessListener, StabilityDelayListener {
    protected float _aspectRatio;
    protected CaptureExperienceData _captureExperienceData = new CaptureExperienceData();
    protected boolean _continuousCapture;
    protected ImageCaptureView _imageCaptureView;
    protected Set<ImageCapturedListener> _imageCapturedListeners = new LinkedHashSet();
    protected final Object _lock;
    protected boolean _sdkCaptureRequested;
    protected final Handler _uiHandler = new Handler(Looper.getMainLooper());
    protected boolean _vibrationEnabled = false;
    protected Vibrator _vibrator;

    /* renamed from: ml */
    private boolean f649ml;

    /* renamed from: mm */
    private CaptureExperienceCriteriaHolder f650mm;

    /* renamed from: mn */
    private int f651mn;

    /* renamed from: mo */
    private int f652mo;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo10654b(CaptureExperienceData captureExperienceData);

    /* access modifiers changed from: protected */
    public abstract void removeAllViews();

    CaptureExperience(ImageCaptureView imageCaptureView) {
        if (imageCaptureView != null) {
            mo10650a((CaptureExperienceCriteriaHolder) null);
            this._imageCaptureView = imageCaptureView;
            this._lock = new Object();
            addCameraEventListeners();
            this._vibrator = (Vibrator) imageCaptureView.getContext().getSystemService("vibrator");
            return;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_NULL_POINTER_EXCEPTION);
    }

    /* access modifiers changed from: protected */
    public void addCameraEventListeners() {
        this._imageCaptureView.addStabilityDelayListener(this);
        this._imageCaptureView.addLevelnessListener(this);
        this._imageCaptureView.addOnAutoFocusResultListener(this);
        this._imageCaptureView.addOnImageCapturedListener(this);
    }

    /* access modifiers changed from: protected */
    public void removeCameraEventListeners() {
        this._imageCaptureView.removeStabilityDelayListener(this);
        this._imageCaptureView.removeLevelnessListener(this);
        this._imageCaptureView.removeOnAutoFocusResultListener(this);
        this._imageCaptureView.removeOnImageCapturedListener(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10650a(CaptureExperienceCriteriaHolder captureExperienceCriteriaHolder) {
        if (captureExperienceCriteriaHolder == null) {
            captureExperienceCriteriaHolder = new CaptureExperienceCriteriaHolder();
        }
        this.f650mm = captureExperienceCriteriaHolder;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10651a(final CaptureExperienceData captureExperienceData) {
        captureExperienceData.setSdkCaptureRequested(this._sdkCaptureRequested);
        this._uiHandler.post(new Runnable() {
            public void run() {
                CaptureExperience.this.mo10654b(captureExperienceData);
            }
        });
        synchronized (this._lock) {
            if (this.f649ml && !this._sdkCaptureRequested && captureCriteriaMet(captureExperienceData)) {
                captureExperienceData.setCriteriaMet(true);
                captureExperienceData.setSdkCaptureRequested(true);
                this._uiHandler.post(new Runnable() {
                    public void run() {
                        CaptureExperience.this.mo10654b(captureExperienceData);
                    }
                });
                this._sdkCaptureRequested = true;
                this.f649ml = this._continuousCapture;
                this._imageCaptureView.takePictureForCaptureExperience("com.kofax.kmc.kui.uicontrols.", this.f650mm.isRefocusBeforeCaptureEnabled());
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean captureCriteriaMet(CaptureExperienceData captureExperienceData) {
        if (captureCriteriaMetInternal(captureExperienceData)) {
            return mo10655c(captureExperienceData);
        }
        captureExperienceData.setCriteriaMet(false);
        return false;
    }

    public void addOnImageCapturedListener(ImageCapturedListener imageCapturedListener) {
        if (imageCapturedListener != null) {
            this._imageCapturedListeners.add(imageCapturedListener);
        }
    }

    public void removeOnImageCapturedListener(ImageCapturedListener imageCapturedListener) {
        this._imageCapturedListeners.remove(imageCapturedListener);
    }

    public void setVibrationEnabled(boolean z) {
        this._vibrationEnabled = z;
    }

    public boolean isVibrationEnabled() {
        return this._vibrationEnabled;
    }

    public void takePicture() {
        m502d(false);
    }

    public void takePictureContinually() {
        m502d(true);
    }

    /* renamed from: d */
    private void m502d(boolean z) {
        CaptureExperienceData captureExperienceData = new CaptureExperienceData();
        this._captureExperienceData = captureExperienceData;
        this._sdkCaptureRequested = false;
        this.f651mn = 0;
        mo10654b(captureExperienceData);
        synchronized (this._lock) {
            this._continuousCapture = z;
            this.f649ml = true;
        }
    }

    public void stopCapture() {
        this._captureExperienceData = new CaptureExperienceData();
        this.f649ml = false;
    }

    public void onImageCaptured(ImageCapturedEvent imageCapturedEvent) {
        CaptureExperienceData captureExperienceData = new CaptureExperienceData(this._captureExperienceData);
        this._captureExperienceData = captureExperienceData;
        this.f651mn = 0;
        captureExperienceData.setDocumentDetectionGuidanceList((DetectionResult) null);
        mo10651a(this._captureExperienceData);
        synchronized (this._lock) {
            this._sdkCaptureRequested = false;
        }
        if (this._vibrationEnabled) {
            try {
                this._vibrator.vibrate(500);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void invokeImageCapturedListeners(ImageCapturedEvent imageCapturedEvent) {
        for (ImageCapturedListener onImageCaptured : this._imageCapturedListeners) {
            onImageCaptured.onImageCaptured(imageCapturedEvent);
        }
    }

    public void onAutoFocus(AutoFocusResultEvent autoFocusResultEvent) {
        this._captureExperienceData.setFocused(autoFocusResultEvent.getSuccess());
        mo10651a(this._captureExperienceData);
    }

    public void onLevelness(LevelnessEvent levelnessEvent) {
        this._captureExperienceData.setPitch(Math.abs(levelnessEvent.getPitch()));
        this._captureExperienceData.setRoll(Math.abs(levelnessEvent.getRoll()));
        mo10651a(this._captureExperienceData);
    }

    public void onStabilityDelay(StabilityDelayEvent stabilityDelayEvent) {
        this._captureExperienceData.setStability(stabilityDelayEvent.getStability());
        mo10651a(this._captureExperienceData);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo10655c(CaptureExperienceData captureExperienceData) {
        if (!this.f650mm.isStabilityThresholdEnabled()) {
            return true;
        }
        this.f651mn++;
        int stability = this.f652mo + captureExperienceData.getStability();
        this.f652mo = stability;
        int i = this.f651mn;
        if (i >= 6) {
            if ((stability / i) - this.f650mm.getStabilityThreshold() > 0) {
                this.f652mo = 0;
                this.f651mn = 0;
                return true;
            }
            this.f652mo = 0;
            this.f651mn = 0;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean captureCriteriaMetInternal(CaptureExperienceData captureExperienceData) {
        if (this.f650mm.isFocusEnabled() && !captureExperienceData.isFocused()) {
            return false;
        }
        if (this.f650mm.isPitchThresholdEnabled() && this.f650mm.getPitchThreshold() != 45 && this.f650mm.getPitchThreshold() < captureExperienceData.getPitch()) {
            return false;
        }
        if (!this.f650mm.isRollThresholdEnabled() || this.f650mm.getRollThreshold() == 45 || this.f650mm.getRollThreshold() >= captureExperienceData.getRoll()) {
            return true;
        }
        return false;
    }

    public void destroy() {
        removeCameraEventListeners();
        removeAllViews();
        CaptureExperienceData captureExperienceData = this._captureExperienceData;
        if (captureExperienceData != null) {
            captureExperienceData.setDocumentDetectionGuidanceList((DetectionResult) null);
            this._captureExperienceData = null;
        }
    }
}
