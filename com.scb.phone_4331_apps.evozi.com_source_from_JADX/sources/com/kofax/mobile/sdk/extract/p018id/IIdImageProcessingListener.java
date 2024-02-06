package com.kofax.mobile.sdk.extract.p018id;

import com.kofax.kmc.ken.engines.data.Image;

/* renamed from: com.kofax.mobile.sdk.extract.id.IIdImageProcessingListener */
public interface IIdImageProcessingListener {
    void onBackImageProcessed(Image image);

    void onFrontImageProcessed(Image image);
}
