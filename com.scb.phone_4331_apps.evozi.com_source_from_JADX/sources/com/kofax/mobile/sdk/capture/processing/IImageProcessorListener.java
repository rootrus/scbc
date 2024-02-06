package com.kofax.mobile.sdk.capture.processing;

import com.kofax.kmc.ken.engines.data.Image;

public interface IImageProcessorListener {
    void onImageProcessed(Image image);
}
