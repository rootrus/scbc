package com.kofax.kmc.ken.engines.data;

public class PassportDetectionSettings extends DetectionSettings {
    public PassportDetectionSettings() {
        setTargetFrameAspectRatio(1.45d);
    }

    public PassportDetectionSettings(PassportDetectionSettings passportDetectionSettings) {
        super(passportDetectionSettings);
    }

    public double getTargetFrameAspectRatio() {
        return super.getTargetFrameAspectRatio();
    }

    public void setTargetFrameAspectRatio(double d) {
        if (d > 0.0d && d < 1.0d) {
            d = 1.0d / d;
        }
        super.setTargetFrameAspectRatio(d);
    }
}
