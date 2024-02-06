package com.scb.phone.view.fragment.hml.p050di;

import p040o.BottomSheetBehavior;
import p040o.RegularImmutableBiMap;
import p040o.SwipeDismissBehavior;
import p040o.TextRecognizer;
import p040o.complementOf;
import p040o.getScanSettings;
import p040o.getVerySafeSoapProperty;
import p040o.setContentScrimColor;
import p040o.setItemIconTintList;
import p040o.setStatusBarScrimResource;
import p040o.setTimestampMillis;

/* renamed from: com.scb.phone.view.fragment.hml.di.HmlETBSummaryModule */
public class HmlETBSummaryModule {
    public getScanSettings IconCompatParcelizer(SwipeDismissBehavior swipeDismissBehavior, setItemIconTintList setitemicontintlist, setContentScrimColor setcontentscrimcolor, BottomSheetBehavior bottomSheetBehavior, TextRecognizer textRecognizer, complementOf complementof, RegularImmutableBiMap regularImmutableBiMap, setStatusBarScrimResource setstatusbarscrimresource, setTimestampMillis settimestampmillis) {
        return new getVerySafeSoapProperty(swipeDismissBehavior, setitemicontintlist, setstatusbarscrimresource, settimestampmillis, textRecognizer, setcontentscrimcolor, bottomSheetBehavior, complementof, regularImmutableBiMap);
    }
}
