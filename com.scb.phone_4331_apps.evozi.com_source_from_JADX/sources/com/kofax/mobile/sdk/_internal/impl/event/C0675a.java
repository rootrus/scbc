package com.kofax.mobile.sdk._internal.impl.event;

import com.kofax.mobile.sdk._internal.C0767k;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p040o.FragmentBuilder_BindEasycashReferralSendDfwFragment;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.event.a */
public class C0675a {

    /* renamed from: Ip */
    private final List<C0679ag> f1608Ip = new CopyOnWriteArrayList();

    /* renamed from: vU */
    private final FragmentBuilder_BindEasycashReferralSendDfwFragment f1609vU;

    @HmlPinActivity
    public C0675a(FragmentBuilder_BindEasycashReferralSendDfwFragment fragmentBuilder_BindEasycashReferralSendDfwFragment) {
        this.f1609vU = fragmentBuilder_BindEasycashReferralSendDfwFragment;
    }

    /* renamed from: a */
    public void mo11614a(C0679ag agVar) {
        if (!this.f1608Ip.contains(agVar)) {
            this.f1608Ip.add(agVar);
            this.f1609vU.register(agVar);
        }
    }

    /* renamed from: a */
    public void mo11615a(Object obj, Class<?> cls) {
        for (C0679ag next : this.f1608Ip) {
            if (next.mo11619mp().equals(cls) && next.mo11618mo().equals(obj)) {
                try {
                    this.f1609vU.unregister(next);
                    this.f1608Ip.remove(next);
                    return;
                } catch (Exception e) {
                    C0767k.m1821e("ApiEventManager", "unregisterWrapper exception", (Throwable) e);
                    return;
                }
            }
        }
    }
}
