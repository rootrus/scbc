package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import bolts.Task;
import com.kofax.android.abc.document.Document;
import com.kofax.android.abc.document.Field;
import com.kofax.android.abc.vrs.VrsImage;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk._internal.extraction.p004id.C0531n;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7907b;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7913j;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p016b.C0862c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.bouncycastle.asn1.x509.DisplayText;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.c */
public class C8078c implements C7907b {

    /* renamed from: KY */
    private final C0862c f3984KY;
    /* access modifiers changed from: private */

    /* renamed from: KZ */
    public final C0531n f3985KZ;

    /* renamed from: La */
    private final C7913j f3986La;

    @HmlPinActivity
    public C8078c(C0862c cVar, C0531n nVar, C7913j jVar) {
        this.f3984KY = cVar;
        this.f3985KZ = nVar;
        this.f3986La = jVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public List<DataField> m4163b(String str, String str2, Document document, VrsImage vrsImage) {
        ArrayList arrayList;
        synchronized (this) {
            this.f3986La.mo54319a(str, str2, document, vrsImage);
            arrayList = new ArrayList();
            Iterator<Field> it = document.getFields().iterator();
            while (it.hasNext()) {
                arrayList.add(DataField.fromExtractorField(it.next()));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public static VrsImage m4159E(Image image) {
        VrsImage vrsImage = new VrsImage();
        try {
            if (image.getImageFileRep() == Image.ImageFileRep.FILE_STORED) {
                vrsImage.fromFile(image.getImageFilePath());
            } else {
                Integer imageDPI = image.getImageDPI();
                vrsImage.fromBitmap(image.getImageBitmap(), imageDPI != null ? imageDPI.intValue() : DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
            }
            return vrsImage;
        } catch (Throwable th) {
            vrsImage.dispose();
            throw th;
        }
    }

    /* renamed from: b */
    public Task<List<DataField>> mo54312b(final String str, final String str2, final Image image) {
        if ((str == null || str.length() == 0) || str2 == null || image == null) {
            return Task.forError(new RuntimeException("No region, image or no class Id provided"));
        }
        if (!this.f3984KY.mo12123f(str, str2)) {
            return Task.forResult((Object) null);
        }
        return Task.callInBackground(new Callable<List<DataField>>() {
            /* renamed from: mR */
            public List<DataField> call() {
                Document a;
                VrsImage F = C8078c.m4159E(image);
                try {
                    a = C8078c.this.f3985KZ.mo11412a(str, str2, F);
                    List<DataField> a2 = C8078c.this.m4163b(str, str2, a, F);
                    a.dispose();
                    F.dispose();
                    return a2;
                } catch (Throwable th) {
                    F.dispose();
                    throw th;
                }
            }
        });
    }
}
