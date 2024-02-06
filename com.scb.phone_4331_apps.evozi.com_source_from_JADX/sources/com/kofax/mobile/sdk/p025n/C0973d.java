package com.kofax.mobile.sdk.p025n;

import com.kofax.android.abc.machine_vision.TrackedDocument;
import com.kofax.mobile.sdk.p025n.C0971c;
import com.kofax.mobile.sdk.p026o.C0981a;
import com.kofax.mobile.sdk.p026o.C0983c;
import com.kofax.mobile.sdk.p026o.C0985f;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

/* renamed from: com.kofax.mobile.sdk.n.d */
public class C0973d implements C0983c {

    /* renamed from: Ig */
    private static final C0971c.C0972a[] f2364Ig = C0971c.C0972a.values();

    /* renamed from: HP */
    private final C0981a f2365HP;

    /* renamed from: HQ */
    private final C0971c f2366HQ = new C0971c();

    @HmlPinActivity
    C0973d(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DOCUMENT") C0981a aVar) {
        this.f2365HP = aVar;
    }

    /* renamed from: a */
    public TrackedDocument mo12371a(C0985f fVar) {
        for (C0971c.C0972a a : f2364Ig) {
            this.f2366HQ.mo12378a(a);
            this.f2365HP.mo12392a(this.f2366HQ);
            TrackedDocument a2 = this.f2365HP.mo12371a(fVar);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public void destroy() {
        this.f2365HP.destroy();
    }
}
