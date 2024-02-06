package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import bolts.Continuation;
import bolts.Task;
import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.kmc.ken.engines.data.BarCodeType;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.C7888b;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7906a;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7911f;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p070a.C8240b;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.af */
public class C8035af implements C7906a {

    /* renamed from: LM */
    private final C8240b f3878LM;

    /* renamed from: LN */
    private final C7911f f3879LN;

    /* renamed from: LO */
    private final C7888b f3880LO;

    @HmlPinActivity
    C8035af(C8240b bVar, C7911f fVar, C7888b bVar2) {
        m4036h(bVar, "reader");
        m4036h(fVar, "parser");
        m4036h(bVar2, "base64Decoder");
        this.f3878LM = bVar;
        this.f3879LN = fVar;
        this.f3880LO = bVar2;
    }

    /* renamed from: h */
    private static void m4036h(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" cannot be null");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public Task<List<DataField>> mo54310a(final String str, final String str2, Image image) {
        if (image == null) {
            return Task.forResult((Object) null);
        }
        Set<BarCodeType> n = this.f3879LN.mo54317n(str, str2);
        if (n.isEmpty()) {
            return Task.forResult((Object) null);
        }
        return this.f3878LM.mo54700a(image, str, str2, n).onSuccess(new Continuation<BarCodeResult, List<DataField>>() {
            public List<DataField> then(Task<BarCodeResult> task) throws Exception {
                BarCodeResult barCodeResult = (BarCodeResult) task.getResult();
                if (barCodeResult != null) {
                    return C8035af.this.m4035d(str, str2, barCodeResult.getValue());
                }
                throw new KmcRuntimeException(ErrorInfo.KMC_BC_NO_BARCODE_FOUND);
            }
        });
    }

    /* renamed from: a */
    public Task<List<DataField>> mo54311a(final String str, final String str2, final String str3) {
        return Task.call(new Callable<List<DataField>>() {
            /* renamed from: mR */
            public List<DataField> call() throws Exception {
                return C8035af.this.m4035d(str, str2, str3);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public List<DataField> m4035d(String str, String str2, String str3) {
        if (this.f3880LO.mo54216v(str3)) {
            str3 = this.f3880LO.decode(str3);
        }
        try {
            return this.f3879LN.mo54316a(str, str2, (String) null, str3);
        } catch (KmcRuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new KmcRuntimeException(ErrorInfo.KMC_CL_INVALID_BARCODE_STRING, e2);
        }
    }
}
