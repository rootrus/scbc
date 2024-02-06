package com.kofax.kmc.kut.utilities.error;

import com.kofax.kmc.kut.utilities.AppContextProvider;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.impl.event.C0700w;

public final class ErrorEventDelegate {
    private static IBus _bus;

    /* renamed from: bd */
    private static IBus m600bd() {
        if (_bus == null) {
            try {
                _bus = Injector.getInjector(AppContextProvider.getContext()).getIBus();
            } catch (Exception unused) {
            }
        }
        return _bus;
    }

    public static void postErrorInfoBusEvent(ErrorInfo errorInfo, String str) {
        IBus bd = m600bd();
        if (bd != null) {
            bd.post(new C0700w(errorInfo, str));
        }
    }
}
