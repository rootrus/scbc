package com.kofax.mobile.sdk.p083w;

import bolts.CancellationToken;
import bolts.Capture;
import bolts.Continuation;
import bolts.Task;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7906a;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p075e.C8340a;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk.w.g */
public class C8537g extends C8500ae {

    /* renamed from: PF */
    private final C7906a f5211PF;

    /* renamed from: PG */
    private final C8539a f5212PG;

    /* renamed from: com.kofax.mobile.sdk.w.g$a */
    public interface C8539a {
        /* renamed from: a */
        void mo55442a(C8340a aVar, List<DataField> list, Exception exc);

        /* renamed from: e */
        String mo55443e(C8340a aVar);

        /* renamed from: f */
        String mo55444f(C8340a aVar);

        /* renamed from: g */
        Image mo55445g(C8340a aVar);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55143a(Object obj, CancellationToken cancellationToken) {
        super.mo55143a(obj, cancellationToken);
    }

    public C8537g(C7906a aVar, C8539a aVar2) {
        this.f5211PF = aVar;
        this.f5212PG = aVar2;
    }

    /* renamed from: a */
    public void mo55390a(C8340a aVar) {
        String e = this.f5212PG.mo55443e(aVar);
        String f = this.f5212PG.mo55444f(aVar);
        Image g = this.f5212PG.mo55445g(aVar);
        Capture capture = new Capture();
        Capture capture2 = new Capture();
        if (m5298G(g) && f != null) {
            m5299a(e, f, g, capture, capture2);
        }
        this.f5212PG.mo55442a(aVar, (List) capture.get(), (Exception) capture2.get());
    }

    /* renamed from: G */
    private boolean m5298G(Image image) {
        return (image == null || image.getImageBitmap() == null) ? false : true;
    }

    /* renamed from: a */
    private void m5299a(String str, String str2, Image image, final Capture<List<DataField>> capture, final Capture<Exception> capture2) {
        try {
            this.f5211PF.mo54310a(str, str2, image).continueWith(new Continuation<List<DataField>, Void>() {
                public Void then(Task<List<DataField>> task) throws Exception {
                    if (task.isFaulted()) {
                        capture2.set(task.getError());
                        return null;
                    }
                    capture.set(task.getResult());
                    return null;
                }
            }).waitForCompletion();
        } catch (InterruptedException e) {
            capture2.set(e);
        }
    }
}
