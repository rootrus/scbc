package com.kofax.mobile.sdk._internal.impl;

import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.impl.event.PreviewImageReadyBusEvent;
import com.kofax.mobile.sdk._internal.impl.event.RealtimeVideoEvent;
import p040o.FragmentBuilder_BindEasycashSalesheetIndexFragment;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.aa */
public class C0533aa {
    private final IBus _bus;

    @HmlPinActivity
    public C0533aa(IBus iBus) {
        this._bus = iBus;
        iBus.register(this);
    }

    @FragmentBuilder_BindEasycashSalesheetIndexFragment
    /* renamed from: b */
    public void mo11413b(PreviewImageReadyBusEvent previewImageReadyBusEvent) {
        this._bus.post(new RealtimeVideoEvent(previewImageReadyBusEvent));
    }
}
