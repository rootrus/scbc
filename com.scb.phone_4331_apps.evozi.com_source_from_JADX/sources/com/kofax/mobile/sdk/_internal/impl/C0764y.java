package com.kofax.mobile.sdk._internal.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.kofax.mobile.sdk._internal.view.C0775i;
import java.lang.ref.WeakReference;

/* renamed from: com.kofax.mobile.sdk._internal.impl.y */
public class C0764y implements C0775i {
    /* access modifiers changed from: private */

    /* renamed from: wO */
    public final Handler f1868wO = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: wP */
    public WeakReference<View> f1869wP;
    /* access modifiers changed from: private */

    /* renamed from: wQ */
    public long f1870wQ;
    /* access modifiers changed from: private */

    /* renamed from: wR */
    public final Runnable f1871wR = new Runnable() {
        public void run() {
            View view = (View) C0764y.this.f1869wP.get();
            if (view == null) {
                C0764y.this.stop();
                return;
            }
            view.invalidate();
            C0764y.this.f1868wO.postDelayed(C0764y.this.f1871wR, C0764y.this.f1870wQ);
        }
    };

    /* renamed from: a */
    public void mo11929a(View view, long j) {
        if (view != null) {
            this.f1869wP = new WeakReference<>(view);
            this.f1870wQ = j;
            this.f1868wO.postDelayed(this.f1871wR, j);
            return;
        }
        throw null;
    }

    public void stop() {
        this.f1868wO.removeCallbacks(this.f1871wR);
    }
}
