package com.kofax.mobile.sdk.capture.parameter;

import java.io.Serializable;

public class LookAndFeelParameters implements Serializable {
    public boolean exitEnabled = false;
    public boolean forceCaptureEnabled = false;
    public boolean galleryEnabled = false;
    public int manualCaptureTimer = 10;
    public boolean reviewCapturedImage = false;
    public boolean reviewProcessedImage = false;
    public TorchMode torch = TorchMode.AUTO;

    public enum TorchMode {
        OFF,
        ON,
        AUTO
    }
}
