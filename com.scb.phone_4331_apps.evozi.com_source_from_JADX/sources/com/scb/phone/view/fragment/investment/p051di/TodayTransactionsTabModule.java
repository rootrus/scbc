package com.scb.phone.view.fragment.investment.p051di;

import p040o.RegularImmutableBiMap;
import p040o.Sets;
import p040o.StreetViewPanoramaLink;
import p040o.getCropTetragon;
import p040o.setDestination;

/* renamed from: com.scb.phone.view.fragment.investment.di.TodayTransactionsTabModule */
public class TodayTransactionsTabModule {
    public getCropTetragon read(StreetViewPanoramaLink streetViewPanoramaLink, Sets.SetFromMap setFromMap, RegularImmutableBiMap regularImmutableBiMap) {
        return new setDestination(streetViewPanoramaLink, setFromMap, regularImmutableBiMap);
    }
}
