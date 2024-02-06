package com.kofax.mobile.sdk.p021i;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0704a;
import com.kofax.mobile.sdk.p016b.C8295a;
import java.io.File;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.i.e */
public class C8406e implements C8295a {

    /* renamed from: za */
    private static final String f4938za = "Fields.xml";

    /* renamed from: yR */
    private final C0925i f4939yR;

    @HmlPinActivity
    public C8406e(C0704a aVar) {
        if (aVar != null) {
            this.f4939yR = new C0925i(aVar.get());
            return;
        }
        throw new IllegalArgumentException("provider cannot be null");
    }

    /* renamed from: G */
    public File mo54758G(String str) {
        return m4910r(str, f4938za);
    }

    /* renamed from: r */
    private File m4910r(String str, String str2) {
        File file = new File(this.f4939yR.getProject(str, this.f4939yR.mo12315X(str)), str2);
        if (file.exists()) {
            return file;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_FILE_NOT_FOUND);
    }
}
