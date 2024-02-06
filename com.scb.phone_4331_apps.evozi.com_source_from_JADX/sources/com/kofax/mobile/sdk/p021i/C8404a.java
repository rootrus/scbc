package com.kofax.mobile.sdk.p021i;

import com.kofax.kmc.kut.utilities.error.FileNotFoundException;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0704a;
import com.kofax.mobile.sdk.p016b.C8296b;
import java.io.File;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.i.a */
public class C8404a implements C8296b {

    /* renamed from: yR */
    private final C0925i f4936yR;

    @HmlPinActivity
    public C8404a(C0704a aVar) {
        if (aVar != null) {
            this.f4936yR = new C0925i(aVar.get());
            return;
        }
        throw new IllegalArgumentException("provider cannot be null");
    }

    /* renamed from: H */
    public File mo54759H(String str) {
        return m4905r(str, ".config");
    }

    /* renamed from: I */
    public File mo54760I(String str) {
        return m4905r(str, ".model");
    }

    /* renamed from: r */
    private File m4905r(String str, String str2) {
        File project = this.f4936yR.getProject(str, this.f4936yR.mo12315X(str));
        StringBuilder sb = new StringBuilder();
        sb.append("Classifier");
        sb.append(str2);
        File file = new File(project, sb.toString());
        if (file.exists()) {
            return file;
        }
        throw new RuntimeException(new FileNotFoundException("could not find classifier config"));
    }
}
