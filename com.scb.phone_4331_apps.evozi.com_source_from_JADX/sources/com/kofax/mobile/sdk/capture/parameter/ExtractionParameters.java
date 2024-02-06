package com.kofax.mobile.sdk.capture.parameter;

import android.content.Context;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0704a;
import com.kofax.mobile.sdk.extract.p018id.IProjectProvider;
import java.io.Serializable;

public class ExtractionParameters implements Serializable {
    private ExtractionType adb = ExtractionType.RTTI;
    public ExtractionCredentials credentials = new ExtractionCredentials();
    public String serverUrl;

    public enum ExtractionType {
        RTTI,
        KTA,
        ON_DEVICE,
        OFF
    }

    public ExtractionType getExtractionType() {
        return this.adb;
    }

    public void setExtractionType(ExtractionType extractionType) {
        if (extractionType != null) {
            this.adb = extractionType;
            return;
        }
        throw new IllegalArgumentException("extractionType cannot be null");
    }

    public void setProjectProvider(Context context, IProjectProvider iProjectProvider) {
        new C0704a(context).mo11637a(iProjectProvider);
    }
}
