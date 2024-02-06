package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import android.content.Context;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.extract.p018id.IProjectProvider;
import java.lang.ref.WeakReference;
import p040o.HmlPinActivity;
import p040o.HmlReviewDocumentActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.a */
public class C0704a implements HmlReviewDocumentActivity<IProjectProvider> {

    /* renamed from: KV */
    private static IProjectProvider f1638KV;

    /* renamed from: KW */
    private static final Object f1639KW = new Object();

    /* renamed from: KX */
    private final WeakReference<Context> f1640KX;

    @HmlPinActivity
    public C0704a(Context context) {
        this.f1640KX = new WeakReference<>(context.getApplicationContext());
    }

    /* renamed from: mP */
    public IProjectProvider get() {
        IProjectProvider iProjectProvider;
        synchronized (f1639KW) {
            if (f1638KV == null) {
                mo11637a(Injector.getInjector(this.f1640KX.get()).getLocalProjectProvider());
            }
            iProjectProvider = f1638KV;
        }
        return iProjectProvider;
    }

    /* renamed from: a */
    public void mo11637a(IProjectProvider iProjectProvider) {
        synchronized (f1639KW) {
            f1638KV = iProjectProvider;
        }
    }
}
