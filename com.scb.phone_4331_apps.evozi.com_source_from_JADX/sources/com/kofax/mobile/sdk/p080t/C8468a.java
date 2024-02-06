package com.kofax.mobile.sdk.p080t;

import android.content.Context;
import bolts.Task;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk._internal.extraction.p004id.C0530i;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7913j;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8078c;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p016b.C0862c;
import com.kofax.mobile.sdk.p016b.C0863d;
import java.io.File;
import java.util.List;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.t.a */
public class C8468a extends C8078c {

    /* renamed from: NC */
    private final C8472d f5040NC;

    @HmlPinActivity
    C8468a(Context context, C0862c cVar, C0863d dVar, C0530i iVar, C7913j jVar) {
        this(context, cVar, iVar, jVar, new C8472d("cee"), new C8473e());
    }

    private C8468a(Context context, C0862c cVar, C0530i iVar, C7913j jVar, C8472d dVar, C8473e eVar) {
        super(cVar, new C8470c(context, cVar, iVar, dVar, eVar), jVar);
        this.f5040NC = dVar;
    }

    /* renamed from: b */
    public Task<List<DataField>> mo54312b(String str, String str2, Image image) {
        if (image != null) {
            File file = new File(image.getImageFilePath());
            if (file.exists()) {
                this.f5040NC.mo55373az(file.getName());
            } else {
                this.f5040NC.mo55373az((String) null);
            }
            m5086e(image, "input");
        }
        return super.mo54312b(str, str2, image);
    }

    /* renamed from: e */
    private void m5086e(Image image, String str) {
        if (image.getImageFileRep() == Image.ImageFileRep.FILE_STORED) {
            this.f5040NC.mo55374b(new File(image.getImageFilePath()), str);
            return;
        }
        this.f5040NC.mo55372a(image.getImageBitmap(), str);
    }
}
