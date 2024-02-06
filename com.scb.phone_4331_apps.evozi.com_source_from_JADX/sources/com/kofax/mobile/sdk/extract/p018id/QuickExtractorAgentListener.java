package com.kofax.mobile.sdk.extract.p018id;

import com.kofax.kmc.ken.engines.data.Image;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk.extract.id.QuickExtractorAgentListener */
public interface QuickExtractorAgentListener {
    void onFaceExtracted(Image image, Image image2);

    void onFieldsExtracted(List<DataField> list, Image image);
}
