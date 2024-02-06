package com.kofax.mobile.sdk.p012ah;

import android.content.Context;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.bl */
public final class C0828bl implements OPRStatusRewardsLandingActivity_ViewBinding<Context> {

    /* renamed from: Yi */
    private final C0844o f2020Yi;

    public C0828bl(C0844o oVar) {
        this.f2020Yi = oVar;
    }

    /* renamed from: tt */
    public final Context get() {
        Context sz = this.f2020Yi.mo12113sz();
        if (sz != null) {
            return sz;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public static C0828bl m2063c(C0844o oVar) {
        return new C0828bl(oVar);
    }

    /* renamed from: d */
    public static Context m2064d(C0844o oVar) {
        Context sz = oVar.mo12113sz();
        if (sz != null) {
            return sz;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
