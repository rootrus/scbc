package com.kofax.mobile.sdk._internal.impl;

import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.impl.event.C0682aj;
import p040o.FragmentBuilder_BindEasycashReferralSendDfwFragment;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;

/* renamed from: com.kofax.mobile.sdk._internal.impl.h */
public class C8187h {

    /* renamed from: vU */
    private final FragmentBuilder_BindEasycashReferralSendDfwFragment f4237vU;

    public C8187h(FragmentBuilder_BindEasycashReferralSendDfwFragment fragmentBuilder_BindEasycashReferralSendDfwFragment) {
        this.f4237vU = fragmentBuilder_BindEasycashReferralSendDfwFragment;
        fragmentBuilder_BindEasycashReferralSendDfwFragment.register(this);
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.h$1 */
    static /* synthetic */ class C81881 {

        /* renamed from: vV */
        static final /* synthetic */ int[] f4238vV;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.kofax.mobile.sdk._internal.impl.event.aj$a[] r0 = com.kofax.mobile.sdk._internal.impl.event.C0682aj.C0683a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4238vV = r0
                com.kofax.mobile.sdk._internal.impl.event.aj$a r1 = com.kofax.mobile.sdk._internal.impl.event.C0682aj.C0683a.DEBUG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4238vV     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.mobile.sdk._internal.impl.event.aj$a r1 = com.kofax.mobile.sdk._internal.impl.event.C0682aj.C0683a.ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4238vV     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.mobile.sdk._internal.impl.event.aj$a r1 = com.kofax.mobile.sdk._internal.impl.event.C0682aj.C0683a.VERBOSE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.C8187h.C81881.<clinit>():void");
        }
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo54594a(C0682aj ajVar) {
        int i = C81881.f4238vV[ajVar.f1620IQ.ordinal()];
        if (i == 1) {
            C0767k.m1801b(ajVar.tag, ajVar.message);
        } else if (i != 2) {
            C0767k.m1796a(ajVar.tag, ajVar.message);
        } else {
            C0767k.m1821e(ajVar.tag, ajVar.message, ajVar.f1621IR);
        }
    }
}
