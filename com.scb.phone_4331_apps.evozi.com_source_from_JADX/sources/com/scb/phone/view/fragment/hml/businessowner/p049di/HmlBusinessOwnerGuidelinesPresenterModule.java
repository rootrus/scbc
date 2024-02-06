package com.scb.phone.view.fragment.hml.businessowner.p049di;

import p040o.LinkedHashMultiset;
import p040o.LinkedListMultimap;
import p040o.RegularImmutableBiMap;
import p040o.convertBytesToHex;
import p040o.getErrorMsg;
import p040o.onGetStartedClick;
import p040o.readCount;

/* renamed from: com.scb.phone.view.fragment.hml.businessowner.di.HmlBusinessOwnerGuidelinesPresenterModule */
public final class HmlBusinessOwnerGuidelinesPresenterModule {
    public final convertBytesToHex read(LinkedListMultimap.C35711 r2, RegularImmutableBiMap regularImmutableBiMap, LinkedHashMultiset linkedHashMultiset, readCount readcount) {
        onGetStartedClick.write((Object) r2, "controller");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) linkedHashMultiset, "hmlDocumentsController");
        onGetStartedClick.write((Object) readcount, "documentsMapper");
        return new getErrorMsg(r2, regularImmutableBiMap, linkedHashMultiset, readcount);
    }
}
