package com.kofax.mobile.sdk.p083w;

import bolts.CancellationToken;
import bolts.Capture;
import bolts.Continuation;
import bolts.Task;
import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7906a;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p075e.C8340a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk.w.h */
public class C8540h extends C8500ae {

    /* renamed from: PK */
    private final C7906a f5216PK;

    /* renamed from: PL */
    private final C8542a f5217PL;

    /* renamed from: com.kofax.mobile.sdk.w.h$a */
    public interface C8542a {
        /* renamed from: a */
        void mo55447a(C8340a aVar, List<List<DataField>> list, List<Exception> list2);

        /* renamed from: e */
        String mo55448e(C8340a aVar);

        /* renamed from: f */
        String mo55449f(C8340a aVar);

        /* renamed from: h */
        List<BarCodeResult> mo55450h(C8340a aVar);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55143a(Object obj, CancellationToken cancellationToken) {
        super.mo55143a(obj, cancellationToken);
    }

    public C8540h(C7906a aVar, C8542a aVar2) {
        this.f5216PK = aVar;
        this.f5217PL = aVar2;
    }

    /* renamed from: a */
    public void mo55390a(C8340a aVar) {
        String e = this.f5217PL.mo55448e(aVar);
        String f = this.f5217PL.mo55449f(aVar);
        for (BarCodeResult next : this.f5217PL.mo55450h(aVar)) {
            String value = next.getValue();
            if (!(value == null || value.length() == 0)) {
                ArrayList arrayList = new ArrayList();
                final Capture capture = new Capture(new ArrayList());
                final Capture capture2 = new Capture(new ArrayList());
                arrayList.add(this.f5216PK.mo54311a(e, f, next.getValue()).continueWith(new Continuation<List<DataField>, Void>() {
                    public Void then(Task<List<DataField>> task) throws Exception {
                        if (task.isFaulted()) {
                            ((ArrayList) capture2.get()).add(task.getError());
                            return null;
                        }
                        ((ArrayList) capture.get()).add(task.getResult());
                        return null;
                    }
                }));
                try {
                    Task.whenAll(arrayList).waitForCompletion();
                } catch (InterruptedException e2) {
                    ((ArrayList) capture2.get()).add(e2);
                } catch (Throwable th) {
                    this.f5217PL.mo55447a(aVar, (List) capture.get(), (List) capture2.get());
                    throw th;
                }
                this.f5217PL.mo55447a(aVar, (List) capture.get(), (List) capture2.get());
            }
        }
    }
}
