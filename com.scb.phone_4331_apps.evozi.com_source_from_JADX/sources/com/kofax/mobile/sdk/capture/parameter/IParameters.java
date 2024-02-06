package com.kofax.mobile.sdk.capture.parameter;

import java.io.Serializable;

public interface IParameters extends Serializable {
    ExtractionParameters getExtractionParameters();

    LookAndFeelParameters getLookAndFeelParameters();

    ProcessingParameters getProcessingParameters();
}
