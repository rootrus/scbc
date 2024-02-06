package com.scb.phone.view.fragment.hml.p050di;

import p040o.ByteStreams;
import p040o.C4199cn;
import p040o.DeviceProfileResponse;
import p040o.Iterables;
import p040o.RegularImmutableBiMap;
import p040o.logEventInternalNoInterceptor;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.hml.di.HmlNTBAccountConsentFragmentModule */
public final class HmlNTBAccountConsentFragmentModule {
    public final C4199cn IconCompatParcelizer(RegularImmutableBiMap regularImmutableBiMap, ByteStreams.ByteArrayDataOutputStream byteArrayDataOutputStream, logEventInternalNoInterceptor logeventinternalnointerceptor, Iterables.C352212 r5) {
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) byteArrayDataOutputStream, "productTermConditionDisplayMapper");
        onGetStartedClick.write((Object) logeventinternalnointerceptor, "productTermConditionCase");
        onGetStartedClick.write((Object) r5, "ekycEntryPointCase");
        return new DeviceProfileResponse(regularImmutableBiMap, byteArrayDataOutputStream, logeventinternalnointerceptor, r5);
    }
}
