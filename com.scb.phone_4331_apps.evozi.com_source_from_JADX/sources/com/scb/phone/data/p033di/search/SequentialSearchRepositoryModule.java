package com.scb.phone.data.p033di.search;

import com.scb.phone.data.network.service.search.SequentialSearchService;
import p040o.ByFunctionOrdering;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.HmlSetNTBPinActivity;
import p040o.onGetStartedClick;
import p040o.zzlr;

/* renamed from: com.scb.phone.data.di.search.SequentialSearchRepositoryModule */
public final class SequentialSearchRepositoryModule {
    @HmlSetNTBPinActivity
    public final ByFunctionOrdering read(SequentialSearchService sequentialSearchService, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        onGetStartedClick.write((Object) sequentialSearchService, "searchService");
        onGetStartedClick.write((Object) str, "tilesVersion");
        return new zzlr(sequentialSearchService, str);
    }
}
