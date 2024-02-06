package com.kofax.mobile.sdk.capture.parameter;

import com.kofax.mobile.sdk.capture.model.CaptureData;
import java.io.Serializable;

public class ProcessingParameters implements Serializable {
    public CaptureData captureData = new CaptureData();
    public String operations;
    public ProcessingType processingType = ProcessingType.ON_DEVICE;
    public boolean useMrzPageDetection;
    public boolean useTargetFrameCrop;

    public enum ProcessingType {
        OFF,
        ON_DEVICE
    }
}
