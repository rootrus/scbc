package com.kofax.mobile.sdk.extract.p018id;

import android.content.Context;
import android.graphics.Bitmap;
import bolts.Continuation;
import bolts.Task;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.C7919g;
import com.kofax.mobile.sdk._internal.impl.C8196u;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick.C8157b;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick.C8159d;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick.C8161f;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick.C8162g;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick.C8163h;
import com.kofax.mobile.sdk.p071al.C8285a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.kofax.mobile.sdk.extract.id.QuickExtractor */
public class QuickExtractor {
    private static final String TAG = QuickExtractor.class.getSimpleName();
    private final C8196u aes = new C8196u();
    /* access modifiers changed from: private */
    public final C8163h aet = new C8163h();
    /* access modifiers changed from: private */
    public final C8159d aeu;
    /* access modifiers changed from: private */
    public final C8162g aev;
    /* access modifiers changed from: private */
    public final AtomicBoolean aew = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public final AtomicBoolean aex = new AtomicBoolean(false);

    public QuickExtractor(Context context, QuickExtractorSettings quickExtractorSettings) {
        this.aeu = new C8159d(quickExtractorSettings.getBarcodes());
        this.aev = new C8162g(context, quickExtractorSettings);
    }

    public void destroy() {
        if (this.aex.compareAndSet(false, true)) {
            this.aet.destroy();
            this.aeu.destroy();
            this.aev.destroy();
        }
    }

    public void extract(Image image, QuickExtractorListener quickExtractorListener) {
        if (this.aex.get()) {
            throw new IllegalStateException("Destroyed");
        } else if (this.aew.compareAndSet(false, true)) {
            C7919g.C7920a w = this.aes.mo54325w(image);
            try {
                m4790a(w.getBitmap(), quickExtractorListener);
            } finally {
                w.mo54326be();
            }
        } else {
            throw new KmcRuntimeException(ErrorInfo.KMC_EV_PROCESS_PAGE_BUSY);
        }
    }

    /* renamed from: a */
    private void m4790a(Bitmap bitmap, QuickExtractorListener quickExtractorListener) {
        final C8157b bVar = new C8157b(bitmap, 0);
        final Task callInBackground = Task.callInBackground(new Callable<C8161f>() {
            /* renamed from: qh */
            public C8161f call() {
                return QuickExtractor.this.aet.mo54569a(bVar);
            }
        });
        final Task callInBackground2 = Task.callInBackground(new Callable<C8161f>() {
            /* renamed from: qh */
            public C8161f call() {
                return QuickExtractor.this.aeu.mo54562a(bVar);
            }
        });
        final Task callInBackground3 = Task.callInBackground(new Callable<C8161f>() {
            /* renamed from: qh */
            public C8161f call() {
                return QuickExtractor.this.aev.mo54567a(bVar);
            }
        });
        final QuickExtractorListener quickExtractorListener2 = quickExtractorListener;
        Task.whenAll(Arrays.asList(new Task[]{callInBackground, callInBackground2, callInBackground3})).continueWith(new Continuation<Void, Void>() {
            public Void then(Task<Void> task) {
                Image image;
                C8161f fVar = (C8161f) callInBackground3.getResult();
                List b = QuickExtractor.m4789a((C8161f) callInBackground.getResult(), (C8161f) callInBackground2.getResult());
                if (fVar == null) {
                    image = null;
                } else {
                    image = fVar.mo54565qi();
                }
                QuickExtractor.this.aew.set(false);
                if (!QuickExtractor.this.aex.get()) {
                    quickExtractorListener2.onExtractionComplete(b, image, task.getError());
                }
                return null;
            }
        }, Task.UI_THREAD_EXECUTOR).continueWithTask(new C8285a(TAG), Task.BACKGROUND_EXECUTOR);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static List<DataField> m4789a(C8161f... fVarArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C8161f fVar : fVarArr) {
            if (!(fVar == null || fVar.getFields() == null)) {
                linkedHashSet.addAll(fVar.getFields());
            }
        }
        return new ArrayList(linkedHashSet);
    }
}
