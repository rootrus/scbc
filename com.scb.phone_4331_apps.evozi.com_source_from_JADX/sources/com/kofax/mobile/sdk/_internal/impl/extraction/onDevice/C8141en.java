package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.android.abc.document.Document;
import com.kofax.android.abc.document.Serializer;
import com.kofax.android.abc.vrs.Vrs;
import com.kofax.android.abc.vrs.VrsImage;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk._internal.C7919g;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7912h;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.en */
public class C8141en implements C7912h {

    /* renamed from: wM */
    private final C7919g f4163wM;

    @HmlPinActivity
    public C8141en(C7919g gVar) {
        this.f4163wM = gVar;
    }

    /* renamed from: x */
    public Document mo54318x(Image image) {
        Vrs vrs = new Vrs();
        VrsImage vrsImage = new VrsImage();
        Serializer serializer = new Serializer();
        C7919g.C7920a w = this.f4163wM.mo54325w(image);
        try {
            String imageMetaData = image.getImageMetaData();
            vrsImage.fromBitmap(w.getBitmap());
            int lastReturnCode = (int) vrsImage.getLastReturnCode();
            if (lastReturnCode == 0) {
                String ktdxXML = vrs.getKtdxXML(vrsImage, imageMetaData);
                int lastReturnCode2 = vrs.getLastReturnCode();
                if (lastReturnCode2 == 0) {
                    return serializer.deserialize(ktdxXML);
                }
                throw new RuntimeException(vrs.getErrorMessage(lastReturnCode2));
            }
            throw new RuntimeException(vrs.getErrorMessage(lastReturnCode));
        } finally {
            vrsImage.dispose();
            w.mo54326be();
        }
    }
}
