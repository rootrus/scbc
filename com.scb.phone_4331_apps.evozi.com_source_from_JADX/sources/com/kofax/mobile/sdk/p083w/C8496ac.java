package com.kofax.mobile.sdk.p083w;

import bolts.CancellationToken;
import bolts.Capture;
import bolts.Continuation;
import bolts.Task;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7907b;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p075e.C8340a;
import java.util.List;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.w.ac */
public class C8496ac extends C8500ae {

    /* renamed from: Ql */
    private final C7907b f5153Ql;

    /* renamed from: Qm */
    private final C8498a f5154Qm;

    /* renamed from: com.kofax.mobile.sdk.w.ac$a */
    public interface C8498a {
        /* renamed from: c */
        void mo55399c(C8340a aVar, List<DataField> list, Exception exc);

        /* renamed from: e */
        String mo55400e(C8340a aVar);

        /* renamed from: f */
        String mo55401f(C8340a aVar);

        /* renamed from: g */
        Image mo55402g(C8340a aVar);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55143a(Object obj, CancellationToken cancellationToken) {
        super.mo55143a(obj, cancellationToken);
    }

    @HmlPinActivity
    public C8496ac(C7907b bVar, C8498a aVar) {
        this.f5153Ql = bVar;
        this.f5154Qm = aVar;
    }

    /* renamed from: a */
    public void mo55390a(C8340a aVar) {
        Image g = this.f5154Qm.mo55402g(aVar);
        String e = this.f5154Qm.mo55400e(aVar);
        String f = this.f5154Qm.mo55401f(aVar);
        if (g != null && f != null) {
            Capture capture = new Capture();
            Capture capture2 = new Capture();
            m5192a(g, e, f, capture, capture2);
            this.f5154Qm.mo55399c(aVar, (List) capture.get(), (Exception) capture2.get());
        }
    }

    /* renamed from: a */
    private void m5192a(Image image, String str, String str2, final Capture<List<DataField>> capture, final Capture<Exception> capture2) {
        try {
            this.f5153Ql.mo54312b(str, str2, image).continueWith(new Continuation<List<DataField>, Void>() {
                public Void then(Task<List<DataField>> task) throws Exception {
                    capture.set(task.getResult());
                    capture2.set(task.getError());
                    return null;
                }
            }).waitForCompletion();
        } catch (InterruptedException e) {
            capture2.set(e);
        }
    }
}
