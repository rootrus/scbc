package com.scb.phone.view.fragment.investment.p051di;

import p040o.RegularImmutableBiMap;
import p040o.Sets;
import p040o.StreetViewPanoramaLink;
import p040o.WscScanSetting;
import p040o.getCropTetragon;

/* renamed from: com.scb.phone.view.fragment.investment.di.AwaitingTransactionsTabModule */
public class AwaitingTransactionsTabModule {
    public getCropTetragon read(StreetViewPanoramaLink streetViewPanoramaLink, Sets.SetFromMap setFromMap, RegularImmutableBiMap regularImmutableBiMap) {
        return new WscScanSetting(streetViewPanoramaLink, setFromMap, regularImmutableBiMap);
    }
}
