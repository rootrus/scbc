package com.kofax.mobile.sdk._internal.dagger;

import com.kofax.mobile.sdk.capture.IImageStorage;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.dagger.g */
public final class C7897g implements OPRStatusRewardsLandingActivity_ViewBinding<IImageStorage> {

    /* renamed from: vJ */
    private final C0525e f3659vJ;

    public C7897g(C0525e eVar) {
        this.f3659vJ = eVar;
    }

    /* renamed from: hn */
    public final IImageStorage get() {
        IImageStorage iImageStorage = this.f3659vJ.getIImageStorage();
        if (iImageStorage != null) {
            return iImageStorage;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C7897g m3833b(C0525e eVar) {
        return new C7897g(eVar);
    }

    /* renamed from: c */
    public static IImageStorage m3834c(C0525e eVar) {
        IImageStorage iImageStorage = eVar.getIImageStorage();
        if (iImageStorage != null) {
            return iImageStorage;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
