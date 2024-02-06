package com.kofax.mobile.sdk.p025n;

import com.kofax.android.abc.machine_vision.TrackedDocument;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk.p026o.C0981a;
import com.kofax.mobile.sdk.p026o.C0982b;
import com.kofax.mobile.sdk.p026o.C0985f;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

/* renamed from: com.kofax.mobile.sdk.n.j */
public class C0979j implements C0981a {
    private static final String TAG = C0979j.class.getSimpleName();

    /* renamed from: HP */
    private final C0981a f2374HP;

    @HmlPinActivity
    C0979j(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "NATIVE") C0981a aVar) {
        this.f2374HP = aVar;
    }

    /* renamed from: a */
    public void mo12392a(C0982b bVar) {
        this.f2374HP.mo12392a(bVar);
    }

    /* renamed from: a */
    public TrackedDocument mo12371a(C0985f fVar) {
        TrackedDocument a = this.f2374HP.mo12371a(fVar);
        if (a == null) {
            return null;
        }
        if (a.IsComplete()) {
            return a;
        }
        C0767k.m1801b(TAG, "!IsComplete(), returning null");
        return null;
    }

    public void destroy() {
        this.f2374HP.destroy();
    }
}
