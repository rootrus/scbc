package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.impl.camera.focus.C0597k;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.h */
public final class C0838h implements OPRStatusRewardsLandingActivity_ViewBinding<C0597k> {

    /* renamed from: Yf */
    private final C0837g f2035Yf;

    public C0838h(C0837g gVar) {
        this.f2035Yf = gVar;
    }

    /* renamed from: sw */
    public final C0597k get() {
        C0597k sv = this.f2035Yf.mo12059sv();
        if (sv != null) {
            return sv;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C0838h m2098a(C0837g gVar) {
        return new C0838h(gVar);
    }

    /* renamed from: b */
    public static C0597k m2099b(C0837g gVar) {
        C0597k sv = gVar.mo12059sv();
        if (sv != null) {
            return sv;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
