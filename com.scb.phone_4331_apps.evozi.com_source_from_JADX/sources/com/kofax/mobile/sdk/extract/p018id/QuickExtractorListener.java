package com.kofax.mobile.sdk.extract.p018id;

import com.kofax.kmc.ken.engines.data.Image;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk.extract.id.QuickExtractorListener */
public interface QuickExtractorListener {
    void onExtractionComplete(List<DataField> list, Image image, Exception exc);
}
