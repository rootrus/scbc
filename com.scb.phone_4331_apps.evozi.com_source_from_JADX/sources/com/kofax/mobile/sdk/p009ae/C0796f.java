package com.kofax.mobile.sdk.p009ae;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.ken.engines.processing.CropType;
import com.kofax.kmc.ken.engines.processing.DocumentDimensions;
import com.kofax.kmc.ken.engines.processing.ImageProcessorConfiguration;
import com.kofax.mobile.sdk._internal.impl.detection.C0672i;
import com.kofax.mobile.sdk._internal.impl.detection.C0673j;
import com.kofax.mobile.sdk._internal.impl.detection.C0674k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk.ae.f */
public class C0796f {

    /* renamed from: Ua */
    C0672i f1910Ua = new C0672i();

    /* renamed from: a */
    public C0797g mo11938a(ImageProcessorConfiguration imageProcessorConfiguration, Bitmap bitmap) {
        C0795d.m1881b(imageProcessorConfiguration);
        if (CropType.CROP_NONE.equals(imageProcessorConfiguration.cropType)) {
            return m1885l(bitmap);
        }
        return m1882a(this.f1910Ua.mo11603a(m1883c(imageProcessorConfiguration), bitmap));
    }

    public void doCleanUp() {
        this.f1910Ua.doCleanUp();
    }

    /* renamed from: c */
    private C0674k m1883c(ImageProcessorConfiguration imageProcessorConfiguration) {
        C0674k kVar = new C0674k();
        kVar.advancedConfiguration = imageProcessorConfiguration.advancedConfiguration;
        kVar.f1605HJ = m1884d(imageProcessorConfiguration);
        kVar.f1606HK = imageProcessorConfiguration.outputDPI;
        return kVar;
    }

    /* renamed from: a */
    private C0797g m1882a(C0673j jVar) {
        return new C0797g(jVar.getProcessedImage(), jVar.getBounds(), jVar.mo11609lR());
    }

    /* renamed from: l */
    private C0797g m1885l(Bitmap bitmap) {
        return new C0797g(bitmap, (BoundingTetragon) null, false);
    }

    /* renamed from: d */
    private List<Float> m1884d(ImageProcessorConfiguration imageProcessorConfiguration) {
        DocumentDimensions documentDimensions = imageProcessorConfiguration.documentDimensions;
        if (documentDimensions == null || documentDimensions.getLongEdge() == null || documentDimensions.getShortEdge() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(documentDimensions.getLongEdge().floatValue() / documentDimensions.getShortEdge().floatValue()));
        return arrayList;
    }
}
