package com.scb.phone.view.activity.hml.ekyc.p048di;

import p040o.C4193ck;
import p040o.Iterables;
import p040o.RegularImmutableBiMap;
import p040o.addHole;
import p040o.getBackendId;
import p040o.getIdType;
import p040o.onGetStartedClick;
import p040o.readFirstLine;
import p040o.setIconPadding;
import p040o.subListImpl;
import p040o.toStringBuilder;
import p040o.whenAll;

/* renamed from: com.scb.phone.view.activity.hml.ekyc.di.HmlNTBOpenAccountPresenterModule */
public final class HmlNTBOpenAccountPresenterModule {
    public final C4193ck read(RegularImmutableBiMap regularImmutableBiMap, whenAll whenall, toStringBuilder tostringbuilder, readFirstLine readfirstline, subListImpl sublistimpl, getIdType getidtype, addHole addhole, Iterables.C352212 r19, setIconPadding seticonpadding) {
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) whenall, "ntbLandingCase");
        onGetStartedClick.write((Object) tostringbuilder, "partnerTileMapper");
        onGetStartedClick.write((Object) readfirstline, "partnerTileEkycMapper");
        subListImpl sublistimpl2 = sublistimpl;
        onGetStartedClick.write((Object) sublistimpl2, "privacyConsentController");
        getIdType getidtype2 = getidtype;
        onGetStartedClick.write((Object) getidtype2, "iDeviceCompatibilityHelper");
        addHole addhole2 = addhole;
        onGetStartedClick.write((Object) addhole2, "ekycRouterCase");
        Iterables.C352212 r9 = r19;
        onGetStartedClick.write((Object) r9, "ekycEntryPointCase");
        setIconPadding seticonpadding2 = seticonpadding;
        onGetStartedClick.write((Object) seticonpadding2, "hmlVerifyIdentifyCase");
        return new getBackendId(regularImmutableBiMap, whenall, tostringbuilder, readfirstline, sublistimpl2, getidtype2, addhole2, r9, seticonpadding2);
    }
}
