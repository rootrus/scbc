package com.kofax.mobile.sdk.capture.processing;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk.capture.parameter.ProcessingParameters;

public interface IImageProcessor {
    void cancel();

    @Deprecated
    void process(Bitmap bitmap);

    void process(Image image);

    void setImageOutListener(IImageProcessorListener iImageProcessorListener);

    void setParameters(ProcessingParameters processingParameters);
}
