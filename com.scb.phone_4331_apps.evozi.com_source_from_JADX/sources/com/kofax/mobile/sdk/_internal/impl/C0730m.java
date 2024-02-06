package com.kofax.mobile.sdk._internal.impl;

import android.content.Context;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.dagger.C0519a;
import com.kofax.mobile.sdk._internal.impl.event.C0699v;
import com.kofax.mobile.sdk._internal.impl.event.SurfaceChangedEvent;
import p040o.FragmentBuilder_BindEasycashReviewFragment;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;

@C0519a
/* renamed from: com.kofax.mobile.sdk._internal.impl.m */
public final class C0730m extends OrientationEventListener {
    private final IBus _bus;

    /* renamed from: wp */
    private final Display f1691wp;

    /* renamed from: wq */
    private boolean f1692wq;

    /* renamed from: wr */
    private C0699v f1693wr = null;

    @HmlPinActivity
    public C0730m(Context context, WindowManager windowManager, IBus iBus) {
        super(context);
        this.f1691wp = windowManager.getDefaultDisplay();
        this._bus = iBus;
        iBus.register(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onOrientationChanged(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r2 = r1.f1692wq     // Catch:{ all -> 0x0016 }
            if (r2 != 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            boolean r2 = r1.m1653hR()     // Catch:{ all -> 0x0016 }
            if (r2 == 0) goto L_0x0014
            com.kofax.mobile.sdk._internal.IBus r2 = r1._bus     // Catch:{ all -> 0x0016 }
            com.kofax.mobile.sdk._internal.impl.event.v r0 = r1.f1693wr     // Catch:{ all -> 0x0016 }
            r2.post(r0)     // Catch:{ all -> 0x0016 }
        L_0x0014:
            monitor-exit(r1)
            return
        L_0x0016:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.C0730m.onOrientationChanged(int):void");
    }

    @FragmentBuilder_BindEasycashReviewFragment
    /* renamed from: hQ */
    public final C0699v mo11755hQ() {
        C0699v vVar;
        synchronized (this) {
            start();
            m1653hR();
            vVar = this.f1693wr;
        }
        return vVar;
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    public final void onSurfaceChanged(SurfaceChangedEvent surfaceChangedEvent) {
        synchronized (this) {
            if (surfaceChangedEvent.hasSurface) {
                start();
            } else {
                stop();
            }
        }
    }

    private void start() {
        if (!this.f1692wq) {
            enable();
            this.f1692wq = true;
        }
    }

    private void stop() {
        if (this.f1692wq) {
            disable();
            this.f1692wq = false;
            this.f1693wr = null;
        }
    }

    /* renamed from: hR */
    private boolean m1653hR() {
        int rotation = this.f1691wp.getRotation();
        C0699v vVar = this.f1693wr;
        if (vVar != null && rotation == vVar.rotation) {
            return false;
        }
        this.f1693wr = new C0699v(rotation);
        return true;
    }
}
