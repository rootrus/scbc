package org.jnbis.internal.record;

public abstract class BaseGrayscaleFingerprintRecord extends BaseImageRecord {
    private String fingerPosition;
    private String imageScanningResolution;
    private String impressionType;

    public String getImpressionType() {
        return this.impressionType;
    }

    public void setImpressionType(String str) {
        this.impressionType = str;
    }

    public String getFingerPosition() {
        return this.fingerPosition;
    }

    public void setFingerPosition(String str) {
        this.fingerPosition = str;
    }

    public String getImageScanningResolution() {
        return this.imageScanningResolution;
    }

    public void setImageScanningResolution(String str) {
        this.imageScanningResolution = str;
    }
}
