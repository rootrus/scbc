package com.scb.phone.view.activity.hml.p047di;

import p040o.C10840getIndexFields;
import p040o.NavigationMenuView;
import p040o.RegularImmutableBiMap;
import p040o.isUserLoggedIn;
import p040o.onGetStartedClick;
import p040o.removeAllNodes;

/* renamed from: com.scb.phone.view.activity.hml.di.HmlNTBPinConsentPresenterModule */
public final class HmlNTBPinConsentPresenterModule {
    public final isUserLoggedIn IconCompatParcelizer(removeAllNodes removeallnodes, RegularImmutableBiMap regularImmutableBiMap, NavigationMenuView navigationMenuView) {
        onGetStartedClick.write((Object) removeallnodes, "hmlNcbConsentController");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) navigationMenuView, "verifyPinCase");
        return new C10840getIndexFields(removeallnodes, regularImmutableBiMap, navigationMenuView);
    }
}
