package org.jnbis.internal.record;

public abstract class BaseVariableResolutionImageRecord extends BaseImageRecord {
    private String bitsPerPixel;
    private String captureDate;
    private String comment;
    private String deviceMonitoringMode;
    private String horizontalPixelScale;
    private String impressionType;
    private String scaleUnits;
    private String scannedHorizontalPixelScale;
    private String scannedVerticalPixelScale;
    private String sourceAgency;
    private String verticalPixelScale;

    public String getImpressionType() {
        return this.impressionType;
    }

    public void setImpressionType(String str) {
        this.impressionType = str;
    }

    public String getSourceAgency() {
        return this.sourceAgency;
    }

    public void setSourceAgency(String str) {
        this.sourceAgency = str;
    }

    public String getCaptureDate() {
        return this.captureDate;
    }

    public void setCaptureDate(String str) {
        this.captureDate = str;
    }

    public String getScaleUnits() {
        return this.scaleUnits;
    }

    public void setScaleUnits(String str) {
        this.scaleUnits = str;
    }

    public String getHorizontalPixelScale() {
        return this.horizontalPixelScale;
    }

    public void setHorizontalPixelScale(String str) {
        this.horizontalPixelScale = str;
    }

    public String getVerticalPixelScale() {
        return this.verticalPixelScale;
    }

    public void setVerticalPixelScale(String str) {
        this.verticalPixelScale = str;
    }

    public String getBitsPerPixel() {
        return this.bitsPerPixel;
    }

    public void setBitsPerPixel(String str) {
        this.bitsPerPixel = str;
    }

    public String getScannedHorizontalPixelScale() {
        return this.scannedHorizontalPixelScale;
    }

    public void setScannedHorizontalPixelScale(String str) {
        this.scannedHorizontalPixelScale = str;
    }

    public String getScannedVerticalPixelScale() {
        return this.scannedVerticalPixelScale;
    }

    public void setScannedVerticalPixelScale(String str) {
        this.scannedVerticalPixelScale = str;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public String getDeviceMonitoringMode() {
        return this.deviceMonitoringMode;
    }

    public void setDeviceMonitoringMode(String str) {
        this.deviceMonitoringMode = str;
    }
}
