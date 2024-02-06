package com.kofax.kmc.kui.uicontrols.captureanimations;

import com.kofax.kmc.ken.engines.data.DetectionResult;
import com.kofax.kmc.kui.uicontrols.ImageCapturedEvent;
import com.kofax.kmc.kui.uicontrols.PageDetectionEvent;

class CaptureExperienceData {
    private boolean _sdkCaptureRequested;

    /* renamed from: lU */
    private int f666lU = -1;

    /* renamed from: lV */
    private int f667lV = -1;

    /* renamed from: mA */
    private boolean f668mA;

    /* renamed from: mB */
    private boolean f669mB;

    /* renamed from: mC */
    private boolean f670mC;

    /* renamed from: mD */
    private boolean f671mD;

    /* renamed from: mE */
    private DetectionResult f672mE;

    /* renamed from: mF */
    private boolean f673mF;

    /* renamed from: mG */
    private PageDetectionEvent f674mG;

    /* renamed from: mH */
    private int f675mH;

    /* renamed from: mI */
    private int f676mI;

    /* renamed from: mJ */
    private int f677mJ;

    /* renamed from: mK */
    private boolean f678mK = true;

    /* renamed from: mL */
    private ImageCapturedEvent f679mL = null;

    /* renamed from: mg */
    private int f680mg;

    public int getStability() {
        return this.f680mg;
    }

    public void setStability(int i) {
        this.f680mg = i;
    }

    public int getPitch() {
        return this.f666lU;
    }

    public void setPitch(int i) {
        this.f666lU = i;
    }

    public int getRoll() {
        return this.f667lV;
    }

    public void setRoll(int i) {
        this.f667lV = i;
    }

    public boolean isFocused() {
        return this.f669mB;
    }

    public void setFocused(boolean z) {
        this.f669mB = z;
    }

    public boolean isPageDetected() {
        return this.f670mC;
    }

    public void setPageDetected(boolean z) {
        this.f670mC = z;
    }

    public boolean isCheckCaptureExperience() {
        return this.f671mD;
    }

    public void setCheckCaptureExperience(boolean z) {
        this.f671mD = z;
    }

    public boolean isMICRFound() {
        return this.f672mE != null;
    }

    public DetectionResult getDocumentDetectionGuidanceList() {
        return this.f672mE;
    }

    public void setDocumentDetectionGuidanceList(DetectionResult detectionResult) {
        this.f672mE = detectionResult;
    }

    public PageDetectionEvent getPageDetectionEvent() {
        return this.f674mG;
    }

    public boolean isShowNoDocumentFoundMessage() {
        return this.f673mF;
    }

    public void setShowNoDocumentFoundMessage(boolean z) {
        this.f673mF = z;
    }

    public void setPageDetectionEvent(PageDetectionEvent pageDetectionEvent) {
        this.f674mG = pageDetectionEvent;
    }

    public int getPageAreaThreshold() {
        return this.f675mH;
    }

    public void setPageAreaThreshold(int i) {
        this.f675mH = i;
    }

    public int getPageLongEdgeThreshold() {
        return this.f676mI;
    }

    public void setPageLongEdgeThreshold(int i) {
        this.f676mI = i;
    }

    public int getPageShortEdgeThreshold() {
        return this.f677mJ;
    }

    public void setPageShortEdgeThreshold(int i) {
        this.f677mJ = i;
    }

    public boolean isCriteriaMet() {
        return this.f668mA;
    }

    public void setCriteriaMet(boolean z) {
        this.f668mA = z;
    }

    public boolean isPageDetectOrientationFlag() {
        return this.f678mK;
    }

    public void setPageDetectOrientationFlag(boolean z) {
        this.f678mK = z;
    }

    public boolean isSdkCaptureRequested() {
        return this._sdkCaptureRequested;
    }

    public void setSdkCaptureRequested(boolean z) {
        this._sdkCaptureRequested = z;
    }

    public ImageCapturedEvent getImageCapturedEvent() {
        return this.f679mL;
    }

    public void setImageCapturedEvent(ImageCapturedEvent imageCapturedEvent) {
        this.f679mL = imageCapturedEvent;
    }

    public CaptureExperienceData() {
    }

    public CaptureExperienceData(CaptureExperienceData captureExperienceData) {
        setCheckCaptureExperience(captureExperienceData.isCheckCaptureExperience());
        setPageDetectOrientationFlag(captureExperienceData.isPageDetectOrientationFlag());
        setShowNoDocumentFoundMessage(captureExperienceData.isShowNoDocumentFoundMessage());
        setPageAreaThreshold(captureExperienceData.getPageAreaThreshold());
        setPageLongEdgeThreshold(captureExperienceData.getPageLongEdgeThreshold());
        setPageShortEdgeThreshold(captureExperienceData.getPageShortEdgeThreshold());
        setFocused(captureExperienceData.isFocused());
        setStability(captureExperienceData.getStability());
        setPitch(captureExperienceData.getPitch());
        setRoll(captureExperienceData.getRoll());
    }
}
