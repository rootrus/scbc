package com.scb.phone.view.fragment.ntb.selectaccount.p052di;

import p040o.ByteStreams;
import p040o.C4199cn;
import p040o.Iterables;
import p040o.RegularImmutableBiMap;
import p040o.logEventInternalNoInterceptor;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.ntb.selectaccount.di.ProductTermConditionFragmentModule */
public final class ProductTermConditionFragmentModule {
    public final C4199cn MediaBrowserCompat$CustomActionResultReceiver(RegularImmutableBiMap regularImmutableBiMap, ByteStreams.ByteArrayDataOutputStream byteArrayDataOutputStream, logEventInternalNoInterceptor logeventinternalnointerceptor, Iterables.C352212 r5) {
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) byteArrayDataOutputStream, "productTermConditionDisplayMapper");
        onGetStartedClick.write((Object) logeventinternalnointerceptor, "productTermConditionCase");
        onGetStartedClick.write((Object) r5, "ekycEntryPointCase");
        return new C4199cn(regularImmutableBiMap, byteArrayDataOutputStream, logeventinternalnointerceptor, r5);
    }
}
