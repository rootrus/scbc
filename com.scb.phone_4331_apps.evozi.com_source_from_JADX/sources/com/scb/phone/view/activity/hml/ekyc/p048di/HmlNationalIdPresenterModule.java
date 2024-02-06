package com.scb.phone.view.activity.hml.ekyc.p048di;

import p040o.Barcode;
import p040o.ByteStreams;
import p040o.RegularImmutableBiMap;
import p040o.addOnTabSelectedListener;
import p040o.getDataStoreName;
import p040o.getFrameSize;
import p040o.loadFinalizer;
import p040o.onGetStartedClick;
import p040o.setInlineLabelResource;
import p040o.setSelectedTabIndicator;

/* renamed from: com.scb.phone.view.activity.hml.ekyc.di.HmlNationalIdPresenterModule */
public final class HmlNationalIdPresenterModule {
    public final getFrameSize read(loadFinalizer loadfinalizer, setInlineLabelResource setinlinelabelresource, addOnTabSelectedListener addontabselectedlistener, setSelectedTabIndicator setselectedtabindicator, Barcode.UrlBookmark urlBookmark, ByteStreams.C31342 r15, RegularImmutableBiMap regularImmutableBiMap) {
        onGetStartedClick.write((Object) loadfinalizer, "ndidRpUploadPhotoCase");
        onGetStartedClick.write((Object) setinlinelabelresource, "hmlGetLaserIdCase");
        onGetStartedClick.write((Object) addontabselectedlistener, "hmlGetIssueDateCase");
        onGetStartedClick.write((Object) setselectedtabindicator, "hmlUploadCidPhotoCase");
        onGetStartedClick.write((Object) urlBookmark, "uploadNationalIdCase");
        onGetStartedClick.write((Object) r15, "nationalIdRequestMapper");
        RegularImmutableBiMap regularImmutableBiMap2 = regularImmutableBiMap;
        onGetStartedClick.write((Object) regularImmutableBiMap2, "errorDisplayMapper");
        return new getDataStoreName(loadfinalizer, setinlinelabelresource, addontabselectedlistener, setselectedtabindicator, urlBookmark, r15, regularImmutableBiMap2);
    }
}
