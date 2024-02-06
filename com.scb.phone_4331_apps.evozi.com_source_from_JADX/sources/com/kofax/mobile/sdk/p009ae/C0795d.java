package com.kofax.mobile.sdk.p009ae;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.kmc.ken.engines.processing.DocumentDimensions;
import com.kofax.kmc.ken.engines.processing.ImageProcessorConfiguration;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;

/* renamed from: com.kofax.mobile.sdk.ae.d */
public class C0795d {
    /* renamed from: b */
    public static void m1881b(ImageProcessorConfiguration imageProcessorConfiguration) {
        if (imageProcessorConfiguration != null) {
            if (imageProcessorConfiguration.documentDimensions != null) {
                DocumentDimensions documentDimensions = imageProcessorConfiguration.documentDimensions;
                if ((documentDimensions.getShortEdge() != null && documentDimensions.getShortEdge().floatValue() < BitmapDescriptorFactory.HUE_RED) || (documentDimensions.getLongEdge() != null && documentDimensions.getLongEdge().floatValue() < BitmapDescriptorFactory.HUE_RED)) {
                    throw new KmcRuntimeException(ErrorInfo.KMC_ED_INVALID_DOCUMENT_DIMENSIONS);
                }
            }
            if (imageProcessorConfiguration.outputDPI != null && imageProcessorConfiguration.outputDPI.intValue() < 0) {
                throw new KmcRuntimeException(ErrorInfo.KMC_ED_INVALID_DPI);
            }
            return;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_IP_NO_CONFIGURATION);
    }
}
