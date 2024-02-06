package com.kofax.mobile.sdk._internal.impl;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.impl.event.C0686au;
import p040o.FragmentBuilder_BindEasycashReferralSendDfwFragment;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.FragmentBuilder_BindEditAddressStatementChannelFragment;
import p040o.HmlPinActivity;
import p040o.HmlSetNTBPinActivity;

@HmlSetNTBPinActivity
/* renamed from: com.kofax.mobile.sdk._internal.impl.j */
public class C0727j extends FragmentBuilder_BindEasycashReferralSendDfwFragment implements IBus {
    @HmlPinActivity
    public C0727j() {
        super(FragmentBuilder_BindEditAddressStatementChannelFragment.IconCompatParcelizer);
        register(this);
    }

    public void post(Object obj) {
        try {
            super.post(obj);
        } catch (RuntimeException e) {
            m1648a(e);
        }
    }

    public void register(Object obj) {
        try {
            super.register(obj);
        } catch (RuntimeException e) {
            m1648a(e);
        }
    }

    public void unregister(Object obj) {
        try {
            super.unregister(obj);
        } catch (RuntimeException e) {
            m1648a(e);
        }
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: a */
    public void mo11753a(C0686au auVar) {
        throw auVar.f1626Jj;
    }

    /* renamed from: a */
    private void m1648a(RuntimeException runtimeException) {
        try {
            super.post(new C0686au(runtimeException));
        } catch (RuntimeException e) {
            m1649b(e);
        }
    }

    /* renamed from: b */
    private void m1649b(RuntimeException runtimeException) {
        if (runtimeException != null) {
            if (runtimeException instanceof KmcRuntimeException) {
                throw runtimeException;
            }
            m1649b((RuntimeException) runtimeException.getCause());
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_UNKNOWN_ERROR, runtimeException);
        }
    }
}
